package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDAO;
import modelo.Destinos;

	@WebServlet(urlPatterns = { "/destino", "/cadastrar-destino", "/editar-destino", "/atualizar-destino", "/deletar-destino" })
	public class DestinoServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		DestinoDAO destinoDao = new DestinoDAO();
		Destinos destino = new Destinos();

		public DestinoServlet() {
			super();
			// TODO Auto-generated constructor stub
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String action = request.getServletPath();

			switch (action) {
			case "/destino":
				read(request, response);
				break;

			case "/cadastrar-destino":
				create(request, response);
				break;

			case "/editar-destino":
				readByNome(request, response);
				break;
				
			case "/atualizar-destino":
				update(request, response);
				break;
				
			case "/deletar-destino":
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
			 
			
			destino.setNome(request.getParameter("nome"));
			destino.setPreco(Double.parseDouble(request.getParameter("valor")));
			destinoDao.save(destino);
			response.sendRedirect("destino");

		}

		// Read
		protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			List<Destinos> lista = destinoDao.getDestino();

			request.setAttribute("destino", lista);

			RequestDispatcher rd = request.getRequestDispatcher("./view/destino/index.jsp");
			rd.forward(request, response);

		}

		// Update
		protected void update(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			destino.setNome(request.getParameter("nome"));
			destino.setPreco(Double.parseDouble(request.getParameter("valor")));
			destino.setIDDestinos(Integer.parseInt(request.getParameter("id_destino")));
			destinoDao.update(destino);
			response.sendRedirect("destino");
		}

		// Delete
		protected void delete(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			int iddestino = (Integer.parseInt(request.getParameter("id_destino")));
			String nome = (request.getParameter("Senha"));
			destinoDao.removeByNome(iddestino, nome);
			response.sendRedirect("destino");
		}


		// Read by Id
		protected void readByNome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
			
			String nome = request.getParameter("nome");
			
			destino = (Destinos) destinoDao.getBusca(nome);
			
			
			request.setAttribute("id_destino", destino.getIDDestinos());
			request.setAttribute("nome", destino.getNome());
			request.setAttribute("valor", destino.getPreco());
			
			RequestDispatcher rd = request.getRequestDispatcher("./view/destino/atualizar.jsp");
			rd.forward(request, response);
			
		}

	}


