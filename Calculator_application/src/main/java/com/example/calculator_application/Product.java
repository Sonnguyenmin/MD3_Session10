package com.example.calculator_application;

import model.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name= "productServlet", value="/list-product")

public class Product extends HttpServlet {
   

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Products> productList = new ArrayList<>();

        productList.add(new Products(1,"Bim bim",1200, 12,"https://pvmarthanoi.com.vn/wp-content/uploads/2023/07/4756-100114.webp"));
        productList.add(new Products(2,"Coca cola",1500, 5,"https://pvmarthanoi.com.vn/wp-content/uploads/2023/02/nuoc-ngot-coca-cola-330ml-202001131632421470.png"));
        productList.add(new Products(3,"Khoai Tây",2000, 9,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIy0xD1y784tAkea41Ohdf8ipsJnOAbu6-gw&s"));

        req.setAttribute("product", productList);
        req.getRequestDispatcher("listProducts.jsp").forward(req, resp);
    }
}
