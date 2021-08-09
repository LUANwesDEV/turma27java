package com.generation.lojagames.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity    								 //PARA INDICAR QUE É UMA ENTIDADE!!
@Table(name = "tb_usuarios")			 //VAI GERAR A TABELA NO BANCO DE DADOS
public class Usuario {

	@Id									 //CHAVE PRIMARIA
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMET
	private long id;
	
	@NotBlank     //NÃO PODER SER EM BRANCO
	private String nome;
	
	@NotNull     //TEM QUE PREENCHER 
	private String usuario;
	
	@NotNull
	@Size(min=6)
	private String senha;
	
	@Column(name = "data_nascimento") //ELA SERVE PARA RENOMEAR O ATRIBUTO NO BANCO DE DADOS!! TAMBÉM VAI DEFINIR O NOME NO BANCO EM TUDO MINUSCULO!
	@JsonFormat(pattern = "yyyy-MM-dd")  //FORMATAR PARA DEIXAR PADRÃO DO MYSQL,
	private LocalDate dataNascimento;  // o LOCALDATE tem uma série de métodos que podemos está utilizando.TAMBÉM serve para verificar se o usuário é maior de idade!!	

	//relacionamento entre usuario e produto !!
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.REMOVE) //o @OneToMany sempre vai ser uma lista e o @ManyToOne sempre vai ser um objeto!
	@JsonIgnoreProperties("usuario")								//@JsonIgnoreProperties serve para não ter recursividade, não ficar rodando sem parar os objetos!
	private List<Produto> produto;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
