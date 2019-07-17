package mail;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSend {

	public static void main(String[] args) {

//		mailSend();

	}

	public static void mailSend(String email) {

		try {
			Properties props = System.getProperties();

			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "587");

			Authenticator auth = new MailAuth();
			Session session = Session.getDefaultInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			msg.setSentDate(new Date());

			msg.setFrom(new InternetAddress("qodqlr@gmail.com", "미코"));
			InternetAddress to = new InternetAddress(email);
			msg.setRecipient(Message.RecipientType.TO, to);
			msg.setSubject("[★] 가입을 축하드립니다~!", "UTF-8");
			msg.setText("가입진짜 축하하잖어 ㅠㅠ", "UTF-8");
			

			Transport.send(msg);
		} catch (AddressException e) {
			System.out.println("주소 예외 발생 : " + e.getMessage());
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 인코딩 : " + e.getMessage());
		} catch (MessagingException e) {
			System.out.println("메일 계정인증 관련 예외 발생 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void fileSend(String email) {

		try {
			Properties props = System.getProperties();

			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "587");

			Authenticator auth = new MailAuth();
			Session session = Session.getDefaultInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			msg.setSentDate(new Date());

			msg.setFrom(new InternetAddress("qodqlr@gmail.com", "미코"));
			InternetAddress to = new InternetAddress(email);
			msg.setRecipient(Message.RecipientType.TO, to);
			msg.setSubject("[★] 가입을 축하드립니다~!", "UTF-8");
			msg.setText("가입진짜 축하하잖어 ㅠㅠ", "UTF-8");
			

			Transport.send(msg);
		} catch (AddressException e) {
			System.out.println("주소 예외 발생 : " + e.getMessage());
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 인코딩 : " + e.getMessage());
		} catch (MessagingException e) {
			System.out.println("메일 계정인증 관련 예외 발생 : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
