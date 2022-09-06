package modelo;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Carrinho {

    private int idCarrinho;
    
    private double valorTotal;
    private Cliente idlogin;
    private LocalDate dataCompra;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Carrinho(int idCarrinho, Date dataCompra, Double valorTotal, Cliente idlogin) {
    	this.idCarrinho = idCarrinho;
    	this.dataCompra = LocalDate.parse((CharSequence) dataCompra, formatter);
    	this.valorTotal = valorTotal;
    	
    }
    ;
    public Carrinho() {
    	
    };
    
    public int getidCarrinho(){
        return idCarrinho;
    }
    public void setidCarrinho(int idcarrinho){
        this.idCarrinho = idcarrinho;
    }
    public double getTotal(){
        return valorTotal;
    }
    public void setTotal(double total){
        this.valorTotal = total;
    }
    public String getdataCompra() {
		return formatter.format(dataCompra);
	}

	public void setData_compra(String dataCompra) {
		this.dataCompra = LocalDate.parse(dataCompra, formatter);
	}

  
    public void setCliente(Cliente idlogin) {
		this.idlogin = idlogin;
	}
	
	public Cliente getCliente() {
		return idlogin;
	}
}


