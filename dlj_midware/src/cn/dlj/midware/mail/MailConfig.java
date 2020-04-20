package cn.dlj.midware.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;

public class MailConfig {


	@Autowired
	private MailSender mailSender;

	public void sendmail() {

		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("26608913@qq.com");
		mailMessage.setTo(mailSender.getSendto());
		mailMessage.setSubject("数据表异常，请检查中间库。");
		mailMessage.setText("数据表异常。");
		mailSender.send(mailMessage);
		System.out.println("邮件已发送" + mailSender.getSendto());
	}

}
