package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.UsuarioBusiness;
import domain.Endereco;
import domain.Usuario;

/**
 * Servlet implementation class Cadastrar
 */
@WebServlet("/Cadastrar")
public class Cadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String rua = request.getParameter("rua");
		String numeroDaCasa = request.getParameter("numeroDaCasa");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String pontoDeReferencia = request.getParameter("pontoDeReferencia");
		
		UsuarioBusiness business = new UsuarioBusiness();
		
		/*if (business.validar(email, senha) == false) {
			Endereco endereco = new Endereco(rua, Integer.parseInt(numeroDaCasa), bairro, cidade, estado, pontoDeReferencia);
			//Usuario usuario = new Usuario(nome, email, senha, endereco);
			//business.salvar(usuario);
			request.getRequestDispatcher("/home.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/modal.html").forward(request, response);
		}*/
		
		
		doGet(request, response);
	}

}
