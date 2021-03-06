/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMS;

/**
 *
 * @author ASUS
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    String username;
    
    public Dashboard() {
        
    }
    public Dashboard(String uname ){
        initComponents();
        this.username = uname;
        txtusername.setText(username);
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userID = new javax.swing.JLabel();
        txtusername = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        viewStudentBtn = new javax.swing.JLabel();
        lbaddstudent = new javax.swing.JLabel();
        addCourseBtn = new javax.swing.JLabel();
        addTeacherBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        viewPaymentBtn = new javax.swing.JLabel();
        teacherViewBtn = new javax.swing.JLabel();
        viewCoursesBtn = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 574));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 680));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 51, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DashBoard");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 13, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home_50px.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 43));

        userID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Admin_50px.png"))); // NOI18N
        jPanel3.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 43));

        txtusername.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setText("UserID");
        txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernameMouseClicked(evt);
            }
        });
        jPanel3.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 80, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close Window_48px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 80));

        viewStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Students_80px.png"))); // NOI18N
        viewStudentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewStudentBtnMouseClicked(evt);
            }
        });
        jPanel2.add(viewStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 80, 90));

        lbaddstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add User Male_80px.png"))); // NOI18N
        lbaddstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbaddstudentMouseClicked(evt);
            }
        });
        jPanel2.add(lbaddstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, 90));

        addCourseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add List_80px.png"))); // NOI18N
        addCourseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCourseBtnMouseClicked(evt);
            }
        });
        jPanel2.add(addCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 80, 90));

        addTeacherBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Classroom_80px.png"))); // NOI18N
        addTeacherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTeacherBtnMouseClicked(evt);
            }
        });
        jPanel2.add(addTeacherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 80, 90));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("View Teachers");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel13.setText("Add Teacher");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        viewPaymentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cash in Hand_80px.png"))); // NOI18N
        viewPaymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPaymentBtnMouseClicked(evt);
            }
        });
        jPanel2.add(viewPaymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 80, 90));

        teacherViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference_80px.png"))); // NOI18N
        teacherViewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherViewBtnMouseClicked(evt);
            }
        });
        jPanel2.add(teacherViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 80, 90));

        viewCoursesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Course_80px.png"))); // NOI18N
        viewCoursesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCoursesBtnMouseClicked(evt);
            }
        });
        jPanel2.add(viewCoursesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 80, 90));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel18.setText("View Students");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel19.setText("View Courses");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel20.setText("Student Registration");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel21.setText("Add Course");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel22.setText("View Payments");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 650, 480));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 75, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 186, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbaddstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbaddstudentMouseClicked
        // TODO add your handling code here:
        String name=txtusername.getText();
        dispose();
        StudentAdd stuadd = new StudentAdd(name);
        stuadd.setVisible(true);
    }//GEN-LAST:event_lbaddstudentMouseClicked

    private void txtusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameMouseClicked
        // TODO add your handling code here:
        String name= txtusername.getText();
        dispose();
        AdminViewProfile viewprofile = new AdminViewProfile(name);
        viewprofile.setVisible(true);
    }//GEN-LAST:event_txtusernameMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void viewStudentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStudentBtnMouseClicked
        // TODO add your handling code here:
        String name= txtusername.getText();
        dispose();
        StudentSearch stusearch = new StudentSearch(name);
        stusearch.setVisible(true);
    }//GEN-LAST:event_viewStudentBtnMouseClicked

    private void addCourseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCourseBtnMouseClicked
        String name= txtusername.getText();
        dispose();
        new CourseAdd(name).setVisible(true);
    }//GEN-LAST:event_addCourseBtnMouseClicked

    private void viewCoursesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCoursesBtnMouseClicked
        String name= txtusername.getText();
        dispose();
        new CourseView(name).setVisible(true);
    }//GEN-LAST:event_viewCoursesBtnMouseClicked

    private void viewPaymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPaymentBtnMouseClicked
        String name= txtusername.getText();
        dispose();
        new PaymentsView(name).setVisible(true);
    }//GEN-LAST:event_viewPaymentBtnMouseClicked

    private void teacherViewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherViewBtnMouseClicked
        String name= txtusername.getText();
        dispose();
        new TeacherView(name).setVisible(true);
    }//GEN-LAST:event_teacherViewBtnMouseClicked

    private void addTeacherBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTeacherBtnMouseClicked
        String name= txtusername.getText();
        dispose();
        new TeacherAdd(name).setVisible(true);
    }//GEN-LAST:event_addTeacherBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard(" ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCourseBtn;
    private javax.swing.JLabel addTeacherBtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbaddstudent;
    private javax.swing.JLabel teacherViewBtn;
    private javax.swing.JLabel txtusername;
    private javax.swing.JLabel userID;
    private javax.swing.JLabel viewCoursesBtn;
    private javax.swing.JLabel viewPaymentBtn;
    private javax.swing.JLabel viewStudentBtn;
    // End of variables declaration//GEN-END:variables
}
