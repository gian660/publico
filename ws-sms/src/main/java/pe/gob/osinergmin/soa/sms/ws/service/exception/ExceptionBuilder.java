package pe.gob.osinergmin.soa.sms.ws.service.exception;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.fault.ComponenteMiddlewareTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.fault.GenericoTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.fault.OsinergminFaultResponseTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.fault.OsinergminFaultTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.fault.TipoErrorTYPE;
import pe.gob.osinergmin.soa.sms.ws.service.ComunFaultMsg;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;

/**
 *
 * @author otheo
 */
public final class ExceptionBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionBuilder.class);

    private ExceptionBuilder() {
    }

    public static ComunFaultMsg buildException(String serviceName, String operationName, ServiceException ex) {
        OsinergminFaultResponseTYPE faultResponseTYPE = new OsinergminFaultResponseTYPE();
        OsinergminFaultTYPE faultTYPE = new OsinergminFaultTYPE();
        faultTYPE.setCodigoError(String.valueOf(ex.getErrorCode()));
        faultTYPE.setComponenteMiddleware(ComponenteMiddlewareTYPE.APS);
        faultTYPE.setDescripcionError(ex.getMessage());
        faultTYPE.setIdServicio(serviceName);
        faultTYPE.setOperacion(operationName);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        try {
            faultTYPE.setFinEjecucion(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        } catch (DatatypeConfigurationException dcex) {
            LOGGER.error(PropertiesUtils.APP_NAME + "No se pudo crear el gregorian calendar de la fecha actual.", dcex);
        }

        if (ex.isSpecifyValue()) {
            GenericoTYPE mensajeEntrada = new GenericoTYPE();
            List<Object> content = mensajeEntrada.getContent();
            content.add(ex.getValue());
            faultTYPE.setMensajeEntrada(mensajeEntrada);
        }

        faultTYPE.setTipoError(ex.isLogicError() ? TipoErrorTYPE.NEGOCIO : TipoErrorTYPE.TECNICO);

        faultResponseTYPE.setFalla(faultTYPE);

        return new ComunFaultMsg(ex.getMessage(), faultTYPE, ex);
    }

}
