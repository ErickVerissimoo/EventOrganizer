/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Service;

import com.mycompany.eventorganizer.Model.Event;
import com.mycompany.eventorganizer.DAOs.EventDAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    public static boolean Remover(int id){
     for(int numeros : eventos.keySet()){
         if(numeros == id){
             eventos.remove(id);
         }
        }
      List<Integer> chavesParaMudar = new ArrayList<>();
      for(int chave : eventos.keySet()){
      if(chave > id){
          chavesParaMudar.add(chave);
      }    
      
      }
      
      for(int chave : chavesParaMudar){
          eventos.put(chave - 1, eventos.remove(chave));
      }
      EventDAO.deletar(id);
        return true;
    }
    public static Boolean exists(Object evento){
        return eventos.containsValue((Event) evento) || eventos.containsKey((Integer) evento);
    }
    
  
}
