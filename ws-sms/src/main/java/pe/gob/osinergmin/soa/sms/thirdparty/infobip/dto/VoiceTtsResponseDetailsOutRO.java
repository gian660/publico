package pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto;

import java.io.Serializable;

public class VoiceTtsResponseDetailsOutRO implements Serializable {

    private static final long serialVersionUID = 20240212002L;

    private String to;
    private String callRequestId;
    private SmsSendingStatusOutRO status;
	private String messageId;


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCallRequestId() {
        return callRequestId;
    }

    public void setCallRequestId(String callRequestId) {
        this.callRequestId = callRequestId;
    }

    public SmsSendingStatusOutRO getStatus() {
        return status;
    }

    public void setStatus(SmsSendingStatusOutRO status) {
        this.status = status;
    }
    
	public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
}
