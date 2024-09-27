
package com.mycompany.eventorganizer.Controller;
import com.mycompany.eventorganizer.Model.Event;
import com.mycompany.eventorganizer.Service.EventService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Erick
 */
@WebServlet("/Eventos")
public class EventController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            Event evento = new Event(req.getParameter("eventName"), req.getParameter("eventDes"), req.getParameter("eventDate"));
            HttpSession sessao = req.getSession();
            EventService.Adicionar(evento);
           
            sessao.setAttribute("evento", evento);
            sessao.setAttribute("eventosMap", EventService.getEventos());
            req.getRequestDispatcher("Eventos.jsp").forward(req, resp);
        } catch (ParseException ex) {
            Logger.getLogger(EventController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
          
        
            
       
               }
    
}