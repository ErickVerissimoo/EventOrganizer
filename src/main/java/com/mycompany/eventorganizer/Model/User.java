/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Model;

import java.io.Serializable;

/**
 *
 * @author Erick
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;
    private String senha;

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    @Override
    public boolean equals(Object objeto){
        User usuario = (User) objeto;
        return usuario.email.equals(usuario.email);
    }
}
