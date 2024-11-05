package gradingBook;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author madia
 */
public class Students_Marks extends javax.swing.JFrame {

    /**
     * Creates new form Students_Marks
     */
    public Students_Marks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StudentNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StudentName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        test1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        test2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        assignment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        preset = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        exam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        sem = new javax.swing.JTextField();
        fnmark = new javax.swing.JTextField();
        moduleview = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 153)));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("STUDENTS MARKS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 26, 333, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Student Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 118, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 118, -1, -1));

        StudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNumberActionPerformed(evt);
            }
        });
        jPanel1.add(StudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 122, 82, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Student Names");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 156, -1, -1));
        jPanel1.add(StudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 160, 82, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Test 1 Marks");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 200, -1, -1));
        jPanel1.add(test1, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 204, 82, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Test 2 Marks");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 244, -1, -1));

        test2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test2ActionPerformed(evt);
            }
        });
        jPanel1.add(test2, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 248, 82, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Assignment Marks");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 288, -1, -1));
        jPanel1.add(assignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 291, 82, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Presentation Marks");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 325, -1, -1));
        jPanel1.add(preset, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 329, 82, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student Number", "Module", "Student Names", "Test 1 Marks", "Test 2 Marks", "Assignment", "Presentation Marks", "Semester Marks", "Examination Marks", "Final Marks"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 509, 874, 152));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Examination Marks");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 391, 164, -1));

        exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examActionPerformed(evt);
            }
        });
        jPanel1.add(exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 395, 82, -1));

        jButton1.setText("Calculate Semester Marks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jButton2.setText("Calculate Final Marks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 435, -1, -1));

        jButton3.setText("<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, -1, -1));

        jButton4.setText("Add Student");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        jPanel1.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 357, 82, -1));
        jPanel1.add(fnmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 435, 82, -1));

        moduleview.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Module" }));
        jPanel1.add(moduleview, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public int Semesteer(int T1, int T2, int Ass , int Pre ){
            return (T1+T2)/4 + (Ass+Pre)/4;
        }
        public Boolean Qualify(int T1, int T2, int Ass , int Pre ){
            return Semesteer(T1,T2, Ass,Pre) >=40;
        }
        public int FinalMark(int T1, int T2, int Ass , int Pre, int examm){
            return (Semesteer(T1,T2, Ass,Pre)*60)/100 + (examm*40)/100;
        }
    private void examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examActionPerformed

    private void test2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test2ActionPerformed

    private void StudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNumberActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Lecturer_Page Lr = new Lecturer_Page();
        Lr.show();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int T1 = parseInt(test1.getText());
        int T2 = parseInt(test2.getText());
        int Ass = parseInt(assignment.getText());
        int Pre = parseInt(preset.getText());
        int smInt = Semesteer(T1,T2,Ass,Pre);
        String sm = Integer.toString(smInt);
        sem.setText(sm);
      if(  !Qualify(T1,T2,Ass,Pre)){
          exam.setText("0");
          exam.setEnabled(false);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int T1 = parseInt(test1.getText());
        int T2 = parseInt(test2.getText());
        int Ass = parseInt(assignment.getText());
        int Pre = parseInt(preset.getText());
        int smInt = Semesteer(T1,T2,Ass,Pre);
        int examm = parseInt(exam.getText());
        int mark = FinalMark(T1,T2,Ass,Pre,examm);
        fnmark.setText(Integer.toString(mark));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String pass = "";
 
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con = DriverManager.getConnection(url, user, pass);
 Statement stmt = con.createStatement();
 String query = "INSERT INTO grades VALUES ('" + StudentNumber.getText() + "','" + StudentName.getText() + "','"+moduleview.getSelectedItem().toString()+"','" + test1.getText() + "','"+test2.getText()+"','" + assignment.getText() + "','" + preset.getText() + "','" + sem.getText() + "','" + exam.getText() + "','"+fnmark.getText()+"')";
 stmt.executeUpdate(query);
 query = "SELECT * FROM grades";
 ResultSet rs = stmt.executeQuery(query);
 // Get the table model
 javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
 model.setRowCount(0); // Clear existing rows
 
 // Iterate through the result set and add rows to the table
 while (rs.next()) {
 
 String studentnumber = rs.getString("studentnumber");
 String studentName = rs.getString("studentnames");
 String module = rs.getString("module");
 String test1= rs.getString("test1");
 String test2 = rs.getString("test2");
 String assignment = rs.getString("assignment");
 String presentation = rs.getString("presentation");
 String semestermark = rs.getString("semestermark");
 String examination = rs.getString("ExaminationMark");
 String finalmark = rs.getString("finalmark");
                
 model.addRow(new Object[]{studentnumber, studentName,module, test1, test2, assignment,presentation,semestermark,examination,finalmark});
 }
 
 con.close();
 } catch (ClassNotFoundException e) {
 JOptionPane.showMessageDialog(this, "JDBC Driver not found: " + e.getMessage());
 } catch (SQLException e) {
 JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
 }
 
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
            java.util.logging.Logger.getLogger(Students_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students_Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StudentName;
    private javax.swing.JTextField StudentNumber;
    private javax.swing.JTextField assignment;
    private javax.swing.JTextField exam;
    private javax.swing.JTextField fnmark;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JComboBox<String> moduleview;
    private javax.swing.JTextField preset;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField test1;
    private javax.swing.JTextField test2;
    // End of variables declaration//GEN-END:variables
}