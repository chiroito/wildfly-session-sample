package com.chiroito.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/count")
public class CountServlet extends HttpServlet {

    @Inject
    Counter counter;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {

        counter.countUp();

        res.setContentType("text/html");

        try(PrintWriter writer = res.getWriter()) {
            writer.println("<html><body>");
            writer.println("<h1> counter=" + counter.getValue() + "</h1>");
            writer.println("</body></html>");
        }catch(IOException e){
            throw new ServletException(e);
        }
    }
}