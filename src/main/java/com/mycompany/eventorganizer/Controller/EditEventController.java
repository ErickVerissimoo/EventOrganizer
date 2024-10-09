/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Controller;

import com.mycompany.eventorganizer.Model.Event;
import com.mycompany.eventorganizer.Service.EventService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Erick
 */
@WebServlet("/Editar")
public class EditEventController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Event evento = EventService.getEventos().get(Integer.valueOf(req.getParameter("id")));
        var id = req.getParameter("id");
        req.setAttribute("nome", evento.getNome());
        req.getSession().setAttribute("id", id);
        req.getRequestDispatcher("EditarEventos.jsp").forward(req, resp);
        req.getSession().setAttribute("evento", evento);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(!req.getParameter("evento").isBlank() || !req.getParameter("evento").isEmpty()){
        Object ID =req.getSession().getAttribute("id");
        int id =  Integer.parseInt(String.valueOf(ID));
        EventService.Remover(id);
        req.getRequestDispatcher("Eventos.jsp").forward(req, resp);

    }else if(req.getParameter("newEventDate")!=null && req.getParameter("newEventName")!= null){
        
        Event evento = (Event) req.getSession().getAttribute("evento");
        LocalDate novaDate = LocalDate.parse(req.getParameter("newEventDate"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String novoNome = req.getParameter("newEventName");
        String novaDes = req.getParameter("newEventDescription");
        evento.setData(novaDate);
        evento.setDescricao(novaDes);
        evento.setNome(novoNome);
        req.getRequestDispatcher("Eventos.jsp").forward(req, resp);
   
    }
    
    
    
    
}}
