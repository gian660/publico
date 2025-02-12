package pe.gob.osinergmin.soa.sms.ws.rest.dto;

import java.io.Serializable;

public class SmsReceivingResponseOutRO implements Serializable {

	private static final long serialVersionUID = 20190125007L;
	
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
