/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Model;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Objects;
import com.mycompany.eventorganizer.Service.UserService;
import java.util.Random;

/**
 *
 * @author Erick
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String email;
    private String senha;
    private Integer id;
   
    public User(){
       Random aleatorio = new SecureRandom();
        id = aleatorio.nextInt(1);
           while(UserService.exists(id)){
          id = aleatorio.nextInt(1);
           }
    }

    public User(String email, String senha, Integer id) {
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
         Random aleatorio = new SecureRandom();
        id = aleatorio.nextInt(1);
           while(UserService.exists(id)){
               id = aleatorio.nextInt(1);
           }
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param objeto
     * @return
     */
    @Override
    public boolean equals(Object objeto){
         if(objeto instanceof Integer){
            return UserService.exists(id);
        }
         
        User usuario = (User) objeto;
       
        return this.email.equals(usuario.getEmail()) && this.getId().equals(usuario.getId());
    }
    
     public boolean equals(String email, Integer id){
     
         
       
       
        return this.email.equals(email) && this.getId().equals(id);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    
}
