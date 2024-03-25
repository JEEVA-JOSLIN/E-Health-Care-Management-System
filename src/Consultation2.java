/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovoO
 */
public class Consultation2 extends javax.swing.JFrame {
       private String ne,em,q,g;
    /**
     * Creates new form Consultation2
     */
       public Consultation2()
       {
           initComponents();
       }
    public Consultation2(String a,String b,String c) {
        initComponents();
     
        ne=a;
        em=b;
        q=c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        gg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("AUTO SELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SPECIALIZATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));
        getContentPane().add(dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 155, -1));

        jButton2.setText("SELECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jButton3.setText("SHOW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO", "GID", "NAME", "SPECIALIZATION", "LOCATION", "NO OF CONSULTATION", "RATING"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 930, -1));

        jButton6.setText("SEND");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, -1, -1));

        jButton7.setText("CANCEL AUTOSELECT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        gg.setText("te");
        getContentPane().add(gg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 158, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GOV ID of chosen doctor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stetes.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        q="I have eye irritation";
        if(q.indexOf("eye")!=-1||q.indexOf("nose")!=-1||q.indexOf("ear")!=-1||q.indexOf("pain")!=-1)
            dr.setText("OPTHALMOLOGIST");
        if(q.indexOf("stomach")!=-1||q.indexOf("vomit")!=-1||q.indexOf("dysentary")!=-1||q.indexOf("fever")!=-1)
            dr.setText("GENERAL");
        if(q.indexOf("child")!=-1||q.indexOf("baby")!=-1||q.indexOf("pregnancy")!=-1||q.indexOf("vaccine")!=-1)
            dr.setText("GYNAECOLOGIST");
        if(q.indexOf("heart")!=-1||q.indexOf("blood")!=-1||q.indexOf("attack")!=-1||q.indexOf("stroke")!=-1)
            dr.setText("CARDIOLOGIST");
        if(q.indexOf("bone")!=-1||q.indexOf("hand")!=-1||q.indexOf("leg")!=-1||q.indexOf("hip")!=-1)
            dr.setText("ORTHOPEDIC");
        if(q.indexOf("sprain")!=-1||q.indexOf("nerve")!=-1||q.indexOf("brain")!=-1||q.indexOf("cramp")!=-1)
            dr.setText("NEUROLOGIST");
        if(q.indexOf("teeth")!=-1||q.indexOf("mouth")!=-1||q.indexOf("tooth")!=-1||q.indexOf("ache")!=-1)
            dr.setText("DENTIST");
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String spl=dr.getText();
        JOptionPane.showMessageDialog(null,"YOU HAVE CHOSEN "+spl);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare","root","");
        
            Statement st=con.createStatement();
            String u=dr.getText();
            String sql="select * from doctor WHERE specialization='"+ dr.getText()+"'";
            ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              
              
                String i=String.valueOf(rs.getInt("dno"));
                String g=String.valueOf(rs.getInt("gid"));
                String si=rs.getString("name");
                 String tott=rs.getString("specialization");
                 String q=rs.getString("location");
                  String n=String.valueOf(rs.getInt("noc"));
                String r=String.valueOf(rs.getFloat("rating"));
               
              String tbData[]={i,g,si,tott,q,n,r};
                    DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }
            con.close();
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int sr=jTable1.getSelectedRow();
        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        g=tblModel.getValueAt(sr,1).toString();
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try 
        {
            JOptionPane.showMessageDialog(null,g);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealthcare","root","");
            Statement stmt = con.createStatement(); 
            // Inserting data in database       
            gg.setText(g);
            String q1 = "SELECT * FROM doctor WHERE gid='"+gg.getText()+"'" ;
            ResultSet rs=stmt.executeQuery(q1);
            rs.next();
            
             
                    String e=rs.getString("email");
                    JOptionPane.showMessageDialog(null,"YOUR DOCTOR WILL CONTACT YOU SOON!!!! FOR EMERGENCY MAIL TO "+e);
                    Email m=new Email();
                    m.createAndSendEmail("jeevajoslinehealthcareservice@gmail.com"," ","CONSULTATION NEEDED!!!<br>\r\n PATIENT QUERY :"+q+" EMAIL:"+em,e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
dr.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Consultation n=new Consultation(ne,em);
n.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultation2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dr;
    private javax.swing.JTextField gg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}