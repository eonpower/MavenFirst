package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Description extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Description() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//send a bean object
				request.setAttribute("auteur", "Description");
				
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/decription.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
