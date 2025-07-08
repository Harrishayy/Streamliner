
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
public class Emailsend {
    
    public static void sendEmail(String recipient, String pw) throws MessagingException{
         // establishing connection with the email provider through the smtp protocol
        Properties properties = new Properties();
                properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
         properties.put("mail.smtp.host", "smtp-mail.outlook.com");
          properties.put("mail.smtp.port", "587");
             // providing email and password of the email of the business.
          String firmemail = "donotreplystreamliner@outlook.com";
          String password = "Cs12345!";
          Session session = Session.getInstance(properties, new Authenticator(){
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(firmemail, password);
        }
    });
          //alert message to user that the e-mail has been sent to them.
          Message message = prepareMessage(session, firmemail, recipient, pw);
          Transport.send(message);
         System.out.println("Message sent successfully");
    }
    
    public static Message prepareMessage(Session session, String firmemail, String recipient,String pw){
            Message message = new MimeMessage(session);
        try {
            // e-mail details of the email being sent to staff account's respective email id of their password incase they forgot.
            message.setFrom(new InternetAddress(firmemail));
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
          message.setSubject("Reset Password - Streamliner");
          message.setText("Hello There, the password for your account is: "+pw+". If this was not you, please immediately change your password and make sure the application is used by staff.");
          return message;
        } catch (AddressException ex) {
            java.util.logging.Logger.getLogger(Emailsend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            java.util.logging.Logger.getLogger(Emailsend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         return null; 
    }

    static void prepareMessage(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
