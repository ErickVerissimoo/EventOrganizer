/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserServiceTest;
import org.junit.jupiter.api.*;
import com.mycompany.eventorganizer.Model.User;
import static com.mycompany.eventorganizer.Service.UserService.*;
/**
 *
 * @author Erick
 */
public class ServicesTest {
     @Test
    void ServiceTestOne(){
       User usuario = new User("erickverissimo", "erick");
       User usuario2 = new User("erickverissimo","erick123");
       Adicionar(usuario);
       Adicionar(usuario2);
       getUsuarios().keySet().forEach((Integer chave) -> System.out.println(chave));
        
    }
   @Test
   void ServiceTestTwo(){
      User usuario1 = new User("Erick1", "erick");
      User usuario2 = new User("Erick2", "erick");
      User usuario3 = new User("Erick3", "erick");
      User usuario4 = new User("Erick4", "erick");
      User usuario5 = new User("Erick5", "erick");
      User usuario6 = new User("Erick6", "erick");
      Adicionar(usuario1);
      Adicionar(usuario2);
      Adicionar(usuario3);
      Adicionar(usuario4);
      Adicionar(usuario5);
      Adicionar(usuario6);
      getUsuarios().keySet().forEach((Integer chave) -> System.out.println(chave));
      Remover(usuario4);
      System.out.println("-------------------");
      getUsuarios().keySet().forEach((Integer chave) -> System.out.println(chave));

   }
}
