/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.*;
/**
 *
 * @author Erick
 */
@Data

@NoArgsConstructor
public class Event {
 private String nome;
    private String descricao;
    private LocalDate data;
    
    public Event(String nome, String descricao, String data) throws ParseException {
    
         
         this.nome = nome;
         this.descricao = descricao;
         this.data = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  
    }
   
    
}
