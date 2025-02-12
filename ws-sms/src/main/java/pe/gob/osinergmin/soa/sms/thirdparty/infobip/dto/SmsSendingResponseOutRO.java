package pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto;

import java.io.Serializable;
import java.util.List;

public class SmsSendingResponseOutRO implements Serializable {

	private static final long serialVersionUID = 20190125003L;

	private String bulkId;
	private List<SmsSendingResponseDetailsOutRO> messages;
	
	public String getBulkId() {
		return bulkId;
	}
	
	public void setBulkId(String bulkId) {
		this.bulkId = bulkId;
	}

	public List<SmsSendingResponseDetailsOutRO> getMessages() {
		return messages;
	}

	public void setMessages(List<SmsSendingResponseDetailsOutRO> messages) {
		this.messages = messages;
	}
	
}
