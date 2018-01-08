/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infirmire;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author qpp
 */
public class ConnexionBDD {
    public static void main(String[] args) {      
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver O.K.");
            
            String url = "jdbc:postgresql://localhost:5432/INFIRMIERE";
            String user = "postgres";
            String passwd = "dMJqmTtmv88CBvMbeoFb";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");         
         
        }catch (Exception e) {
        e.printStackTrace();
        }      
    }
}
