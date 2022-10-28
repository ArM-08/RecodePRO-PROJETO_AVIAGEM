package controllers;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import dao.ClienteDAO;
import modelo.Cliente;


@WebServlet(urlPatterns = { "/cliente", "/cadastrar-cliente", "/editar-cliente", "/atualizar-cliente", "/deletar-cliente" })
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClienteDAO clienteDao = new ClienteDAO();
	Cliente cliente = new Cliente();

	public ClienteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/cliente":
			read(request, response);
			break;

		case "/cadastrar-cliente":
			create(request, response);
			break;

		case "/editar-cliente":
			readById(request, response);
			break;
			
		case "/atualizar-cliente":
			update(request, response);
			break;
			
		case "/deletar-cliente":
			delete(request, response);
			break;
			
		default:
			response.sendRedirect("index.html");
			break;
		}

	}

	// Create
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		cliente.setIDLogin(request.getParameter("id_login"));
		cliente.setSenha(request.getParameter("Senha"));
		cliente.setNome(request.getParameter("nomeUsuario"));
		cliente.setEmail(request.getParameter("email"));
		cliente.getPermissoes().getId();
		clienteDao.save(cliente);
		response.sendRedirect("cliente");

	}

	// Read
	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Cliente> lista = clienteDao.getCliente();

		request.setAttribute("cliente", lista);

		RequestDispatcher rd = request.getRequestDispatcher("./view/cliente/index.jsp");
		rd.forward(request, response);

	}

	// Update
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		cliente.setIDLogin(request.getParameter("id_login"));
		cliente.setSenha(request.getParameter("Senha"));
		cliente.setNome(request.getParameter("nomeUsuario"));
		cliente.setEmail(request.getParameter("email"));
		clienteDao.update(cliente);
		response.sendRedirect("cliente");
	}

	// Delete
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idlogin = (request.getParameter("id_login"));
		String senha = (request.getParameter("Senha"));
		clienteDao.removeByNome(idlogin, senha);
		response.sendRedirect("cliente");
	}


	// Read by Id
	protected void readById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		String nome = request.getParameter("nomeUsuario");
		
		cliente = (Cliente) clienteDao.getBusca(nome);
		
		
		request.setAttribute("id_login", cliente.getIDLogin());
		request.setAttribute("Senha", cliente.getSenha());
		request.setAttribute("nomeUsuario", cliente.getNome());
		request.setAttribute("email", cliente.getEmail());
		
		RequestDispatcher rd = request.getRequestDispatcher("./view/cliente/atualizar.jsp");
		rd.forward(request, response);
		
	}

}
