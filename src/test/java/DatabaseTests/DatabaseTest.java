/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseTests;

import org.junit.jupiter.api.Test;
import com.mycompany.eventorganizer.DatabaseManagement.DatabaseManagement;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Disabled;
/**
 *
 * @author Erick
 */
public class DatabaseTest {
    @Test
    @Disabled
    void TestConnection() throws SQLException, ClassNotFoundException{
        Connection conexao = DatabaseManagement.conexao();
        if(conexao !=null){
            System.out.print("Conexão bem sucedida");
        }
        else{
            System.out.print("Erro");
        }
    }
}
