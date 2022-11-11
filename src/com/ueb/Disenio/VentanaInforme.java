package com.ueb.Disenio;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.ueb.Algoritmos.Informe;

//import com.ueb.Algoritmos.Informe;

public class VentanaInforme extends JFrame implements ActionListener {

  private static final long serialVersionUID = 1L;

  // ---------------------------------------------------------------------------------------------------
  // CONSTANTES
  // ---------------------------------------------------------------------------------------------------

  public static final String TITULO = "Informe Final";

  public static final int TAMANIO_CELDAS = 35;

  // ---------------------------------------------------------------------------------------------------
  // ATRIBUTOS
  // ---------------------------------------------------------------------------------------------------

  private JLabel lbFondo;
  private JButton btnVolver;

  private JTable tablaInforme;
  private JScrollPane scrollBarInforme;

  private Informe informe;

  // ---------------------------------------------------------------------------------------------------
  // RELACIONES
  // ---------------------------------------------------------------------------------------------------

  //private VentanaFIFO ventanaFifo;

  // ---------------------------------------------------------------------------------------------------
  // CONSTRUCTOR
  // ---------------------------------------------------------------------------------------------------

  public VentanaInforme(VentanaFIFO pVentanaF) {
    this.configurarVentanaFCFS();
    this.inicializarComponentes();
    this.agregarComponentes();
  }

  // --------------------------------------
  // METODOS
  // --------------------------------------

  private void configurarVentanaFCFS() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(700, 700);
    this.setLocationRelativeTo(null);

    this.setVisible(true);
    this.setResizable(false);
    this.setTitle(TITULO);

    this.setIconImage(new ImageIcon("./source/icono.png").getImage());

  }

  private void inicializarComponentes() {
    //this.btnVolver = new JButton();
   // this.btnVolver.setIcon(new ImageIcon("./source/botonVolver.png"));

    this.lbFondo = new JLabel();
    this.lbFondo.setIcon(new ImageIcon("./source/fondoGeneral.png"));

  }

  private void agregarComponentes() {
    this.setLayout(null);

    //this.add(this.btnVolver);
    //this.btnVolver.setBounds(20, 20, 100, 30);

    this.add(this.lbFondo);
    this.lbFondo.setBounds(0, 0, 700, 700);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
  }

  
}

