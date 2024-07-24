package com.example.calculator_application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "calculatorServlet", value = "/calculator-servlet")

public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("calculator.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstNumber = req.getParameter("firstNumber");
        String lastNumber = req.getParameter("lastNumber");
        String operator = req.getParameter("operator");
        if (Integer.parseInt(lastNumber) == 0) {
            req.setAttribute("message", "Số thứ hai bằng 0");
        } else {
            Integer result = 0;
            switch (operator) {
                case "+" :
                    result = Integer.parseInt(firstNumber) + Integer.parseInt(lastNumber);
                    break;
                case "-":
                    result = Integer.parseInt(firstNumber) - Integer.parseInt(lastNumber);
                    break;
                case "*" :
                    result = Integer.parseInt(firstNumber) * Integer.parseInt(lastNumber);
                    break;
                case "/":
                    result = Integer.parseInt(firstNumber) / Integer.parseInt(lastNumber);
                    break;
            }
            req.setAttribute("result", result);
            req.setAttribute("firstNumber", firstNumber);
            req.setAttribute("operator", operator);
            req.setAttribute("lastNumber", lastNumber);
            req.getRequestDispatcher("/calculator-result.jsp").forward(req, resp);
        }
    }
}
