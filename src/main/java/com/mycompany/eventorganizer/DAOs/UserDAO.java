/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.DAOs;

import static com.mycompany.eventorganizer.DatabaseManagement.DatabaseManagement.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public abstract class UserDAO {

    public static void inserir(String email, String senha) {
        try (Connection conexao = conexao()) {
            String sql = "insert into Usuarios (email, senha) values (?, ?)";

            PreparedStatement declaracao = conexao.prepareStatement(sql);
            declaracao.setString(1, email);
            declaracao.setString(2, senha);
            int linhas = declaracao.executeUpdate();
            System.out.print("Linhas afetadas: " + linhas);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
