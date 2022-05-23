package crud;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import database.Database;

/**
 * Servlet implementation class CountServlet
 */
@WebServlet("/api/CountServlet")
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int count=0;
	         Connection con=Database.getConnection(); 
			 Statement st = con.createStatement();
			 String query = "select count(is_deleted) as rowcount from winter_internship where is_deleted=0";
			 ResultSet rs = st.executeQuery(query);
			 
			 
			 while(rs.next()) {
				 count= rs.getInt(1);
			 }
			 
			 
			 Gson gson = new Gson();
		     String respData = gson.toJson(count);
		     response.setContentType("application/json");
		     response.getWriter().print(respData);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

