

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
		
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String title = "HTTP Header Request Example";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

	      out.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n"+
	         "<body bgcolor = \"#f0f0f0\">\n" +
	         "<h1 align = \"center\">" + title + "</h1>\n" +
	         "<table width = \"100%\" border = \"1\" align = \"center\">\n" +
	         "<tr bgcolor = \"#949494\">\n" +
	         "<th>Header Name</th><th>Header Value(s)</th>\n"+
	         "</tr>\n"
	      );
	 
	      Enumeration headerNames = request.getHeaderNames();
	    
	      while(headerNames.hasMoreElements()) {
	         String paramName = (String)headerNames.nextElement();
	         out.print("<tr><td>" + paramName + "</td>\n");
	         String paramValue = request.getHeader(paramName);
	         out.println("<td> " + paramValue + "</td></tr>\n");
	      }
	      out.println("</table>\n</body></html>");
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
