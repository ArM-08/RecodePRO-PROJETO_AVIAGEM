package br.com.aviagem.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private String senha;
	
	@Column (nullable = false)
	private String email;
	
	@Lob
	private byte [] imagem;
	
	public Cliente() {
	
}
	public Cliente (Long id, String nome, String senha, String email) {
	this.id = id;
	this.nome = nome;
	this.senha = senha;
	this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	
	public String getNome () {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
			
	} 
	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	
		
	}
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((id == null) ? 0 : id.hashCode());
	        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
	        result = prime * result + ((email == null) ? 0 : email.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Cliente other = (Cliente) obj;
	        if (id == null) {
	            if (other.id != null)
	                return false;
	        } else if (!id.equals(other.id))
	            return false;
	        if (nome == null) {
	            if (other.nome != null)
	                return false;
	        } else if (!nome.equals(other.nome))
	            return false;
	        if (senha == null) {
	            if (other.senha != null)
	                return false;
	        } else if (!senha.equals(other.senha))
	            return false;
	        if (email == null) {
	            if (other.email != null)
	                return false;
	        } else if (!email.equals(other.email))
	            return false;
	        return true;
	    }
	
	@Override
	
	public String toString() {
		return "Cliente [id=" + id +", nome=" + nome + ", senha="+ senha + ", email" + email + "]";
	}

	}

