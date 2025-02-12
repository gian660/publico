package pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto;

import java.io.Serializable;
import java.util.List;

public class VoiceTtsResponseOutRO implements Serializable {

    private static final long serialVersionUID = 20240212001L;

    private String bulkId;
    private List<VoiceTtsResponseDetailsOutRO> messages;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public List<VoiceTtsResponseDetailsOutRO> getMessages() {
        return messages;
    }

    public void setMessages(List<VoiceTtsResponseDetailsOutRO> messages) {
        this.messages = messages;
    }
}
