package cn.dlj.midware.domain;

import java.util.Date;

public class XyQc {

	private Integer id;

	private Integer accountno;

	private String customerno;

	private String customername;

	private String cardid;

	private Integer qcje;

	private Date qctime;

	private Integer flag;

	private String dljseq;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountno() {
		return accountno;
	}

	public void setAccountno(Integer accountno) {
		this.accountno = accountno;
	}

	public String getCustomerno() {
		return customerno;
	}

	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public Integer getQcje() {
		return qcje;
	}

	public void setQcje(Integer qcje) {
		this.qcje = qcje;
	}

	public Date getQctime() {
		return qctime;
	}

	public void setQctime(Date qctime) {
		this.qctime = qctime;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getDljseq() {
		return dljseq;
	}

	public void setDljseq(String dljseq) {
		this.dljseq = dljseq;
	}

	@Override
	public String toString() {
		return "XyQc [id=" + id + ", accountno=" + accountno + ", customerno=" + customerno + ", customername="
				+ customername + ", cardid=" + cardid + ", qcje=" + qcje + ", qctime=" + qctime + ", flag=" + flag
				+ ", dljseq=" + dljseq + "]";
	}
	

}