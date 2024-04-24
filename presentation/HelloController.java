package it.unisannio.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.unisannio.application.HelloLocal;

/**
 * Servlet implementation class HelloController
 */
@WebServlet("/HelloController")
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// L'inizializzazione della variabile è automatica grazie all'annotazione @EJB
	// Esempio chiaro di dependency injection (nascondo i dettagli della componente)
	// Non si può usare new perché la componente vede il proxy a monte
	@EJB
	private HelloLocal hello;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloController() {
        super();
        // TODO Auto-generated constructor stub
    }

    // Metodo di servizio
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Recupero stream di scrittura associato alla risposta
		PrintWriter pw = response.getWriter();
		// Scrivo la stringa restituita dalla logica applicativa
		pw.print(hello.sayHello());
	}

}
