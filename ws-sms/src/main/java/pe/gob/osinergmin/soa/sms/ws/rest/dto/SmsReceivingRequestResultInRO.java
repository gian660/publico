package pe.gob.osinergmin.soa.sms.ws.rest.dto;


import java.io.Serializable;
//import java.util.List;

public class SmsReceivingRequestResultInRO implements Serializable{
	
	private static final long serialVersionUID = -2941103747609225542L;
	
	private String messageID;
	private String from;
	private String to;
	private String text;
	private String cleanText;
	private String keyword;
	private String receivedAt;
	private String smsCount;
	private SmsReceivingRequestResultPriceInRO price;
	private String callbackData;
	
	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCleanText() {
		return cleanText;
	}
	public void setCleanText(String cleanText) {
		this.cleanText = cleanText;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getReceivedAt() {
		return receivedAt;
	}
	public void setReceivedAt(String receivedAt) {
		this.receivedAt = receivedAt;
	}
	public String getSmsCount() {
		return smsCount;
	}
	public void setSmsCount(String smsCount) {
		this.smsCount = smsCount;
	}
	public SmsReceivingRequestResultPriceInRO getPrice() {
		return price;
	}
	public void setPrice(SmsReceivingRequestResultPriceInRO price) {
		this.price = price;
	}
	public String getCallbackData() {
		return callbackData;
	}
	public void setCallbackData(String callbackData) {
		this.callbackData = callbackData;
	}
	@Override
	public String toString() {
		return "SmsReceivingRequestResultInRO [messageID=" + messageID + ", from=" + from + ", to=" + to + ", text="
				+ text + ", cleanText=" + cleanText + ", keyword=" + keyword + ", receivedAt=" + receivedAt
				+ ", smsCount=" + smsCount + ", price=" + price + ", callbackData=" + callbackData + "]";
	}
	
	
	
}
