
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
 * @author harrishayyanar
 */
public class Emailalertsend {
    public static void sendEmail(String recipient) throws MessagingException{
        // establishing connection with the email provider through the smtp protocol
        Properties properties = new Properties();
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
          Message message = prepareMessage(session, firmemail, recipient);
          Transport.send(message);
         System.out.println("Message sent successfully");
    }
    private static Message prepareMessage(Session session, String firmemail, String recipient){
            Message message = new MimeMessage(session);
        try {
            // sends email to itself to alert the owner that 5 attempts have failed and to ensure the device or application is under authorised people.
            message.setFrom(new InternetAddress(firmemail));
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
          message.setSubject("Application Locked - Streamliner");
          message.setText("More than 5 Attempts have been made to try access the Streamliner Application. It is now locked for 30 minutes. Please reassure that the application is used by authorised individuals.");
          return message;
        } catch (AddressException ex) {
            java.util.logging.Logger.getLogger(Emailsend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            java.util.logging.Logger.getLogger(Emailsend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         return null; 
    }
        
}
