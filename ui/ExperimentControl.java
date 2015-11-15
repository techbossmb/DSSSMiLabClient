package ui;

import java.io.StringReader;
import java.io.StringWriter;
import javax.swing.JFrame;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import pedagogicalcontent.DsssExperiment;
import pedagogicalcontent.DsssExperimentResult;
import servicebrokertoolkit.ClientSubmissionReport;
import servicebrokertoolkit.LabExperimentStatus;
import servicebrokertoolkit.ResultReport;
import servicebrokertoolkit.SbAuthHeader;
import servicebrokertoolkit.ServiceBrokerServiceSoap;
import servicebrokertoolkit.ServiceBrokerServiceUtilities;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExperimentControl.java
 *
 * Created on Oct 30, 2010, 5:41:51 PM
 */

/**
 *
 * @author Ishola Babatunde I.
 * techbossmb@yahoo.com, isholabi@gmail.com
 */
public class ExperimentControl extends javax.swing.JPanel {
    private ClientSubmissionReport subReport;
    private LabExperimentStatus expStatus;
    private static DsssExperiment exp;
    private static DsssExperimentResult expResult;
    public int analog;
    public int digital;
    private JFrame oscilloscopeFrame;
    private Oscilloscope oscilloscope;
///////////////////////////////////////////////constructor
    /** Creates new form ExperimentControl */
    public ExperimentControl() {
        initComponents();
        ExperimentControl.exp = new DsssExperiment();
        ExperimentControl.exp.setAnalog(1);
        ExperimentControl.exp.setDigital(1);
        this.oscilloscopeFrame = new JFrame("Oscilloscope");
        this.oscilloscopeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.oscilloscopeFrame.setVisible(false);
        this.oscilloscope = new Oscilloscope();
        this.oscilloscopeFrame.add(this.oscilloscope);
        this.oscilloscopeFrame.setLocation(520, 50);
        this.oscilloscopeFrame.pack();
    }
/////////////////////////////////////////////////////////////submit
    public void submitExperiment(){
        this.subReport = null;
        this.labStatus.setText("Attempting to submit");
        
        
        if (jComboBox1.getSelectedIndex() == 0)
            ExperimentControl.exp.setAnalog(1);
        else if (jComboBox1.getSelectedIndex() == 1 )
            ExperimentControl.exp.setAnalog(2);
        else
            ExperimentControl.exp.setAnalog(3);
        
        if(jComboBox2.getSelectedIndex()==0)
            ExperimentControl.exp.setDigital(1);
        else if(jComboBox2.getSelectedIndex()==1)
            ExperimentControl.exp.setDigital(2);
        else
            ExperimentControl.exp.setDigital(3);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("pedagogicalcontent");
            Marshaller marshaller = jaxbContext.createMarshaller();
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(ExperimentControl.exp, stringWriter);
            String experimentSpecification = stringWriter.getBuffer().toString();
            SbAuthHeader broker = new SbAuthHeader();

            
            String labServerID = ServiceBrokerServiceUtilities.getLabServerID();
            ServiceBrokerServiceSoap serviceBrokerStub = ServiceBrokerServiceUtilities.getSoapInstance();
            
          
            this.subReport = serviceBrokerStub.submit(labServerID, experimentSpecification, 0, false);
        } catch (Exception ex1) {
            ex1.printStackTrace();
            this.labStatus.setText("Submission failed");
            
            return;
        }
        this.labStatus.setText("Experiment submitted");
       

    }
    ////////////////////////////////////////////////////////checkStatus
    private void checkExperimentStatus() {
        if (this.subReport == null) {
            return;
        }
        this.expStatus = null;
        this.labStatus.setText("Checking experiment status");

        try {

            ServiceBrokerServiceSoap serviceBrokerStub = ServiceBrokerServiceUtilities.getSoapInstance();
            while (true) {
                this.expStatus = serviceBrokerStub.getExperimentStatus(this.subReport.getExperimentID());
                if (this.expStatus.getStatusReport().getStatusCode() != 3) {
                    continue;
                } else {
                    break;
                }
            }

        } catch (Exception ex1) {
            ex1.printStackTrace();
            this.labStatus.setText("Error checking status");

            return;
        }
        this.labStatus.setText("Result ready for download");

    }
/////////////////////////////////////////////////////////////////retrieve
    private void retrieveResult() {
        this.labStatus.setText("Attempting to download");


        try {
            ServiceBrokerServiceSoap serviceBrokerStub = ServiceBrokerServiceUtilities.getSoapInstance();
            ResultReport resultReport = serviceBrokerStub.retrieveResult(this.subReport.getExperimentID());
            String projectXML = resultReport.getExperimentResults();
            //Unmarshal the XML
            JAXBContext jaxbContext = JAXBContext.newInstance("pedagogicalcontent");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(projectXML);
            ExperimentControl.expResult = ((JAXBElement<DsssExperimentResult>) unmarshaller.unmarshal(reader)).getValue();
        } catch (Exception ex1) {
            ex1.printStackTrace();
            this.labStatus.setText("Download failed");
            return;
        }
        this.labStatus.setText("Results downloaded.");

        //this.displayresultwaveform();

    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        labStatus = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100KHz sine", "100KHz cos", "2KHz sine" }));
        jComboBox1.setBounds(10, 150, 100, 20);
        jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Run");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(200, 150, 60, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100KHz Digital", "8KHz Digital", "2KHz Digital" }));
        jComboBox2.setBounds(10, 260, 100, 20);
        jLayeredPane1.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CH A"));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("view");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.setBounds(390, 10, 110, 60);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CH B"));

        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel2.setBounds(390, 100, 110, 60);
        jLayeredPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pibc.jpg"))); // NOI18N
        jLabel1.setBounds(10, 10, 390, 310);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jProgressBar1.setBounds(200, 150, 60, 14);
        jLayeredPane1.add(jProgressBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labStatus.setEditable(false);
        labStatus.setText("...lab in progress");
        labStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labStatusActionPerformed(evt);
            }
        });
        labStatus.setBounds(10, 320, 390, 20);
        jLayeredPane1.add(labStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ExperimentControl.expResult != null){
            this.oscilloscope.setChannel1Data(ExperimentControl.expResult.getChannel1Data());
            this.oscilloscope.setChannel2Data(ExperimentControl.expResult.getChannel2Data());
        }
        this.oscilloscopeFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
            ExperimentControl.exp.setAnalog(jComboBox1.getSelectedIndex()+1);
            ExperimentControl.exp.setDigital(jComboBox2.getSelectedIndex()+1);
        } catch (Exception e){

        }
        try{
////            this.jButtonView.setEnabled(false);
            this.submitExperiment();
            this.checkExperimentStatus();
            this.retrieveResult();
//            this.jButtonView.setEnabled((ExperimentControl.experimentResult != null));
        } catch(ExceptionInInitializerError initErr){
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(ExperimentControl.expResult != null){
            this.oscilloscope.setChannel1Data(ExperimentControl.expResult.getChannel1Data());
            this.oscilloscope.setChannel2Data(ExperimentControl.expResult.getChannel2Data());
        }
        this.oscilloscopeFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Direct Sequence Spread Spectrum Modulation");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ExperimentControl panel = new ExperimentControl();
                frame.add(panel);
                frame.setVisible(true);
                frame.pack();
                //frame.setLocation(40,100);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField labStatus;
    // End of variables declaration//GEN-END:variables

}
