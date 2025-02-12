package pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto;

import java.io.Serializable;

public class SmsSendingSingleRequestInRO implements Serializable {

	private static final long serialVersionUID = 20190125001L;

	private String from;
	private String to;
	private String text;
	
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

}
