package com.generation.lojagames.service;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.model.UsuarioLogin;
import com.generation.lojagames.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional <Usuario> cadastrarUsuario(Usuario usuario){
		
		if(usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) 
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O usuario ja existe ", null); // o throw é usado para força um erro, para mostrar um erro na tela do usuario.
		
		int idade = Period.between(usuario.getDataNascimento(), LocalDate.now()).getYears(); // vai mostrar a idade do usuario em anos!
		
		if(idade < 18)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O Usuario é menos de idade! ", null); 
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //esse metodo vem da dependencia commons-codec, ele que vai fazer a a minha senha criptografada !
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);    // a senha que o usuario digitar fazer salva no senhaEncoder, para criptografar a senha é ultilizado o setSenha, que vai tirar a senha do usuario e atualizara ja com a senha criptografada no lugar!!
		 
		return Optional.of(usuarioRepository.save(usuario)); // o Optional.of seria para retornar
		
	}
	public Optional <Usuario> atualizarUsuario(Usuario usuario){
		
		if(usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) {
			
			int idade = Period.between(usuario.getDataNascimento(), LocalDate.now()).getYears(); // vai mostrar a idade do usuario em anos!
			
			if(idade < 18)
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O Usuario é menos de idade! ", null);
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
			
			String senhaEncoder = encoder.encode(usuario.getSenha());
			usuario.setSenha(senhaEncoder);   
			
			return Optional.of(usuarioRepository.save(usuario)); 
		}else {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "O usuario não encontrado! ", null); 
			
		}
	}
	
	public Optional<UsuarioLogin> loginUsuario(Optional <UsuarioLogin> usuarioLogin){
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
		Optional<Usuario> usuario = usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());
		
		if (usuario.isPresent()) {
			
			if(encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha())){  // o metches é um metodo que ja faz a comparação entre as duas classes.
				
				String auth = usuarioLogin.get().getUsuario() + ":" + usuarioLogin.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				
				usuarioLogin.get().setId(usuario.get().getId());
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setSenha(usuario.get().getSenha());
				usuarioLogin.get().setToken(authHeader); // o token seria uma chave de segurança que serve para autorizar e executar os metodos da API
				
				return usuarioLogin;
			}
		}
		throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Usuario ou senha invalidos! ", null); 
	}
}
