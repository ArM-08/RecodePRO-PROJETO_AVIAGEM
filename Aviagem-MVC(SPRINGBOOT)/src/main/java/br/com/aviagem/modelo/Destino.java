package br.com.aviagem.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Destino {
	

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

		@Column (nullable = false)
		private String nome;
		
		@Column (nullable = false)
		private Long preco;

		
		public Destino() {
		
	}
		public Destino(Long id, String nome, Long preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
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
		public Long getPreco() {
			return preco;
		}
		public void setPreco(Long preco) {
			this.preco = preco;
		}
	
		 @Override
		    public int hashCode() {
		        final int prime = 31;
		        int result = 1;
		        result = prime * result + ((id == null) ? 0 : id.hashCode());
		        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		        result = prime * result + ((preco == null) ? 0 : preco.hashCode());
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
		        Destino other = (Destino) obj;
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
		        if (preco == null) {
		            if (other.preco != null)
		                return false;
		        } else if (!preco.equals(other.preco))
		            return false;
		        return true;
		    }
		
		@Override
		
		public String toString() {
			return "Cliente [id=" + id +", nome=" + nome + ", preco="+ preco + "]"; 
		}

		}


