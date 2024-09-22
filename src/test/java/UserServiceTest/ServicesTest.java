/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserServiceTest;
import org.junit.jupiter.api.*;
import com.mycompany.eventorganizer.Model.User;
import com.mycompany.eventorganizer.Service.UserService;
/**
 *
 * @author Erick
 */
public class ServicesTest {
    @Test
    void ServiceTestOne(){
        User uso = new User("erickverissimo@gmail.com","erick",1);
        UserService.Adicionar(uso);
        User user = new User("erickverissimo@gmail.com","erick",1);
        
        UserService.Adicionar(user);
    }
    void ServiceTestTwo(){
        
    }
}
