package crud;
import java.io.IOException;
import java.util.Scanner;
import modelo.Permissoes;
import dao.permissoesDAO;

public class permissoesCrud {

	 public static void main(String[] args) throws IOException, InterruptedException {
	        Scanner entrada = new Scanner(System.in);
	        int opc = 0;
	        permissoesDAO permissaodao = new permissoesDAO();
	        Permissoes permissao = new Permissoes();
	        
	        while (opc != 5) {
	            System.out.println("===== Bem vindo a AVIAGEM =====");
	            System.out.println("1-Cadastrar uma permissao");
	            System.out.println("2-Excluir um permissao");
	            System.out.println("3-Mostrar permissao");
	            System.out.println("4-Atualizar permissao");
	            System.out.println("5-Sair");
	            System.out.println("==============================");
	            opc = entrada.nextInt();

	            switch (opc) {
	                case 1:
	                    do {
	                    	try {
	                		System.out.println("Digite o id da permissao");
	                		permissao.setId(entrada.nextInt());
	                		System.out.println("Digite o tipo de permissao");
	                		permissao.setTipo(entrada.next());
	                		permissaodao.save(permissao);
	                        System.out.println("Permissao cadastrado com sucesso!");
	                    	 } catch (Exception e) {
	                        	  System.out.println("Permissao já cadastrado");
	                          }
	                        System.out.println("Deseja cadastrar mais permissao? 1-S / 2-N");
	                        opc = entrada.nextInt();     
	                    } while (opc == 1);
	                    break;
	             
	                case 2:
	  	                    do {      
		                        System.out.println("Digite o id da permissao que deseja excluir:");
		                        int id = entrada.nextInt();
		                        System.out.println("Digite o tipo da permissao");
		                        String nome = entrada.next();
		                        permissaodao.removeByNome(id, nome);
		                        System.out.println("Permissao excluido com sucesso!");
		                        System.out.println("Deseja excluir mais permissao? 1-S / 2-N");
		                        opc = entrada.nextInt();
		                       
		                    } while (opc == 1);
		                    break;
		                case 3:
		                  
		                    System.out.println("=== Permissões ===");
		                    for (Permissoes c : permissaodao.getPermissao()) {
		         	           System.out.println("ID Permissao: " + c.getId());
		         	           System.out.println("Tipo: " + c.getTipo());       
		         	           System.out.println("----------------------------------- ");
		                    }
		                    break;
		                case 4:
		                	 do {
		                	System.out.println("Digite o id da permissao que deseja atualizar:");
		                	
		                	permissao.setId(entrada.nextInt());
		                	System.out.println("Digite o novo Tipo:");
		                	permissao.setTipo(entrada.next());
		            		System.out.println("Digite o novo ID:");
		            		permissao.setId(entrada.nextInt());
		            		
		            		permissaodao.update(permissao);   
		            		
		            		  System.out.println("Deseja atualizar mais permissoes? 1-S / 2-N");
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
	        