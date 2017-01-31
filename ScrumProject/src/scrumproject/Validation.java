/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproject;
import java.io.File;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author donniegebrail
 */
public class Validation {
    
    private static boolean isAdmin = false;
    private static InfDB idb;
    
    public Validation(){
    //try{
        //Connects to database with an absolute path
            //Path path = Paths.get("ScrumProject.FDB").toRealPath(LinkOption.NOFOLLOW_LINKS);
            //idb = new InfDB(path.toString());
        //}catch(InfException | IOException e){
           // JOptionPane.showMessageDialog(null, e);
        //}
    }
    
    public static InfDB hämtaIdb()
             //Gör inladdningen av databasen till en klass så att vi bara kan använda denna metod i andra klasser.
    {
        if (idb == null)
        {
            File db = new File ("ScrumProject.FDB");
            System.out.println (db.getAbsolutePath());
            try 
            {
                idb = new InfDB(db.getAbsolutePath());
            }
            catch (InfException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        return idb;
        
    }
    //Sets true if admin logs in
    public static boolean getAdmin()
    {
        return isAdmin;
    }
    
    //Checks if a textfield is empty
    public boolean checkIfTxtIsEmpty(String textfalt){      
        boolean isEmpty = false;
        
        if(textfalt.isEmpty() || textfalt == ""){
            isEmpty = true;
        }
        return isEmpty;
    }
    
    public boolean checkLogin(String user, String password){
        boolean loginMatch = false;
        //SQL koden som hämtar ut raden som stämmer överrens med vad användaren matat in. 
        String sql = "select email, pW from EMPLOYEE where Employee.EMAIL = '"+ user +"' and Employee.PW = '"+ password +"'";
        
        try{
            HashMap<String, String> loggin = idb.fetchRow(sql);
            //Kollar om inloggningsuppgifterna stämmer överrens med databasen. Om det gör det sätts boolean loginMatch till true.
            //Matchar inloggningsuppgifterna med databasen kommer användaren få tillgång till administratör sidorna inom systemet.
            if(user.equals(loggin.get("EMAIL")) && password.equals(loggin.get("PW"))){
                loginMatch = true;
            }
        }catch(Exception e){
            
        }
        return loginMatch;
    }
}
