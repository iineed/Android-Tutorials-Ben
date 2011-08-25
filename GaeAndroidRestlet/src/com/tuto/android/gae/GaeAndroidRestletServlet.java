package com.tuto.android.gae;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GaeAndroidRestletServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws IOException {
	resp.setContentType("text/plain");
	resp.getWriter().println("Hello, world");
    }
}
