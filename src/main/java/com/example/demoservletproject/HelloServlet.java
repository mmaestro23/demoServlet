package com.example.demoservletproject;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>ID: 123456</h1>");
        out.println("<h1>Name: John Doe</h1>");
        out.println("<a href='another'>Go to Another Servlet</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}