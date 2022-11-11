package com.ueb.Disenio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ---------------------------------------------------------------------------------------------------
	// CONSTANTES
	// ---------------------------------------------------------------------------------------------------

	public static final String TITULO = "Algoritmos de planificacion de procesos";

	public static final String FIFO = "FIFO";
	public static final String ROUND_ROBIN = "Round Robin";
	public static final String SPN = "SPN";
	public static final String SRT = "SRT";

	// ---------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	// ---------------------------------------------------------------------------------------------------

	private JButton btnFifo;
	private JButton btnRoundRobin;
	private JButton btnSpn;
	private JButton btnSrt;

	private JLabel lbFondo;

	// ---------------------------------------------------------------------------------------------------
	// RELACIONES
	// ---------------------------------------------------------------------------------------------------

	private VentanaFIFO ventanaFifo;
	private VentanaRoundRobin ventanaRoundRobin;
	private VentanaSPN ventanaSpn;
	private VentanaSRT ventanaSrt;

	// ---------------------------------------------------------------------------------------------------
	// CONSTRUCTOR
	// ---------------------------------------------------------------------------------------------------

	public VentanaPrincipal() {
		this.configurarVentanaPrincipal();
		this.inicializarComponentes();
		this.configurarComponentes();
		this.agregarComponentes();

	}

	// ---------------------------------------------------------------------------------------------------
	// METODOS
	// ---------------------------------------------------------------------------------------------------

	private void configurarVentanaPrincipal() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);

		this.setVisible(true);
		this.setResizable(false);
		this.setTitle(TITULO);

		this.setIconImage(new ImageIcon("./source/icono.png").getImage());

	}

	private void inicializarComponentes() {
		this.btnFifo = new JButton();
		this.btnFifo.setIcon(new ImageIcon("./source/botonFifo.png"));

		this.btnRoundRobin = new JButton();
		this.btnRoundRobin.setIcon(new ImageIcon("./source/botonRoundRobin.png"));

		this.btnSpn = new JButton();
		this.btnSpn.setIcon(new ImageIcon("./source/botonSpn.png"));

		this.btnSrt = new JButton();
		this.btnSrt.setIcon(new ImageIcon("./source/botonSrt.png"));

		this.ventanaFifo = new VentanaFIFO(this);
		this.ventanaRoundRobin = new VentanaRoundRobin(this);
		this.ventanaSpn = new VentanaSPN(this);
		this.ventanaSrt = new VentanaSRT(this);

		this.lbFondo = new JLabel();
		this.lbFondo.setIcon(new ImageIcon("./source/fondoPrincipal.png"));
	}

	private void configurarComponentes() {
		this.btnFifo.setActionCommand(FIFO);
		this.btnRoundRobin.setActionCommand(ROUND_ROBIN);
		this.btnSpn.setActionCommand(SPN);
		this.btnSrt.setActionCommand(SRT);

		this.btnFifo.addActionListener(this);
		this.btnRoundRobin.addActionListener(this);
		this.btnSpn.addActionListener(this);
		this.btnSrt.addActionListener(this);

		this.mostrarVentanaPrincipal();
	}

	private void agregarComponentes() {
		this.setLayout(null);

		this.add(this.btnFifo);
		this.btnFifo.setBounds(140, 140, 150, 150);

		this.add(this.btnRoundRobin);
		this.btnRoundRobin.setBounds(400, 140, 150, 150);

		this.add(this.btnSpn);
		this.btnSpn.setBounds(140, 360, 150, 150);

		this.add(this.btnSrt);
		this.btnSrt.setBounds(400, 360, 150, 150);

		this.add(this.lbFondo);
		this.lbFondo.setBounds(0, 0, 700, 700);
	}

	private void mostrarFcfs() {
		this.setVisible(false);
		this.ventanaFifo = new VentanaFIFO(this);
		this.ventanaFifo.setVisible(true);
	}

	private void mostrarRoundRobin() {
		this.setVisible(false);
		this.ventanaRoundRobin = new VentanaRoundRobin(this);
		this.ventanaRoundRobin.setVisible(true);
	}

	private void mostrarSjf() {
		this.setVisible(false);
		this.ventanaSpn = new VentanaSPN(this);
		this.ventanaSpn.setVisible(true);
	}

	private void mostrarSrtf() {
		this.setVisible(false);
		this.ventanaSrt = new VentanaSRT(this);
		this.ventanaSrt.setVisible(true);
	}

	private void mostrarVentanaPrincipal() {
		this.setVisible(true);

		this.ventanaFifo.setVisible(false);
		this.ventanaRoundRobin.setVisible(false);
		this.ventanaSpn.setVisible(false);
		this.ventanaSrt.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals(VentanaPrincipal.FIFO)) {
			this.mostrarFcfs();
		} else if (comando.equals(VentanaPrincipal.ROUND_ROBIN)) {
			this.mostrarRoundRobin();
		} else if (comando.equals(VentanaPrincipal.SPN)) {
			this.mostrarSjf();
		} else if (comando.equals(VentanaPrincipal.SRT)) {
			this.mostrarSrtf();
		} else {
			this.mostrarVentanaPrincipal();
		}
	}

}
