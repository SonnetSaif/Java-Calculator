/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 *
 * @author Home
 */
public class Calculator extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operation;
    
    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        JTextDisplay = new javax.swing.JTextField();
        JBtn1 = new javax.swing.JButton();
        JBtn2 = new javax.swing.JButton();
        JBtn3 = new javax.swing.JButton();
        JBtn4 = new javax.swing.JButton();
        JBtn5 = new javax.swing.JButton();
        JBtn6 = new javax.swing.JButton();
        JBtn7 = new javax.swing.JButton();
        JBtn8 = new javax.swing.JButton();
        JBtn9 = new javax.swing.JButton();
        JBtn11 = new javax.swing.JButton();
        JBtn10 = new javax.swing.JButton();
        JBtn12 = new javax.swing.JButton();
        JBtn15 = new javax.swing.JButton();
        JBtn16 = new javax.swing.JButton();
        Jbtn15 = new javax.swing.JButton();
        Jbtn16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTextDisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDisplayActionPerformed(evt);
            }
        });

        JBtn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn1.setText("1");
        JBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn1ActionPerformed(evt);
            }
        });

        JBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn2.setText("2");
        JBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn2ActionPerformed(evt);
            }
        });

        JBtn3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn3.setText("3");
        JBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn3ActionPerformed(evt);
            }
        });

        JBtn4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn4.setText("4");
        JBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn4ActionPerformed(evt);
            }
        });

        JBtn5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn5.setText("5");
        JBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn5ActionPerformed(evt);
            }
        });

        JBtn6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn6.setText("6");
        JBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn6ActionPerformed(evt);
            }
        });

        JBtn7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn7.setText("7");
        JBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn7ActionPerformed(evt);
            }
        });

        JBtn8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn8.setText("8");
        JBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn8ActionPerformed(evt);
            }
        });

        JBtn9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn9.setText("9");
        JBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn9ActionPerformed(evt);
            }
        });

        JBtn11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn11.setText("+");
        JBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn11ActionPerformed(evt);
            }
        });

        JBtn10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn10.setText("0");
        JBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn10ActionPerformed(evt);
            }
        });

        JBtn12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn12.setText("-");
        JBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn12ActionPerformed(evt);
            }
        });

        JBtn15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn15.setText("/");
        JBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn15ActionPerformed(evt);
            }
        });

        JBtn16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JBtn16.setText("*");
        JBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn16ActionPerformed(evt);
            }
        });

        Jbtn15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Jbtn15.setText("C");
        Jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn15ActionPerformed(evt);
            }
        });

        Jbtn16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Jbtn16.setText("=");
        Jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jbtn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(JBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(JBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(JBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(JBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(JBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jbtn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn16, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn4ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn4.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn4ActionPerformed

    private void JBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn3ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn3.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn3ActionPerformed

    private void JBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn7ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn7.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn7ActionPerformed

    private void JBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn8ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn8.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn8ActionPerformed

    private void JBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn11ActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(JTextDisplay.getText());
        JTextDisplay.setText("");
        operation = "+";
    }//GEN-LAST:event_JBtn11ActionPerformed

    private void JBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn12ActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(JTextDisplay.getText());
        JTextDisplay.setText("");
        operation = "-";
    }//GEN-LAST:event_JBtn12ActionPerformed

    private void Jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn15ActionPerformed
        // TODO add your handling code here:
        JTextDisplay.setText("");
        
    }//GEN-LAST:event_Jbtn15ActionPerformed

    private void JBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn2ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn2.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn2ActionPerformed

    private void JBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn1ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn1.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn1ActionPerformed

    private void JTextDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDisplayActionPerformed

    private void JBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn5ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn5.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn5ActionPerformed

    private void JBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn6ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn6.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn6ActionPerformed

    private void JBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn9ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn9.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn9ActionPerformed

    private void JBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn10ActionPerformed
        // TODO add your handling code here:
        String EnterNumber  = JTextDisplay.getText() + JBtn10.getText();
        JTextDisplay.setText(EnterNumber);
    }//GEN-LAST:event_JBtn10ActionPerformed

    private void JBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn16ActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(JTextDisplay.getText());
        JTextDisplay.setText("");
        operation = "*";
    }//GEN-LAST:event_JBtn16ActionPerformed

    private void JBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn15ActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(JTextDisplay.getText());
        JTextDisplay.setText("");
        operation = "/";
    }//GEN-LAST:event_JBtn15ActionPerformed

    private void Jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn16ActionPerformed
        // TODO add your handling code here:
        String ans;
        
        secondnum = Double.parseDouble(JTextDisplay.getText());
        
        if(operation == "+")
        {
            result = firstnum + secondnum;
            ans = String.format("%.0f",result);
            JTextDisplay.setText(ans);
        }
        else if(operation == "-")
        {
            result = firstnum - secondnum;
            ans = String.format("%.0f",result);
            JTextDisplay.setText(ans);
        }
        else if(operation == "*")
        {
            result = firstnum * secondnum;
            ans = String.format("%.0f",result);
            JTextDisplay.setText(ans);
        }
        else if(operation == "/")
        {
            result = firstnum / secondnum;
            ans = String.format("%.0f",result);
            JTextDisplay.setText(ans);
        }
    }//GEN-LAST:event_Jbtn16ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn1;
    private javax.swing.JButton JBtn10;
    private javax.swing.JButton JBtn11;
    private javax.swing.JButton JBtn12;
    private javax.swing.JButton JBtn15;
    private javax.swing.JButton JBtn16;
    private javax.swing.JButton JBtn2;
    private javax.swing.JButton JBtn3;
    private javax.swing.JButton JBtn4;
    private javax.swing.JButton JBtn5;
    private javax.swing.JButton JBtn6;
    private javax.swing.JButton JBtn7;
    private javax.swing.JButton JBtn8;
    private javax.swing.JButton JBtn9;
    private javax.swing.JTextField JTextDisplay;
    private javax.swing.JButton Jbtn15;
    private javax.swing.JButton Jbtn16;
    // End of variables declaration//GEN-END:variables
}
