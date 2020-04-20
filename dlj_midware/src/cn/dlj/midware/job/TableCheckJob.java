package cn.dlj.midware.job;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.dlj.midware.action.XySysAtcion;
import cn.dlj.midware.domain.XyInf;
import cn.dlj.midware.domain.XyOper;
import cn.dlj.midware.domain.XyQc;
import cn.dlj.midware.mail.MailConfig;

public class TableCheckJob {
	@Autowired
	private XySysAtcion xySysAtcion;
	@Autowired
	private MailConfig mailConfig;

	public void checkXfSystem() {

		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		System.out.println("-------------检查表开始-------------");

		try {
			List<XyOper> operList = this.xySysAtcion.xyoper();
			List<XyInf> infList = this.xySysAtcion.xyinf();
			List<XyQc> infqc = this.xySysAtcion.xyqc();
			System.out.println(new Date() + " : " + operList.toString());
			System.out.println(new Date() + " : " + infList.toString());
			System.out.println(new Date() + " : " + infqc.toString());
		} catch (Exception e) {
			while (null != e) {
				System.out.println("数据库异常");
				mailConfig.sendmail();
				System.out.println("发送邮件成功");
				break;
			}
		}
		System.out.println("-------------检查表结束-------------");
		System.out.println("耗时 : " + (startTime - endTime));
	}

}
