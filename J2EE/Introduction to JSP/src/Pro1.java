

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pro1
 */
@WebServlet("/Pro1")
public class Pro1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pro1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int number = Integer.parseInt(request.getParameter("number"));
		
		ArrayList<Integer> primeList = new ArrayList<>();
		
		for (int i = 1; i < number; i++) {
			if (isPrime(i))
				primeList.add(i);
		}

		request.setAttribute("primeList", primeList);
		request.getRequestDispatcher("Pro1.jsp").forward(request, response);
		
		out.close();
	}
	
	public static boolean isPrime (int input1) {
		if (1 == input1) return false;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				return false;
			}
		}
		
		return true;
	}
		
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
