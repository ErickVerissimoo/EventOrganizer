package com.mycompany.eventorganizer.Service;

import com.mycompany.eventorganizer.Model.User;
import com.mycompany.eventorganizer.DAOs.UserDAO;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class UserService {

    private static final Map<Integer, User> usuarios = new LinkedHashMap<>();
    private static int contador = 1; 

    public static void Adicionar(User usuario) {
        usuarios.put(contador++, usuario); 
        UserDAO.inserir(usuario.getEmail(), usuario.getSenha());
        
    }

    public static boolean Remover(Object objeto) {
        if (objeto instanceof Integer) {
            Integer id = (Integer) objeto;
            if (usuarios.containsKey(id)) {
                usuarios.remove(id);

               
                for (int i = id + 1; usuarios.containsKey(i); i++) {
                    usuarios.put(i - 1, usuarios.get(i));
                    usuarios.remove(i);
                }
                return true; 
            }
        } else if (objeto instanceof User) {
            User usuario = (User) objeto;
            for (Map.Entry<Integer, User> entry : usuarios.entrySet()) {
                if (entry.getValue().equals(usuario)) {
                    usuarios.remove(entry.getKey());
                    for (int i = entry.getKey() + 1; usuarios.containsKey(i); i++) {
                        usuarios.put(i - 1, usuarios.get(i));
                        usuarios.remove(i);
                    }
                    return true; 
                }
            }
        }
        return false; 
    }

    public static Map<Integer, User> getUsuarios() {
        return usuarios;
    }
    public static Boolean exists(Object entrada) {
        if (entrada instanceof Integer) {
            return usuarios.containsKey(entrada);
        } else if (entrada instanceof User) {
            return usuarios.containsValue(entrada);
        }
        else if(entrada instanceof String){
            for(Map.Entry<Integer, User> entre : usuarios.entrySet()){
                if(entre.getValue().getEmail().equals(entrada)){
                    return true;
                }
            }
        }
        return false; 
    }
}