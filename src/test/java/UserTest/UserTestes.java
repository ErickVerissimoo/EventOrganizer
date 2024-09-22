/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserTest;
import org.junit.jupiter.api.*;
import com.mycompany.eventorganizer.Model.User;
/**
 *
 * @author Erick
 */
public class UserTestes {
    @Test
    void UsuarioTesteUm(){
        User usuario = new User("Erickverissimo","erick123");
        User usuario2 = new User("Erickverissimo","erick123");
        boolean Ingual = usuario.equals(usuario2);
        System.out.print(Ingual);
    }
 @Test 
 void UsuarioTesteDois(){
     
 }
}
