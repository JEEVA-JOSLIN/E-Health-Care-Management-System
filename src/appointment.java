/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Naga
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class appointment extends javax.swing.JFrame {
    private String  n,e;

    /**
     * Creates new form appointment
     */
    public appointment(String a,String b) {
        initComponents();
        n=a;
        e=b;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare","root","");
            JOptionPane.showMessageDialog(null,"Connected");        
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        symptoms = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        label5 = new java.awt.Label();
        reason = new java.awt.TextField();
        date = new java.awt.TextField();
        time = new java.awt.TextField();
        cancel = new java.awt.Button();
        BACK = new java.awt.Button();
        submit = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        Symptoms = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();

        symptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Reason");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, 32));

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Symptoms");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 105, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Date");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 105, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Time");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 125, -1));

        label5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label5.setText(" Patient Appointment Form");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label5.getAccessibleContext().setAccessibleName(" APPOINTMENT FORM");

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 90));

        reason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonActionPerformed(evt);
            }
        });
        getContentPane().add(reason, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 340, 60));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 355, 45));

        time.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 355, 35));

        cancel.setActionCommand("BACK\n");
        cancel.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        cancel.setLabel("BACK\n");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 123, 39));

        BACK.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        BACK.setLabel("update");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 129, 39));
        BACK.getAccessibleContext().setAccessibleName("");

        submit.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        submit.setLabel("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 135, 39));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Symptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymptomsActionPerformed(evt);
            }
        });
        getContentPane().add(Symptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 350, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 1350, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
/*        // TODO add your handling code here:
         try 
        {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment","root","");
            Statement stmt = con.createStatement(); 
            // Inserting data in database       
                     
                      
            String q1 = "DELETE FROM patients where reason = "+reason.getText();
            
            stmt.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"Deleted");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
MainPage m=new MainPage(n,e);
m.show();
dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
       try 
        {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare","root","");
            Statement stmt = con.createStatement(); 
            // Inserting data in database       
                     
            String q1 = "UPDATE patients set date = '"+ date.getText()+"' WHERE reason = '"+reason.getText()+"'";
            stmt.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_BACKActionPerformed

    private void symptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomsActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
 try 
        {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare","root","");
            Statement stmt = con.createStatement(); 
            // Inserting data in database       
            String q1 = "insert into patients values('" +reason.getText()+"','"+Symptoms.getText()+"','"+date.getText()+"','"+time.getText()+"')";
            stmt.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"Inserted");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void SymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymptomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SymptomsActionPerformed

    private void reasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reasonActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        System.out.println("mouse pressed");
    }//GEN-LAST:event_jLabel3MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BACK;
    private java.awt.TextField Symptoms;
    private java.awt.Button cancel;
    private java.awt.TextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    private java.awt.TextField reason;
    private java.awt.Button submit;
    private java.awt.TextField symptoms;
    private java.awt.TextField time;
    // End of variables declaration//GEN-END:variables
}
