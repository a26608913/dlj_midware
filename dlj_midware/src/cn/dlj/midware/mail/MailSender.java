package cn.dlj.midware.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailSender {
	@Autowired
	private JavaMailSender mailSender;
	@Value("${mail.sendto}")
	public String sendto;


	public String getSendto() {
		return sendto;
	}

	public void setSendto(String sendto) {
		this.sendto = sendto;
	}


	public void send(SimpleMailMessage message) {

		mailSender.send(message);
		System.out.println("邮件已发送 : " + sendto);
	}
}
