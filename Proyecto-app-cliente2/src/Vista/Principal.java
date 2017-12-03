package Vista;

import com.google.gson.Gson;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.Partido;
import modelo.Torneo;

public class Principal extends javax.swing.JFrame {

    private Torneo torneo;

    public Principal() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setRowSelectionAllowed(true);
        jTable1.setColumnSelectionAllowed(false);
        jTable1.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Cargar_json = new javax.swing.JButton();
        JL_Torneo_actual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JB_Jugadores = new javax.swing.JButton();
        JCB_Ronda = new javax.swing.JComboBox<>();
        JL_Ronda = new javax.swing.JLabel();
        JB_Byes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JB_Cargar_json.setText("Cargar torneo");
        JB_Cargar_json.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Cargar_jsonActionPerformed(evt);
            }
        });

        JL_Torneo_actual.setText("Torneo DEPORTE, SEXO, PESO Y CINTURON");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Partido", "EquipoA", "EquipoB", "Ganador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        JB_Jugadores.setText("Ver jugadores");
        JB_Jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_JugadoresActionPerformed(evt);
            }
        });

        JCB_Ronda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        JCB_Ronda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_RondaActionPerformed(evt);
            }
        });

        JL_Ronda.setText("Ronda");

        JB_Byes.setText("Ver byes");
        JB_Byes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ByesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB_Cargar_json)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_Torneo_actual)
                        .addGap(0, 211, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL_Ronda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCB_Ronda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_Byes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Jugadores)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Cargar_json)
                    .addComponent(JL_Torneo_actual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_Ronda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Ronda)
                    .addComponent(JB_Jugadores)
                    .addComponent(JB_Byes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_JugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_JugadoresActionPerformed
        if (torneo != null) {
            Jugadores ventana = new Jugadores(this, true, this.torneo.getJugadores_bak());
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_JB_JugadoresActionPerformed

    private void JB_ByesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ByesActionPerformed
        if (torneo != null) {
            Byes ventana = new Byes(this, true, this.torneo.getExtras_bak());
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_JB_ByesActionPerformed

    private void JB_Cargar_jsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Cargar_jsonActionPerformed
        JFileChooser fileChooser = new JFileChooser("./Torneos_json");
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                Gson gson = new Gson();
                this.torneo = gson.fromJson(readFile(fileChooser.getSelectedFile().toString(), StandardCharsets.ISO_8859_1), Torneo.class);
                this.JCB_Ronda.removeAllItems();
                for (int i = 0; i <= torneo.getRonda(); i++) {
                    this.JCB_Ronda.addItem(Integer.toString(i));
                }
                this.JCB_Ronda.setSelectedIndex(torneo.getRonda());
                this.JL_Torneo_actual.setText("Torneo " + this.torneo.getDeporte() + ", " + this.torneo.getSexo() + ", " + this.torneo.getPeso() + " Kg Y " + this.torneo.getCinturon());
                actualizar();
            } catch (IOException ex) {
                System.out.println("[ERROR] Error leyendo archivo json");
            }
        }
    }//GEN-LAST:event_JB_Cargar_jsonActionPerformed

    private void JCB_RondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_RondaActionPerformed
        if (torneo != null) {
            actualizar();
        }
    }//GEN-LAST:event_JCB_RondaActionPerformed

    public void actualizar() {
        String col[] = {"ID Partido", "EquipoA", "EquipoB", "Ganador"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        for (Partido partido : torneo.getPartido(this.JCB_Ronda.getSelectedIndex())) {
            Object[] objeto = {
                partido.getId(),
                partido.getJugadorA().getNombre_completo() + "(" + partido.getPuntajeA() + ")",
                partido.getJugadorB().getNombre_completo() + "(" + partido.getPuntajeB() + ")",
                partido.getGanador()
            };
            tableModel.addRow(objeto);
        }
        jTable1.setModel(tableModel);
        jTable1.repaint();
    }

    private String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Byes;
    private javax.swing.JButton JB_Cargar_json;
    private javax.swing.JButton JB_Jugadores;
    private javax.swing.JComboBox<String> JCB_Ronda;
    private javax.swing.JLabel JL_Ronda;
    private javax.swing.JLabel JL_Torneo_actual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
