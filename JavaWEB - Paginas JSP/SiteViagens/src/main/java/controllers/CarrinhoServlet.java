package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import dao.carrinhoDAO;
import modelo.Carrinho;


@WebServlet(urlPatterns = { "/carrinho", "/cadastrar-carrinho", "/editar-carrinho", "/atualizar-carrinho", "/deletar-carrinho" })
public class CarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	carrinhoDAO carrinhoDao = new carrinhoDAO();
	Carrinho carrinho = new Carrinho();

	public CarrinhoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/carrinho":
			read(request, response);
			break;

		case "/cadastrar-carrinho":
			create(request, response);
			break;	
		case "/atualizar-carrinho":
			update(request, response);
			break;
			
		case "/deletar-carrinho":
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

		carrinho.setTotal(Double.parseDouble(request.getParameter("valorTotal")));
		carrinho.setdataCompra(request.getParameter("dataCompra"));
		//carrinho.setIDLogin(request.getParameter("id_login"));
		carrinhoDao.save(carrinho);
		response.sendRedirect("carrinho");

	}

	// Read
	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Carrinho> lista = carrinhoDao.getCarrinho();

		request.setAttribute("carrinho", lista);

		RequestDispatcher rd = request.getRequestDispatcher("./view/carrinho/index.jsp");
		rd.forward(request, response);

	}

	// Update
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		carrinho.setidCarrinho(Integer.parseInt(request.getParameter("id_carrinho")));
		carrinho.setTotal(Double.parseDouble(request.getParameter("valorTotal")));
		carrinho.setidCarrinho(Integer.parseInt(request.getParameter("id_carrinho")));
		carrinhoDao.update(carrinho);
		response.sendRedirect("carrinho");
	}

	// Delete
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idcarrinho = (Integer.parseInt(request.getParameter("id_carrinho")));
		carrinhoDao.removeByNome(idcarrinho);
		response.sendRedirect("carrinho");
	}

}
