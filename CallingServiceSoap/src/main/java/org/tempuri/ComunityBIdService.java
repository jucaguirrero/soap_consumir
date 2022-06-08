
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ComunityBIdService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://meddit-interface-3fafemp3rq-uc.a.run.app/wsdl?wsdl")
public class ComunityBIdService
    extends Service
{

    private final static URL COMUNITYBIDSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMUNITYBIDSERVICE_EXCEPTION;
    private final static QName COMUNITYBIDSERVICE_QNAME = new QName("http://tempuri.org/", "ComunityBIdService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://meddit-interface-3fafemp3rq-uc.a.run.app/wsdl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMUNITYBIDSERVICE_WSDL_LOCATION = url;
        COMUNITYBIDSERVICE_EXCEPTION = e;
    }

    public ComunityBIdService() {
        super(__getWsdlLocation(), COMUNITYBIDSERVICE_QNAME);
    }

    public ComunityBIdService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMUNITYBIDSERVICE_QNAME, features);
    }

    public ComunityBIdService(URL wsdlLocation) {
        super(wsdlLocation, COMUNITYBIDSERVICE_QNAME);
    }

    public ComunityBIdService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMUNITYBIDSERVICE_QNAME, features);
    }

    public ComunityBIdService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComunityBIdService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ComunityBIdSoapPort
     */
    @WebEndpoint(name = "ComunityBIdServiceSoapPort")
    public ComunityBIdSoapPort getComunityBIdServiceSoapPort() {
        return super.getPort(new QName("http://tempuri.org/", "ComunityBIdServiceSoapPort"), ComunityBIdSoapPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComunityBIdSoapPort
     */
    @WebEndpoint(name = "ComunityBIdServiceSoapPort")
    public ComunityBIdSoapPort getComunityBIdServiceSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "ComunityBIdServiceSoapPort"), ComunityBIdSoapPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMUNITYBIDSERVICE_EXCEPTION!= null) {
            throw COMUNITYBIDSERVICE_EXCEPTION;
        }
        return COMUNITYBIDSERVICE_WSDL_LOCATION;
    }

}
