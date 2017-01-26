/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproject;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author donniegebrail
 */
public class Validation {
    
    private static InfDB idb;
    
    public Validation(){
    try{
            Path path = Paths.get("ScrumProject.FDB").toRealPath(LinkOption.NOFOLLOW_LINKS);
            idb = new InfDB(path.toString());
        }catch(InfException | IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
