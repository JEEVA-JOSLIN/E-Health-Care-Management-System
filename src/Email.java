/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class Email {
 
    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();
    private String t1=new String();

    final String USER_NAME = "jeevajoslinehealthcareservice";   //User name of the Goole(gmail) account
    final String PASSSWORD = "elratulvuisnvvhx";  //Password of the Goole(gmail) account
    final String FROM_ADDRESS = "jeevajoslinehealthcareservice@gmail.com";  //From addresss
 
    public Email(){
    }

    public static void main(String[] args) {
      Email email = new Email();
     //Sending test email
      email.createAndSendEmail("jeevajoslinehealthcareservice@gmail.com", "Test email subject",
      "Congratulations !!! \nThis is test email sent by java class.","jeevajosliny@gmail.com");
    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText,String t1) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        this.t1=t1;
       
        sendEmailMessage(t1);
    }
 
    private void sendEmailMessage(String t1) {
     
     //Create email sending properties
     Properties props = new Properties();
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.port", "587");
  
    Session session = Session.getInstance(props,
    new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("jeevajoslinehealthcareservice@gmail.com", "elratulvuisnvvhx");
   }
    });

  try {

     Message message = new MimeMessage(session);
     message.setFrom(new InternetAddress("jeevajoslinehealthcareservice@gmail.com")); //Set from address of the email
     message.setContent(msgText,"text/html"); //set content type of the email
     
    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(t1)); //Set email recipient
    
    message.setSubject("24/7 E-HEALTH CARE SERVICE"); //Set email message subject
    Transport.send(message); //Send email message

   System.out.println("sent email successfully!");

  } catch (MessagingException e) {
       throw new RuntimeException(e);
  }
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject) {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText) {
        this.msgText = msgText;
    }
 
}

