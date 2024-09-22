/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventorganizer.Service;
import com.mycompany.eventorganizer.Model.User;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Erick
 */
public abstract class UserService {
    private static final List<User> USERS = new LinkedList<>();
    
    public static boolean Adicionar(User usuario){
        if(!exists(usuario)){
        USERS.add(usuario);
        System.out.print("Objeto adicionado com sucesso!");
        return true;}
        System.out.print("Usuario já existe");
        return false;
        
    }
    
    public static boolean Remover(User usuario){
        for(int i = 0; i<USERS.size(); i++){
            if(usuario.equals(i)){
                USERS.remove(i);
            }
            
        }
        return exists(usuario);
    }

    public static List<User> getUSERS() {
        return USERS;
    }
    public static boolean exists(User usuario){
        for(int i = 0; i<USERS.size(); i++){
            if(USERS.get(i).equals(usuario))
            return true;
        }
        
        return false;
    }
    public static boolean exists(Integer id){
        for(int i = 0; i<USERS.size(); i++){
            if(USERS.get(i).getId().equals(id)){
            return true;
        }
     
    }
           return false;
}

    
}