/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Controller;

import com.mycompany.eventorganizer.Model.User;
import com.mycompany.eventorganizer.Service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 *
 * @author Erick
 */
@WebServlet("/Cadastro")
public class CadastroController extends HttpServlet {

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService.Adicionar(new User(req.getParameter("EMAIL"), req.getParameter("SENHA")));
        System.out.println("\n\tUsuario cadastrado");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    
    
    
}
