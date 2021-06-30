package org.generation.BlogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message="O Nome precisa ser preenchido")
	private String nome;
	
	@NotEmpty(message="O usuario precisa ser preenchido")
	private String usuario;
	
	@NotEmpty(message="A senha precisa ser preenchida")
	private String senha;
	
	private String foto;
	
	private String tipo;
	
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;
	

	public Usuario(long id, @NotEmpty(message = "O Nome precisa ser preenchido") String nome,
			@NotEmpty(message = "O usuario precisa ser preenchido") String usuario,
			@NotEmpty(message = "A senha precisa ser preenchida") String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public Usuario(@NotEmpty(message = "O Nome precisa ser preenchido") String nome,
			@NotEmpty(message = "O usuario precisa ser preenchido") String usuario,
			@NotEmpty(message = "A senha precisa ser preenchida") String senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}



	public Usuario() {
	
	}


	//getters and setters
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


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<Postagem> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
}