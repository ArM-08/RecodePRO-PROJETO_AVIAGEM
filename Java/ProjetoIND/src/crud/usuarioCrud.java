package crud;

import java.io.IOException;
import java.util.Scanner;
import dao.usuarioDAO;
import modelo.Cliente;
import modelo.Permissoes;
public class usuarioCrud {

	    public static void main(String[] args) throws IOException, InterruptedException {
	        Scanner entrada = new Scanner(System.in);
	        int opc = 0;
	        usuarioDAO clientedao = new usuarioDAO();
	        Cliente clientes = new Cliente();
	        Permissoes permissoes = new Permissoes();
	        permissoes.setId(2);
	        
	        while (opc != 6) {
	            System.out.println("===== Bem vindo a AVIAGEM =====");
	            System.out.println("1-Cadastrar um Usuario");
	            System.out.println("2-Consultar um Usuario");
	            System.out.println("3-Excluir um Usuario");
	            System.out.println("4-Mostrar Usuario");
	            System.out.println("5-Atualizar Usuario");
	            System.out.println("6-Sair");
	            System.out.println("==============================");
	            opc = entrada.nextInt();

	            switch (opc) {
	                case 1:
	                    do {
	                    	try {
	                        System.out.println("Cadastre um IDLOGIN:");
	                        clientes.setIDLogin(entrada.next());
	                		System.out.println("Cadastre sua senha");
	                		clientes.setSenha(entrada.next());
	                		System.out.println("Digite seu nome");
	                		clientes.setNome(entrada.next());
	                		System.out.println("Digite seu Email");
	                		clientes.setEmail(entrada.next());
	                		clientes.setPermissoes(permissoes);
	                		clientedao.save(clientes);
	                        System.out.println("Cliente cadastrado com sucesso!");
	                    	 } catch (Exception e) {
	                        	  System.out.println("IDLOGIN já cadastrado");
	                          }
	                        System.out.println("Deseja cadastrar mais nomes? 1-S / 2-N");
	                        opc = entrada.nextInt();     
	                    } while (opc == 1);
	                    break;
	                case 2:
	                	  do {
	                		  try {
	                          System.out.println("Digite o IDLOGIN para consultar:");   
	                          String nome = entrada.next(); 
	                          for (Cliente b : clientedao.getBusca(nome)) {
	                        	   System.out.println("ID: " + b.getIDLogin());
	                	           System.out.println("NOME: " + b.getNome());
	                	           System.out.println("TELEFONE: " + b.getEmail());      
	                	           System.out.println("----------------------------------- ");      	
	                   }
	                          } catch (Exception e) {
	                        	  System.out.println("Nome não cadastrado");
	                          }
	                	   
	                          System.out.println("Deseja consultar mais nomes? 1-S / 2-N");
	                          opc = entrada.nextInt();
	                      } while (opc == 1);
	                      break; 
	                      
	                case 3:
	  	                    do {      
		                        System.out.println("Digite o IDLOGIN que deseja excluir:");
		                        String nome = entrada.next();
		                        System.out.println("Digite a senha");
		                        String senha = entrada.next();
		                        clientedao.removeByNome(nome, senha);
		                        System.out.println("Contato excluido com sucesso!");
		                        System.out.println("Deseja excluir mais clientes? 1-S / 2-N");
		                        opc = entrada.nextInt();
		                       
		                    } while (opc == 1);
		                    break;
		                case 4:
		                  
		                    System.out.println("=== Usuarios ===");
		                    for (Cliente c : clientedao.getCliente()) {
		         	           System.out.println("IDLOGIN: " + c.getIDLogin());
		         	           System.out.println("Nome: " + c.getNome());
		         	           System.out.println("CPF: " + c.getEmail());
		         	           System.out.println("----------------------------------- ");
		                    }
		                    break;
		                case 5:
		                	 do {
		                	System.out.println("Digite o idLOGIN que deseja atualizar:");
		                	Cliente cliente = new Cliente();
		                	cliente.setIDLogin(entrada.next());
		                	System.out.println("Digite o novo nome:");
		            		cliente.setNome(entrada.next());
		            		System.out.println("Digite a nova senha:");
		            		cliente.setSenha(entrada.next());
		            		System.out.println("Digite o novo CPF:");
		            		cliente.setEmail(entrada.next());
		                	
		            		
		            		clientedao.update(cliente);   
		            		
		            		  System.out.println("Deseja atualizar mais usuarios? 1-S / 2-N");
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


	            
	       