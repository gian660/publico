package pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto;

import java.io.Serializable;
import java.util.List;

public class SmsSendingMultipleRequestInRO implements Serializable {

	private static final long serialVersionUID = 20190125002L;

	private String from;
	private List<String> to;
	private String text;
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

}
