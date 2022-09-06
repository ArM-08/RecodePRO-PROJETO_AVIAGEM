package crud;
import java.io.IOException;
import java.util.Scanner;
import dao.carrinhoDAO;
import modelo.Carrinho;
import modelo.Cliente;

public class carrinhoCrud {

	 public static void main(String[] args) throws IOException, InterruptedException {
	        Scanner entrada = new Scanner(System.in);
	        int opc = 0;
	        carrinhoDAO carrinhodao = new carrinhoDAO();
	        Carrinho carrinho = new Carrinho();
	        Cliente login = new Cliente();
	        System.out.println("Digite seu Login");
	        login.setIDLogin(entrada.next());
	        
	        while (opc != 5) {
	            System.out.println("===== Bem vindo a AVIAGEM =====");
	            System.out.println("1-Cadastrar um carrinho");
	            System.out.println("2-Excluir um carrinho");
	            System.out.println("3-Mostrar carrinho");
	            System.out.println("4-Atualizar carrinho");
	            System.out.println("5-Sair");
	            System.out.println("==============================");
	            opc = entrada.nextInt();

	            switch (opc) {
	                case 1:
	                    do {
	                    	try {
	                		System.out.println("Digite o valor total do carrinho");
	                		carrinho.setTotal(entrada.nextDouble());    
	                		carrinho.setCliente(login);
	                		System.out.println("Digite o dia da compra");
	                		carrinho.setdataCompra(entrada.next());
	                		carrinhodao.save(carrinho);
	                        System.out.println("Carrinho cadastrado com sucesso!");
	                    	 } catch (Exception e) {
	                        	  System.out.println("Carrinho já cadastrado");
	                          }
	                        System.out.println("Deseja cadastrar mais carrinhos? 1-S / 2-N");
	                        opc = entrada.nextInt();     
	                    } while (opc == 1);
	                    break;
	             
	                case 2:
	                    do {      
	                      System.out.println("Digite o id do carrinho que deseja excluir:");
	                      int id = entrada.nextInt();
	                      carrinhodao.removeByNome(id);
	                      System.out.println("Carrinho excluido com sucesso!");
	                      System.out.println("Deseja excluir mais carrinho? 1-S / 2-N");
	                      opc = entrada.nextInt();
	                     
	                  } while (opc == 1);
	                  break;
	              case 3:
	                
	                  System.out.println("=== Carrinhos ===");
	                  for (Carrinho c : carrinhodao.getCarrinho()) {
	                      System.out.println("ID Carrinho: " + c.getidCarrinho());
	                      System.out.println("Valor Total: " + c.getTotal());       
	                      System.out.println("----------------------------------- ");
	                  }
	                  break;
	              case 4:
	              	 do {
	              	System.out.println("Digite o id do carrinho que deseja atualizar:");
	              	
	              	carrinho.setidCarrinho(entrada.nextInt());
	              	System.out.println("Digite o novo Tipo:");
	              	carrinho.setTotal(entrada.nextDouble());
	              	System.out.println("Digite o novo ID:");
	              	carrinho.setidCarrinho(entrada.nextInt());
	              	
	              	carrinhodao.update(carrinho);   
	              	
	              	  System.out.println("Deseja atualizar mais carrinhos? 1-S / 2-N");
	                    opc = entrada.nextInt();
	                   
	                } while (opc == 1);
	                break;
	              case 5:
	                  System.out.println("=== OBRIGADO POR UTILIZAR AVIAGEM ===");
	                  break;
	              default:
	                  System.out.println("Opção não encontrada");
	              }
	              }entrada.close();
	              }             

	              }

