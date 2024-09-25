/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventTestes;
import com.mycompany.eventorganizer.Model.Event;
import java.text.ParseException;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Erick
 */
public class testes {
    @Test
    public void TesteOne() throws ParseException{
        Event evento = new Event("festa","dos legais","11/12/2025");
        System.out.print(evento.getData());
    }
}
