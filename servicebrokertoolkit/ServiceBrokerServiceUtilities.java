/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicebrokertoolkit;

import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.handler.HandlerResolver;
import servicebrokertoolkit.SbAuthHeader;
import servicebrokertoolkit.ServiceBrokerService;
import servicebrokertoolkit.ServiceBrokerServiceSoap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
/**
 *
 * @author Adedayo Omitayo adedayo.omitayo@gmail.com
 */
public class ServiceBrokerServiceUtilities {
    
    private static ServiceBrokerService serviceInstance;
    private static ServiceBrokerServiceSoap soapInstance;
    private static SbAuthHeader brokerCredentials;
    private static URL serviceBrokerURL;
    private static String labServerID;
    private final static Logger logger = Logger.getLogger(servicebrokertoolkit.ServiceBrokerService.class.getName());
    
    private ServiceBrokerServiceUtilities(){}
    
    public static URL getServiceBrokerURL() {
        return serviceBrokerURL;
    }

    public static void setServiceBrokerURL(URL serviceBrokerURL) {
        ServiceBrokerServiceUtilities.serviceBrokerURL = serviceBrokerURL;
    }
    
    public static SbAuthHeader getBrokerCredentials() {
        return brokerCredentials;
    }

    public static void setBrokerCredentials(SbAuthHeader brokerCredentials) {
        ServiceBrokerServiceUtilities.brokerCredentials = brokerCredentials;
    }

    public static ServiceBrokerService getServiceInstance() {
        if (ServiceBrokerServiceUtilities.serviceInstance == null){
            if(ServiceBrokerServiceUtilities.getServiceBrokerURL() == null)
                ServiceBrokerServiceUtilities.serviceInstance = new ServiceBrokerService();
            else{
                try{
                    URL wsdlURL = new URL(ServiceBrokerServiceUtilities.getServiceBrokerURL().toString() + "?wsdl");
                    QName qName = new QName("http://ilab.mit.edu", "ServiceBrokerService");
                    ServiceBrokerServiceUtilities.serviceInstance = new ServiceBrokerService(wsdlURL, qName);
                }
                catch(MalformedURLException urlEx){
                    logger.warning(urlEx.getMessage());
                }
            }
            HandlerResolver handlerResolver = ServiceBrokerServiceUtilities.createHandlerResolver();
            ServiceBrokerServiceUtilities.serviceInstance.setHandlerResolver(handlerResolver);
        }
        
        return ServiceBrokerServiceUtilities.serviceInstance;
    }
    
    public static ServiceBrokerServiceSoap getSoapInstance(){
        if(ServiceBrokerServiceUtilities.soapInstance ==  null)
            ServiceBrokerServiceUtilities.soapInstance = ServiceBrokerServiceUtilities.getServiceInstance().getServiceBrokerServiceSoap();
        
        return ServiceBrokerServiceUtilities.soapInstance;
    }
    
    private static HandlerResolver createHandlerResolver(){
        HandlerResolver handlerResolver = new HandlerResolver() {
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                SOAPHandler authHeaderHandler = new SOAPHandler<SOAPMessageContext>() {

                    public Set getHeaders() {
                        return null;
                    }

                    public boolean handleMessage(SOAPMessageContext context) {
                        try{
                            //ensure that credentials have been made avalable if not fail gracefully?
                            SbAuthHeader authHeader = ServiceBrokerServiceUtilities.getBrokerCredentials();
                            if(authHeader == null)
                                return true;
                            //System.out.println(authHeader.getCouponID() + " " + authHeader.getCouponPassKey());
                            //Ensure a header section is in the soap message. If there isn't one, create it.
                            SOAPPart soapPart = context.getMessage().getSOAPPart();
                            SOAPHeader header =  soapPart.getEnvelope().getHeader();
                            if(header == null){
                                header = soapPart.getEnvelope().addHeader();
                            }
                            //Write the Service broker credentials to the auth header just created
                            JAXBContext jaxbContext = JAXBContext.newInstance(SbAuthHeader.class);
                            Marshaller marshaller =  jaxbContext.createMarshaller();
                            marshaller.marshal(authHeader, header);
                        }
                        catch(SOAPException ex)
                        {
                            ex.printStackTrace();
                        }
                        catch(JAXBException jEx)
                        {
                            //System.err.println(jEx.getMessage());
                            jEx.printStackTrace();
                        }
                        return true;
                    }

                    public boolean handleFault(SOAPMessageContext context) {
                        return true;
                    }

                    public void close(MessageContext context) {
                        
                    }
                };
                List<Handler> handlerChain = new ArrayList<Handler>();
                handlerChain.add(authHeaderHandler);
                return handlerChain;
            }
        };
        return handlerResolver;
    }

    public static String getLabServerID() {
        return labServerID;
    }

    public static void setLabServerID(String labServerID) {
        ServiceBrokerServiceUtilities.labServerID = labServerID;
    }
    
    
}
