package pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto;

import java.io.Serializable;

public class SmsSendingResponseDetailsOutRO implements Serializable {

	private static final long serialVersionUID = 20190125004L;

	private String to;
	private SmsSendingStatusOutRO status;
	private Integer smsCount;
	private String messageId;
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public SmsSendingStatusOutRO getStatus() {
		return status;
	}
	
	public void setStatus(SmsSendingStatusOutRO status) {
		this.status = status;
	}
	
	public Integer getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(Integer smsCount) {
		this.smsCount = smsCount;
	}

	public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
