package $organization$;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@WebServlet(name="servlet", urlPatterns={"/servlet"}) 
public class Servlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(Servlet.class);

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        log.info("Welcome to $name$");

        PrintWriter out = res.getWriter(); 
        out.println("<html><body><h1>Welcome to $name$</h1></body></html>");
    }
}

