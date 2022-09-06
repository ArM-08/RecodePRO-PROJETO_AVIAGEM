package modelo;

public class Destinos {


    private int idDestinos;
    private String nome;
    private double preco;
    
    public int getIDDestinos(){
        return idDestinos;
    }
    public void setIDDestinos(int destino){
        this.idDestinos = destino;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public double getPreco(){
        return preco;
    }
    public void setPreco (double preco){
        this.preco = preco;
    }

}

