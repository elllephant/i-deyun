package wx_handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class wxConnVerify
 */
@WebServlet("/wxConnVerify")
public class wxConnVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String signature;
	private String timetamp;
	private String nonce;
	private String echo;
	private String token = "zane1997";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wxConnVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(checkSignature(request)){
			
		}else{
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private boolean checkSignature(HttpServletRequest request) {
		
		
		return true;
	}
	
}
