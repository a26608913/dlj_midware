package cn.dlj.midware.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class XyOper {
	private Integer id;

	private Integer accountno;

	private String customerno;

	private String customername;

	private String cardid;

	private Integer je;

	private Integer leftje;

	private Integer lsh;

	private Short devno;

	private Byte itemno;

	private Date paytime;

	private Date createtime;

	private Byte flag;

	private Integer syn;

	private Integer synTime;

	private Date latestSynDt;

	private String operatorName;

	private String operatorAccount;

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
		this.customerno = customerno == null ? null : customerno.trim();
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername == null ? null : customername.trim();
	}

	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid == null ? null : cardid.trim();
	}

	public Integer getJe() {
		return je;
	}

	public void setJe(Integer je) {
		this.je = je;
	}

	public Integer getLeftje() {
		return leftje;
	}

	public void setLeftje(Integer leftje) {
		this.leftje = leftje;
	}

	public Integer getLsh() {
		return lsh;
	}

	public void setLsh(Integer lsh) {
		this.lsh = lsh;
	}

	public Short getDevno() {
		return devno;
	}

	public void setDevno(Short devno) {
		this.devno = devno;
	}

	public Byte getItemno() {
		return itemno;
	}

	public void setItemno(Byte itemno) {
		this.itemno = itemno;
	}

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Byte getFlag() {
		return flag;
	}

	public void setFlag(Byte flag) {
		this.flag = flag;
	}

	public Integer getSyn() {
		return syn;
	}

	public void setSyn(Integer syn) {
		this.syn = syn;
	}

	public Integer getSynTime() {
		return synTime;
	}

	public void setSynTime(Integer synTime) {
		this.synTime = synTime;
	}

	public Date getLatestSynDt() {
		return latestSynDt;
	}

	public void setLatestSynDt(Date latestSynDt) {
		this.latestSynDt = latestSynDt;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName == null ? null : operatorName.trim();
	}

	public String getOperatorAccount() {
		return operatorAccount;
	}

	public void setOperatorAccount(String operatorAccount) {
		this.operatorAccount = operatorAccount == null ? null : operatorAccount.trim();
	}

	@Override
	public String toString() {
		return "XyOper [id=" + id + ", accountno=" + accountno + ", customerno=" + customerno + ", customername="
				+ customername + ", cardid=" + cardid + ", je=" + je + ", leftje=" + leftje + ", lsh=" + lsh
				+ ", devno=" + devno + ", itemno=" + itemno + ", paytime=" + paytime + ", createtime=" + createtime
				+ ", flag=" + flag + ", syn=" + syn + ", synTime=" + synTime + ", latestSynDt=" + latestSynDt
				+ ", operatorName=" + operatorName + ", operatorAccount=" + operatorAccount + "]";
	}

}