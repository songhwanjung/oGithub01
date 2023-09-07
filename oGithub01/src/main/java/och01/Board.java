package och01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board") //주소역할
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
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
		request.setCharacterEncoding("utf-8");
		// parameter 받기 
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		java.util.Date date = new java.util.Date();
		
				System.out.println("title-> "+title);
				System.out.println("writer-> "+writer);
				System.out.println("content-> "+content);
				
				//Encoding 적용
				response.setContentType("text/html;charset=utf-8");
				// 공식 --> 사용자 browser 에 보여주는 객체
				PrintWriter out = response.getWriter();
				out.println("<html><body>");
				out.println("<h1>게시판</h1>");
				out.printf("<h4>제목 : %s</h4>", title);
				out.printf("<h4>작성자 : %s</h4>", writer);
				out.printf("<h4>작성일 : %s</h4>", date);
				out.println("<h4>내용</h4>");
				out.printf("<h4>%s</h4>", content);
				out.println("</body></html>");
				out.close();
				
	}

}
