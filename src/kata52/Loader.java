/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata52;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Loader {
    
    public static  ArrayList<String> read() throws SQLException, ClassNotFoundException{
       Class.forName("org.sqlite.JDBC"); //DRIVER DE SQLITE
        Connection connect= DriverManager.getConnection("jdbc:sqlite:Kata5.db");//Nombre de la db
        //ACCEDEMOS A LA BASE DE DATOS
        ArrayList<String> mailList= new ArrayList<>();
        Statement state = connect.createStatement();
        String query="SELECT * FROM MAILS";
        ResultSet rs= state.executeQuery(query);

        
        while(rs.next()){
            mailList.add(rs.getString("mail"));
            
           
        }
        rs.close();
        state.close();
        connect.close();
        return mailList;
     }   

}
