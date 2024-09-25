/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.UserDAO;

import com.mycompany.eventorganizer.DatabaseManagement.DatabaseManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
/**
 *
 * @author Erick
 */
public abstract class EventDAO {
    
    public static void Adicionar(LocalDate data, String nome, String descricao) throws ParseException{
        try(Connection conexao = DatabaseManagement.conexao()){
            PreparedStatement declaracao = conexao.prepareStatement("insert into Evento(nome, descricao, data) values (?, ?, ?); ");
             declaracao.setString(1, nome);
             declaracao.setString(2, descricao);
             
             declaracao.setDate(3, Date.valueOf(data));
  
           
            int linhas = declaracao.executeUpdate();
            System.out.print("Linhas afetadas: " + linhas);
        } catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    
}
