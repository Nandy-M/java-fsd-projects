package jdbciud;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/iudServlet")
public class iudServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
 
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                         
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                        Properties props = new Properties();
                        props.load(in);
                        
                        
                        DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                        Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                       
                        stmt.executeUpdate("insert into eproduct(proID, proNAME,procost) values(6,'Samsung', 45000)");
                        out.println("Executed an insert operation<br>");
                        
                        stmt.executeUpdate("update eproduct set procost=50000 where proNAME = 'microsoft'");
                        out.println("Executed an update operation<br>");
                        
                        stmt.executeUpdate("delete from eproduct where proNAME = 'acer'");
                        out.println("Executed a delete operation<br>");
                        
                        stmt.close();
                        
                        conn.closeConnection();
                        
                        
                        out.println("</body></html>");
                        conn.closeConnection();
                        
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

       
}

