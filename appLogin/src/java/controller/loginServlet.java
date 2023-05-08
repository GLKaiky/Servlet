/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @WebServlet("/loginServlet")
 * @author 893138
 */
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {
        String id = req.getParameter("nome");
        String pass = req.getParameter("senha");
        
        if (id.equals("Aluno")&&pass.equals("12345")){
            RequestDispatcher rd = null;
            
            rd = req.getRequestDispatcher("/view/welcomer.jsp");
            
            req.setAttribute(id, "nome");
           
        }else {
            PrintWriter out = resp.getWriter();
            out.close();
        }
    }
    
  
}
