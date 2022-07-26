package jdbcstoredprocedure;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbcstoredprocedure.DBConnection;

/**
* Servlet implementation class ProductDetails
*/
@WebServlet("/StoredProcedureServlet")
public class StoredProcedureServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
        	   
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                         
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                        Properties props = new Properties();
                        props.load(in);
                        
                        
                        DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                        CallableStatement stmt = conn.getConnection().prepareCall("{call add_details(?,?,?,?,?)}");
                        
                        
                       /* stmt.setString(1, "new product");
                        stmt.setBigDecimal(2, new BigDecimal(1900.50));
                        */
                        stmt.setInt("p_studentid",105);
                        stmt.setString(2, "Nandhini");
                        stmt.setString(3, "BE");
                        stmt.setInt("p_studentage", 22);
                        stmt.setInt("p_studentmarks", 99);
                        
                        stmt.executeUpdate();

                        out.println("Stored procedure has been executed.<Br>");
                        stmt.close();
                        
                        out.println("</body></html>");
                        conn.closeConnection();
                        
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        
}

