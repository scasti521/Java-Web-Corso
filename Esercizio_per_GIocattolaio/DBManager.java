package Esercizio_per_GIocattolaio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBManager {

    public String DB_url = "jdbc:mysql://localhost:3306/provasql" ;
    public String DB_driver = "com.mysql.cj.jdbc.Driver";
    public String DB_username = "root" ;
    public String DB_password = "root";

    public void openConnection(){
        Connection conn = null;
        try {
            Class.forName(DB_driver);
             conn = DriverManager.getConnection(DB_url, DB_username, DB_password);

             if (conn!=null) {
                System.out.println("Connessione riuscita");
             }
             else{
                System.out.println("Connessione NON riuscita");
             }
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}