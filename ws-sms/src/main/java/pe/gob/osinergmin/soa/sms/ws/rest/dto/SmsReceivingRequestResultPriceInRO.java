package pe.gob.osinergmin.soa.sms.ws.rest.dto;

import java.io.Serializable;

public class SmsReceivingRequestResultPriceInRO implements Serializable{
	
	private static final long serialVersionUID = -1122633197643698219L;
	
	private String pricePerMessage;
	private String currency;
	
	public String getPricePerMessage() {
		return pricePerMessage;
	}
	public void setPricePerMessage(String pricePerMessage) {
		this.pricePerMessage = pricePerMessage;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
