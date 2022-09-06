package crud;

import java.io.IOException;
import java.util.Scanner;
import modelo.Destinos;
import dao.destinoDAO;

public class destinoCrud {

	 public static void main(String[] args) throws IOException, InterruptedException {
	        Scanner entrada = new Scanner(System.in);
	        int opc = 0;
	        destinoDAO destinodao = new destinoDAO();
	        Destinos destino = new Destinos();
	        
	        while (opc != 5) {
	            System.out.println("===== Bem vindo a AVIAGEM =====");
	            System.out.println("1-Cadastrar um Destino");
	            System.out.println("2-Consultar um Destino");
	            System.out.println("3-Excluir um Destino");
	            System.out.println("4-Mostrar Destino");
	            System.out.println("5-Atualizar Destino");
	            System.out.println("6-Sair");
	            System.out.println("==============================");
	            opc = entrada.nextInt();

	            switch (opc) {
	                case 1:
	                    do {
	                    	try {
	                		System.out.println("Digite o nome do destino");
	                		destino.setNome(entrada.next());
	                		System.out.println("Digite seu preço");
	                		destino.setPreco(entrada.nextDouble());
	                		destinodao.save(destino);
	                        System.out.println("Destino cadastrado com sucesso!");
	                    	 } catch (Exception e) {
	                        	  System.out.println("Destino já cadastrado");
	                          }
	                        System.out.println("Deseja cadastrar mais destino? 1-S / 2-N");
	                        opc = entrada.nextInt();     
	                    } while (opc == 1);
	                    break;
	                case 2:
	                	  do {
	                		  try {
	                          System.out.println("Digite um nome para consultar:");   
	                          String nome = entrada.next(); 
	                          for (Destinos b : destinodao.getBusca(nome)) {
	                        	   System.out.println("ID: " + b.getIDDestinos());
	                	           System.out.println("NOME: " + b.getNome());
	                	           System.out.println("PREÇO: " + b.getPreco());      
	                	           System.out.println("----------------------------------- ");      	
	                   }
	                          } catch (Exception e) {
	                        	  System.out.println("Nome não cadastrado");
	                          }
	                	   
	                          System.out.println("Deseja consultar mais destinos? 1-S / 2-N");
	                          opc = entrada.nextInt();
	                      } while (opc == 1);
	                      break; 
	                      
	                case 3:
	  	                    do {      
		                        System.out.println("Digite o Destino que deseja excluir:");
		                        String nome = entrada.next();
		                        System.out.println("Digite o id");
		                        int id = entrada.nextInt();
		                        destinodao.removeByNome(id, nome);
		                        System.out.println("Destino excluido com sucesso!");
		                        System.out.println("Deseja excluir mais destinos? 1-S / 2-N");
		                        opc = entrada.nextInt();
		                       
		                    } while (opc == 1);
		                    break;
		                case 4:
		                  
		                    System.out.println("=== Destinos ===");
		                    for (Destinos c : destinodao.getDestino()) {
		         	           System.out.println("IDDESTINO: " + c.getIDDestinos());
		         	           System.out.println("Nome: " + c.getNome());
		         	           System.out.println("PREÇO: " + c.getPreco());
		         	           System.out.println("----------------------------------- ");
		                    }
		                    break;
		                case 5:
		                	 do {
		                	System.out.println("Digite o id do destino que deseja atualizar:");
		                	
		                	destino.setIDDestinos(entrada.nextInt());
		                	System.out.println("Digite o novo nome:");
		                	destino.setNome(entrada.next());
		            		System.out.println("Digite o novo preço:");
		            		destino.setPreco(entrada.nextDouble());
		            		
		            		destinodao.update(destino);   
		            		
		            		  System.out.println("Deseja atualizar mais destinos? 1-S / 2-N");
		                      opc = entrada.nextInt();
		                     
		                  } while (opc == 1);
		                  break;
		                case 6:
		                    System.out.println("=== OBRIGADO POR UTILIZAR AVIAGEM ===");
		                    break;
		                default:
		                    System.out.println("Opção não encontrada");
	            }
	        }entrada.close();
	    }             
	    
	}
	        