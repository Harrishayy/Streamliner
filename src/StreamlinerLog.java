/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StreamlinerLog {
    static Logger logger = Logger.getLogger("AppLog");
    static String query;
    
    public static void init(){
        FileHandler fh;
        try{
            // creates new file if there is no existing "StreamlinerLog.log".
            fh = new FileHandler("StreamlinerLog.log",true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            
    }   catch (IOException ex) {
            Logger.getLogger(StreamlinerLog.class.getName()).log(Level.SEVERE, null, ex);
            
           
        } catch (SecurityException ex) {
            Logger.getLogger(StreamlinerLog.class.getName()).log(Level.SEVERE, null, ex);
        }
}


}