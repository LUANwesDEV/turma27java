package com.generation.lojagames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {  //o long seria a minha chave primaria!

	public Optional<Usuario> findByUsuario (String usuario); // o Optional ele é usuado para ter uma opção de que pode encontrar o usuario ou não!
	//select * from tb_usuario where usuario = "xxxxx";
}
