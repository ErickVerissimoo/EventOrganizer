/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.DatabaseManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public abstract class DatabaseManagement {
    private static final String USER = "erick";
    private static final String PASSWORD = "erick";
    private static final String JDBC = "jdbc:postgresql://localhost:5432/EventOrganizer";
    
    public static Connection conexao () throws SQLException, ClassNotFoundException{
    Class.forName("org.postgresql.Driver");       
        return DriverManager.getConnection(JDBC, USER, PASSWORD);
    }
    
    }
