/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisVentanas;

import MisClases.Persona;

/**
 *
 * @author Aitor Alday
 */
public class VPrincipal extends javax.swing.JFrame {

    public static Persona pe;
    public VPrincipal(int tipo) {
        initComponents();
        
        
        
        habilitarModo(tipo);
        
        //setLocationRelativeTo(null);
    }
    public VPrincipal() {
        initComponents();
        
        pe = proyecto.Proyecto.per;
        
     
        
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

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmUsuario = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmDuenio = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        miBorrarEq = new javax.swing.JMenuItem();
        miModEq = new javax.swing.JMenuItem();
        miNuevoEq = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jmAdmin = new javax.swing.JMenu();
        miJugador = new javax.swing.JMenuItem();
        miEquipo = new javax.swing.JMenuItem();
        miPersona = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenu5.setText("jMenu5");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu10.setText("jMenu10");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisVentanas/imagenes/FondoPrincipal.jpg"))); // NOI18N

        jmUsuario.setText("Usuario");

        jMenuItem3.setText("Clasificación");
        jmUsuario.add(jMenuItem3);

        jMenuBar1.add(jmUsuario);

        jmDuenio.setText("Dueño");

        jMenu4.setText("Gestionar equipos");

        miBorrarEq.setText("Eliminar Equipo");
        miBorrarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBorrarEqActionPerformed(evt);
            }
        });
        jMenu4.add(miBorrarEq);

        miModEq.setText("Modificar Equipos");
        jMenu4.add(miModEq);

        miNuevoEq.setText("Nuevo Equipo");
        miNuevoEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoEqActionPerformed(evt);
            }
        });
        jMenu4.add(miNuevoEq);

        jmDuenio.add(jMenu4);

        jMenuItem9.setText("Clasificación");
        jmDuenio.add(jMenuItem9);

        jMenuItem10.setText("Última jornada");
        jmDuenio.add(jMenuItem10);

        jMenuBar1.add(jmDuenio);

        jmAdmin.setText("Administrador");

        miJugador.setText("Jugadores");
        miJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miJugadorActionPerformed(evt);
            }
        });
        jmAdmin.add(miJugador);

        miEquipo.setText("Equipos");
        miEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEquipoActionPerformed(evt);
            }
        });
        jmAdmin.add(miEquipo);

        miPersona.setText("Personas");
        miPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPersonaActionPerformed(evt);
            }
        });
        jmAdmin.add(miPersona);

        jMenuItem11.setText("Calendario");
        jmAdmin.add(jMenuItem11);

        jMenuBar1.add(jmAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel2)
                    .addContainerGap(738, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel2)
                    .addContainerGap(521, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNuevoEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoEqActionPerformed
        
    }//GEN-LAST:event_miNuevoEqActionPerformed

    private void miJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miJugadorActionPerformed
        proyecto.Proyecto.abrirJugador();
    }//GEN-LAST:event_miJugadorActionPerformed

    private void miEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEquipoActionPerformed
        proyecto.Proyecto.abrirEquipos();
    }//GEN-LAST:event_miEquipoActionPerformed

    private void miPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPersonaActionPerformed
        proyecto.Proyecto.abrirPersona();
    }//GEN-LAST:event_miPersonaActionPerformed

    private void miBorrarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBorrarEqActionPerformed
        
    }//GEN-LAST:event_miBorrarEqActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jmAdmin;
    private javax.swing.JMenu jmDuenio;
    private javax.swing.JMenu jmUsuario;
    private javax.swing.JMenuItem miBorrarEq;
    private javax.swing.JMenuItem miEquipo;
    private javax.swing.JMenuItem miJugador;
    private javax.swing.JMenuItem miModEq;
    private javax.swing.JMenuItem miNuevoEq;
    private javax.swing.JMenuItem miPersona;
    // End of variables declaration//GEN-END:variables

    private void habilitarModo(int tipo) {
        //Si no funciona llamar a MAGNO
        switch(tipo){
            case 0:
                jmUsuario.setEnabled(false);
                jmDuenio.setEnabled(false);
                break;
            case 1:
                jmDuenio.setEnabled(false);
                jmAdmin.setEnabled(false);
                break;
            case 2:
                jmUsuario.setEnabled(false);
                jmAdmin.setEnabled(false);
                break;
        }
    }
}
