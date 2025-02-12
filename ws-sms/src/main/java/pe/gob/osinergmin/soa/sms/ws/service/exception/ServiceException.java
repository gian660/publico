package pe.gob.osinergmin.soa.sms.ws.service.exception;

import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

/**
 *
 * @author otheo
 */
public class ServiceException extends Exception {

    private static final long serialVersionUID = 7858707037049777116L;

    private int errorCode;
    private String value;
    private boolean specifyValue;
    private SMSErrorEnum errorEnum;

    public ServiceException(SMSErrorEnum errorEnum, String value, Throwable cause) {
        super(errorEnum.getMessage(), cause);
        this.errorCode = errorEnum.getCode();
        this.value = value;
        this.specifyValue = true;
        this.errorEnum = errorEnum;
    }

    public ServiceException(SMSErrorEnum errorEnum, Throwable cause) {
        super(errorEnum.getMessage(), cause);
        this.errorCode = errorEnum.getCode();
        this.errorEnum = errorEnum;
    }

    public ServiceException(SMSErrorEnum errorEnum, String value) {
        super(errorEnum.getMessage());
        this.errorCode = errorEnum.getCode();
        this.value = value;
        this.specifyValue = true;
        this.errorEnum = errorEnum;
    }

    public ServiceException(SMSErrorEnum errorEnum) {
        super(errorEnum.getMessage());
        this.errorCode = errorEnum.getCode();
        this.errorEnum = errorEnum;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSpecifyValue() {
        return specifyValue;
    }

    public void setSpecifyValue(boolean specifyValue) {
        this.specifyValue = specifyValue;
    }

    public SMSErrorEnum getErrorEnum() {
        return errorEnum;
    }

    public void setErrorEnum(SMSErrorEnum errorEnum) {
        this.errorEnum = errorEnum;
    }

    public boolean isLogicError() {
        return errorEnum.isLogicError();
    }

}
