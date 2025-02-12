package pe.gob.osinergmin.soa.sms.ws.rest.dto;

import java.io.Serializable;

public class SmsReceivingRequestInRO implements Serializable {

	private static final long serialVersionUID = 20190125006L;
	
	private SmsReceivingRequestResultInRO results;
	private String messageCount;
	private String pendingMessageCount;
	
	public SmsReceivingRequestResultInRO getResults() {
		return results;
	}
	public void setResults(SmsReceivingRequestResultInRO results) {
		this.results = results;
	}
	public String getMessageCount() {
		return messageCount;
	}
	public void setMessageCount(String messageCount) {
		this.messageCount = messageCount;
	}
	public String getPendingMessageCount() {
		return pendingMessageCount;
	}
	public void setPendingMessageCount(String pendingMessageCoun) {
		this.pendingMessageCount = pendingMessageCoun;
	}
}
