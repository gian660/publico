package pe.gob.osinergmin.soa.sms.ws.rest.dto;

public class VoiceTtsResponseOutRO {
    private String bulkId;
    private String callId;
    private VoiceTtsStatusOutRO status;


    public String getBulkId() {
        return bulkId;
    }
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }
    public String getCallId() {
        return callId;
    }
    public void setCallId(String callId) {
        this.callId = callId;
    }
    public VoiceTtsStatusOutRO getStatus() {
        return status;
    }
    public void setStatus(VoiceTtsStatusOutRO status) {
        this.status = status;
    }
}
