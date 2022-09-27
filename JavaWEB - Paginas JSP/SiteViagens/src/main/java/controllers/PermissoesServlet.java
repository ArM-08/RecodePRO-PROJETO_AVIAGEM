package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import dao.permissoesDAO;
import modelo.Permissoes;


@WebServlet(urlPatterns = { "/permissoes", "/cadastrar-permissoes", "/editar-permissoes", "/atualizar-permissoes", "/deletar-permissoes" })
public class PermissoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	permissoesDAO permissaoDao = new permissoesDAO();
	Permissoes permissao = new Permissoes();

	public PermissoesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/permissoes":
			read(request, response);
			break;

		case "/cadastrar-permissoes":
			create(request, response);
			break;	
		case "/atualizar-permissoes":
			update(request, response);
			break;
			
		case "/deletar-permissoes":
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

		permissao.setId(Integer.parseInt(request.getParameter("id_permissao")));
		permissao.setTipo(request.getParameter("tipoPerm"));
		permissaoDao.save(permissao);
		response.sendRedirect("permissao");

	}

	// Read
	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Permissoes> lista = permissaoDao.getPermissao();

		request.setAttribute("permissoes", lista);

		RequestDispatcher rd = request.getRequestDispatcher("./view/permissoes/index.jsp");
		rd.forward(request, response);

	}

	// Update
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		permissao.setId(Integer.parseInt(request.getParameter("id_permissao")));
		permissao.setTipo(request.getParameter("tipoPerm"));
		permissaoDao.update(permissao);
		response.sendRedirect("permissao");
	}

	// Delete
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idPermissao = (Integer.parseInt(request.getParameter("id_permissao")));
		String tipoPerm = (request.getParameter("tipoPerm"));
		permissaoDao.removeByNome(idPermissao, tipoPerm);
		response.sendRedirect("permissoes");
	}

}
