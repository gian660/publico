package pe.gob.osinergmin.soa.sms.ws.rest.dto;

public class VoiceTtsSingleRequestInRO {
    private String text;
    private String language;
    private VoiceTtsVoiceInRO voice;
    private String from;
    private String to;


    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public VoiceTtsVoiceInRO getVoice() {
        return voice;
    }
    public void setVoice(VoiceTtsVoiceInRO voice) {
        this.voice = voice;
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
}
