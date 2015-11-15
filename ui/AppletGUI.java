/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidParameterException;
import servicebrokertoolkit.ServiceBrokerServiceUtilities;
import javax.swing.JApplet;
import javax.swing.UIManager;
import servicebrokertoolkit.SbAuthHeader;


/**
 *
 * @author Tunde Ishola
 */
public class AppletGUI extends JApplet {
    @Override
    public void init(){
    initializeWebService();
    initializeInterface();
    }

    @Override
    public String[][] getParameterInfo() {
        String [][] parameterInfo = {
            {"serviceBrokerServiceURL", "URL" ,"The Url for the Service broker web service"},
            {"couponID", "int" ,"The coupon id for this clients transactions"},
            {"couponPassKey", "String" ,"The passkey for this clients transactions"},
            {"labServerID", "String" ,"The GUID for the ADLab Server"}
        };
        return parameterInfo;
    }

    private void initializeWebService(){
        String serviceBrokerURL = getParameter("serviceBrokerURL");
        String couponID = getParameter("couponID");
        String passkey = getParameter("PassKey");
        String labServerID = getParameter("labServerID");
        if(serviceBrokerURL == null){
            throw new InvalidParameterException("The URL for the Service Broker service has to be supplied");
        }
        try{
            URL url = new URL(serviceBrokerURL);
            ServiceBrokerServiceUtilities.setServiceBrokerURL(url);
        }
        catch(MalformedURLException urlEx){
            throw new InvalidParameterException("The URL supplied for the Service broker service is not valid");
        }


        if(couponID ==null){
            throw new InvalidParameterException("Coupon Id required");
        }
        if(passkey == null){
            throw new InvalidParameterException("Coupon passkey required");
        }

        try{
            SbAuthHeader brokerCredentials = new SbAuthHeader();
            brokerCredentials.setCouponID( Long.parseLong(couponID));
            brokerCredentials.setCouponPassKey(passkey);
            ServiceBrokerServiceUtilities.setBrokerCredentials(brokerCredentials);
        }
        catch(NumberFormatException numFomatEx){
            throw new InvalidParameterException("The coupon id " + couponID + " is invalid");
        }

        if(labServerID == null){
            throw new InvalidParameterException("labserver ID required");
        }
        ServiceBrokerServiceUtilities.setLabServerID(labServerID);

    }

    private void initializeInterface() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
          e.printStackTrace();
        }
        ExperimentControl panel = new ExperimentControl();
        this.setContentPane(panel);
        this.setSize(520, 350);
    }
    @Override
    public void start(){
    }

}
