/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Service;

import com.mycompany.eventorganizer.Model.Event;
import com.mycompany.eventorganizer.UserDAO.EventDAO;
import java.sql.*;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Erick
 */

public class EventService {

    public static Map<Integer, Event> getEventos() {
        return eventos;
    }
    private static final Map<Integer, Event> eventos = new LinkedHashMap<>();
    private static int contador = 1;
    public static final void Adicionar(Event evento) throws ParseException{
        eventos.put(contador++, evento);
        EventDAO.Adicionar(evento.getData(), evento.getNome(), evento.getDescricao());
        System.out.print("Evento adicionado com sucesso");
       }
    public static boolean Remover(Event evento){
        for(Map.Entry<Integer, Event> eventus : eventos.entrySet()){
            if(eventos.equals(evento)){
                eventos.remove(eventus);
                return true;
            }
        }
        
        return false;
    }
    public static Boolean exists(Object evento){
        return eventos.containsKey((Event) evento) || eventos.containsKey((Integer) evento);
    }
    
  
}
