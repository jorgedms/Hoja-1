/*
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos
 * Seccion 10
 * 
 * Christopher Aju 13171
 * Jorge Manrique 13600
 * Jonathan Aguirre 14349
 * 
 * Hoja de trabajo 1
 * 
 * 
 * */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;

public class Interface {

	private JFrame frmRadio;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		final InterfazRadio radio2 = new InterfazRadio();
		final NumberFormat formato = new DecimalFormat("####.##");
		frmRadio = new JFrame();
		frmRadio.setTitle("Radio");
		frmRadio.setBounds(100, 100, 367, 242);
		frmRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadio.getContentPane().setLayout(null);
		
		/**
		 * Labels
		 */
		//label de nivel de volumen
		final JLabel lbVolumen = new JLabel("0");
		lbVolumen.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbVolumen.setBounds(80, 177, 46, 14);
		frmRadio.getContentPane().add(lbVolumen);
		
		//label de estacion
		JLabel lblEstacin = new JLabel("Estaci\u00F3n:");
		lblEstacin.setBounds(140, 15, 60, 15);
		frmRadio.getContentPane().add(lblEstacin);
		
		//label de estacion seleccionada
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(140, 34, 100, 20);
		frmRadio.getContentPane().add(textField);
		textField.setColumns(10);
		
		//etiqueta de volumen
		JLabel lblVolumen = new JLabel("Volumen:"); 
		lblVolumen.setBounds(20, 177, 70, 14);
		frmRadio.getContentPane().add(lblVolumen);
		
		/**
		 * Checkbox de guardado
		 */
		final JCheckBox chckbxGuardarEstacin = new JCheckBox("Guardar estaci\u00F3n");
		chckbxGuardarEstacin.setBounds(6, 55, 170, 23);
		frmRadio.getContentPane().add(chckbxGuardarEstacin);
		/**
		 * BOTONES DE GUARDADO
		 */
		final JButton E1 = new JButton("No. 1");
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 0);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(0)));					
				}
			}
		});
		E1.setEnabled(false);
		E1.setBounds(10, 75, 70, 23);
		frmRadio.getContentPane().add(E1);
		
		final JButton E2 = new JButton("No.2");
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 1);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(1)));					
				}
			}
		});
		E2.setEnabled(false);
		E2.setBounds(84, 75, 70, 23);
		frmRadio.getContentPane().add(E2);
		
		final JButton E3 = new JButton("No.3");
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 2);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(2)));					
				}
			}
		});
		E3.setEnabled(false);
		E3.setBounds(158, 75, 70, 23);
		frmRadio.getContentPane().add(E3);
		
		final JButton E4 = new JButton("No.4");
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 3);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(3)));					
				}
			}
		});
		E4.setEnabled(false);
		E4.setBounds(232, 75, 70, 23);
		frmRadio.getContentPane().add(E4);
		
		final JButton E5 = new JButton("No.5");
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 4);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(4)));					
				}
			}
		});
		E5.setEnabled(false);
		E5.setBounds(10, 109, 70, 23);
		frmRadio.getContentPane().add(E5);
		
		final JButton E6 = new JButton("No.6");
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 5);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(5)));					
				}
			}
		});
		E6.setEnabled(false);
		E6.setBounds(84, 109, 70, 23);
		frmRadio.getContentPane().add(E6);
		
		final JButton E7 = new JButton("No.7");
		E7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 6);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(6)));					
				}
			}
		});
		E7.setEnabled(false);
		E7.setBounds(158, 109, 70, 23);
		frmRadio.getContentPane().add(E7);
		
		final JButton E8 = new JButton("No.8");
		E8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 7);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(7)));					
				}
			}
		});
		E8.setEnabled(false);
		E8.setBounds(232, 109, 70, 23);
		frmRadio.getContentPane().add(E8);
		
		final JButton E9 = new JButton("No.9");
		E9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 8);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(8)));					
				}
			}
		});
		E9.setEnabled(false);
		E9.setBounds(10, 143, 70, 23);
		frmRadio.getContentPane().add(E9);
		
		final JButton E10 = new JButton("No.10");
		E10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 9);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(9)));					
				}
			}
		});
		E10.setEnabled(false);
		E10.setBounds(84, 143, 70, 23);
		frmRadio.getContentPane().add(E10);
		
		final JButton E11 = new JButton("No.11");
		E11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 10);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(10)));					
				}
			}
		});
		E11.setEnabled(false);
		E11.setBounds(158, 143, 70, 23);
		frmRadio.getContentPane().add(E11);
		
		final JButton E12 = new JButton("No.12");
		E12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((chckbxGuardarEstacin.isSelected())==true){
					radio2.guardarEmisora(radio2.getEmisora(), 11);
				}
				if((chckbxGuardarEstacin.isSelected())==false){
					textField.setText(formato.format(radio2.cargarEmisora(11)));					
				}
			}
		});
		E12.setEnabled(false);
		E12.setBounds(232, 143, 70, 23);
		frmRadio.getContentPane().add(E12);
		
		/**
		 * Botones para cambiar estacion
		 * 
		 */
		//aumenta
		final JButton aumentar = new JButton("+");
		aumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio2.adelantarEmisora();
				textField.setText(formato.format(radio2.getEmisora()));
			}
		});
		aumentar.setEnabled(false);
		aumentar.setBounds(256, 11, 48, 23);
		frmRadio.getContentPane().add(aumentar);
		
		//disminuye
		final JButton disminuir = new JButton("-");
		disminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio2.atrasarEmisora();
				textField.setText(formato.format(radio2.getEmisora()));
			}
		});
		disminuir.setEnabled(false);
		disminuir.setBounds(256, 45, 48, 23);
		frmRadio.getContentPane().add(disminuir);
		
		/**
		 * Botones para subir y bajar volumen
		 */
		
		final JButton subirV = new JButton("+");
		subirV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio2.subirVolumen();
				lbVolumen.setText(String.valueOf(radio2.getVolumen()));
			}
		});
		subirV.setEnabled(false);
		subirV.setBounds(170, 174, 54, 20);
		frmRadio.getContentPane().add(subirV);
		
		final JButton bajarV = new JButton("-");
		bajarV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio2.bajarVolumen();
				lbVolumen.setText(String.valueOf(radio2.getVolumen()));
			}
		});
		bajarV.setEnabled(false);
		bajarV.setBounds(250, 174, 54, 20);
		frmRadio.getContentPane().add(bajarV);
		
		/**
		 * Boton para seleccionar el tipo de estacion [ver si se puede eliminar]
		 */
		final JButton seleccion = new JButton("AM");
		seleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio2.cambiarFrec();
				seleccion.setText(radio2.getFrec());
				textField.setText(formato.format(radio2.getEmisora()));
			}
		});
		seleccion.setEnabled(false);
		seleccion.setBounds(20, 34, 100, 20);
		frmRadio.getContentPane().add(seleccion);
		
		/**
		 * Boton de encendido y apagado
		 */
		final JButton boton1 = new JButton("On");
		boton1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
			String ap; 
			ap = boton1.getText();
			if (ap == "On"){
			boton1.setText("Off");
			disminuir.setEnabled(true); aumentar.setEnabled(true); seleccion.setEnabled(true);
			E1.setEnabled(true); E2.setEnabled(true); E3.setEnabled(true); E4.setEnabled(true);
			E5.setEnabled(true); E6.setEnabled(true); E7.setEnabled(true); E8.setEnabled(true);
			E9.setEnabled(true); E10.setEnabled(true); E11.setEnabled(true);E12.setEnabled(true);
			subirV.setEnabled(true); bajarV.setEnabled(true);
			}
			else{
				boton1.setText("On");
				disminuir.setEnabled(false); aumentar.setEnabled(false); seleccion.setEnabled(false);
				E1.setEnabled(false); E2.setEnabled(false); E3.setEnabled(false); E4.setEnabled(false);
				E5.setEnabled(false); E6.setEnabled(false); E7.setEnabled(false); E8.setEnabled(false);
				E9.setEnabled(false); E10.setEnabled(false); E11.setEnabled(false);E12.setEnabled(false);
				subirV.setEnabled(false); bajarV.setEnabled(false);
			}
			}
		});
		boton1.setBounds(20, 10, 100, 23);
		frmRadio.getContentPane().add(boton1);
	}
}
