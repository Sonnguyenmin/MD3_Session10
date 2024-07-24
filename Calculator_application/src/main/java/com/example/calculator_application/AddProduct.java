package com.example.calculator_application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="addProductServlet" , value= "/add-product")
public class AddProduct extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("addProduct.jsp");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String stock = req.getParameter("stock");
        String image = req.getParameter("image");

        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("price", price);
        req.getSession().setAttribute("stock", stock);
        req.getSession().setAttribute("image", image);

        req.getRequestDispatcher("homeProduct.jsp").forward(req, resp);
    }
}
