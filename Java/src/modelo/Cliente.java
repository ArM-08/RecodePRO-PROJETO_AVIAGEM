package modelo;


public class Cliente {
	
	    private String idlogin;
	    private String nome;
	    private String senha;
	    private String email;
	   
	    private Permissoes permissoes;
		
	 
	    public String getIDLogin(){
	        return idlogin;
	    }
	    public void setIDLogin(String id){
	        this.idlogin = id;
	    }
	    public String getNome(){
	        return nome;
	    }
	    public void setNome(String nome){
	        this.nome = nome;

	    }
	    public String getSenha(){
	        return senha;
	    }
	    public void setSenha (String senha){
	        this.senha = senha;
	    }
	    public String getEmail(){
	        return email;
	    }
	    public void setEmail (String email){
	        this.email = email;
	    }
	    public void setPermissoes(Permissoes permissoes) {
			this.permissoes = permissoes;
		}
		
		public Permissoes getPermissoes() {
			return permissoes;
		}
		
		//metodos
		public String mostrar() {
			return "idlogin: "+ this.idlogin +" Nome: " +this.nome 
					+ " Email: " + this.email 
					+ " Senha: " + this.senha
					+ " Tipo permiss�o: " + this.permissoes.getTipo(); 
		}
	}

