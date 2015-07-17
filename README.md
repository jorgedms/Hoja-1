# Hoja-1
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
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
		final Radio radio1 = new Radio();
		
		frmRadio = new JFrame();
		frmRadio.setTitle("Radio");
		frmRadio.setBounds(100, 100, 367, 242);
		frmRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadio.getContentPane().setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A.M", "F.M"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(10, 31, 70, 20);
		frmRadio.getContentPane().add(comboBox);
		
		final JButton E1 = new JButton("No. 1");
		E1.setEnabled(false);
		E1.setBounds(10, 75, 70, 23);
		frmRadio.getContentPane().add(E1);
		
		final JButton E2 = new JButton("No.2");
		E2.setEnabled(false);
		E2.setBounds(84, 75, 70, 23);
		frmRadio.getContentPane().add(E2);
		
		final JButton E3 = new JButton("No.3");
		E3.setEnabled(false);
		E3.setBounds(158, 75, 70, 23);
		frmRadio.getContentPane().add(E3);
		
		final JButton E4 = new JButton("No.4");
		E4.setEnabled(false);
		E4.setBounds(232, 75, 70, 23);
		frmRadio.getContentPane().add(E4);
		
		final JButton E5 = new JButton("No.5");
		E5.setEnabled(false);
		E5.setBounds(10, 109, 70, 23);
		frmRadio.getContentPane().add(E5);
		
		final JButton E6 = new JButton("No.6");
		E6.setEnabled(false);
		E6.setBounds(84, 109, 70, 23);
		frmRadio.getContentPane().add(E6);
		
		final JButton E7 = new JButton("No.7");
		E7.setEnabled(false);
		E7.setBounds(158, 109, 70, 23);
		frmRadio.getContentPane().add(E7);
		
		final JButton E8 = new JButton("No.8");
		E8.setEnabled(false);
		E8.setBounds(232, 109, 70, 23);
		frmRadio.getContentPane().add(E8);
		
		final JButton E9 = new JButton("No.9");
		E9.setEnabled(false);
		E9.setBounds(10, 143, 70, 23);
		frmRadio.getContentPane().add(E9);
		
		final JButton E10 = new JButton("No.10");
		E10.setEnabled(false);
		E10.setBounds(84, 143, 70, 23);
		frmRadio.getContentPane().add(E10);
		
		final JButton E11 = new JButton("No.11");
		E11.setEnabled(false);
		E11.setBounds(158, 143, 70, 23);
		frmRadio.getContentPane().add(E11);
		
		final JButton E12 = new JButton("No.12");
		E12.setEnabled(false);
		E12.setBounds(232, 143, 70, 23);
		frmRadio.getContentPane().add(E12);
		
		final JButton aumentar = new JButton("+");
		aumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "A.M"){ // aumenta la estacion si es A.M
					if (radio1.estaciona == radio1.maxam){
						radio1.estaciona = radio1.minam;
					}
					else{
					radio1.estaciona = radio1.estaciona + 10;
				    }
					textField.setText(Double.toString(radio1.estaciona)); 
				}
				else {
					if (radio1.estacionf >= radio1.maxfm){ // aumenta la estacion si es F.M
						radio1.estacionf = radio1.minfm;
					}
					else{					
					radio1.estacionf =radio1.estacionf + 0.2;
			}
					String s = String.format("%.1f", radio1.estacionf); // muestra la estación actual con un decimal 
					textField.setText(s);
			}
			}
		});
		aumentar.setEnabled(false);
		aumentar.setBounds(256, 11, 48, 23);
		frmRadio.getContentPane().add(aumentar);
		
		final JButton disminuir = new JButton("-");
		disminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "A.M"){ // aumenta la estacion si es A.M
					if (radio1.estaciona == radio1.minam){
						radio1.estaciona = radio1.maxam;
					}
					else{
					radio1.estaciona = radio1.estaciona - 10;
				    }
					textField.setText(Double.toString(radio1.estaciona)); 
				}
				else {
					if (radio1.estacionf <= radio1.minfm){ // aumenta la estacion si es F.M
						radio1.estacionf = radio1.maxfm;
					}
					else{					
					radio1.estacionf =radio1.estacionf - 0.2;
			}
					String s = String.format("%.1f", radio1.estacionf); // muestra la estación actual con un decimal 
					textField.setText(s);
			}
			}
		});
		disminuir.setEnabled(false);
		disminuir.setBounds(256, 45, 48, 23);
		frmRadio.getContentPane().add(disminuir);
		
		final JButton seleccion = new JButton("Selecci\u00F3n");
		seleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem() == "A.M"){
				textField.setText(Double.toString(radio1.estaciona));
				}
				else {
					textField.setText(Double.toString(radio1.estacionf));
				}
			}
		});
		seleccion.setEnabled(false);
		seleccion.setBounds(84, 31, 70, 20);
		frmRadio.getContentPane().add(seleccion);
		
		final JButton boton1 = new JButton("On");
		boton1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
			String ap; 
			ap = boton1.getText();
			if (ap == "On"){
			boton1.setText("Off");
			disminuir.setEnabled(true); aumentar.setEnabled(true); comboBox.setEnabled(true); seleccion.setEnabled(true);
			E1.setEnabled(true); E2.setEnabled(true); E3.setEnabled(true); E4.setEnabled(true);
			E5.setEnabled(true); E6.setEnabled(true); E7.setEnabled(true); E8.setEnabled(true);
			E9.setEnabled(true); E10.setEnabled(true); E11.setEnabled(true);E12.setEnabled(true);
			}
			else{
				boton1.setText("On");
				disminuir.setEnabled(false); aumentar.setEnabled(false); comboBox.setEnabled(false); seleccion.setEnabled(false);
				E1.setEnabled(false); E2.setEnabled(false); E3.setEnabled(false); E4.setEnabled(false);
				E5.setEnabled(false); E6.setEnabled(false); E7.setEnabled(false); E8.setEnabled(false);
				E9.setEnabled(false); E10.setEnabled(false); E11.setEnabled(false);E12.setEnabled(false);
			}
				radio1.estaciona = radio1.minam;
				radio1.estacionf = radio1.minfm;
			}
		});
		boton1.setBounds(84, 0, 89, 23);
		frmRadio.getContentPane().add(boton1);
		
		JLabel lblEstacin = new JLabel("Estaci\u00F3n:");
		lblEstacin.setBounds(182, 15, 46, 14);
		frmRadio.getContentPane().add(lblEstacin);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(160, 34, 86, 20);
		frmRadio.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxGuardarEstacin = new JCheckBox("Guardar estaci\u00F3n");
		chckbxGuardarEstacin.setBounds(6, 55, 119, 23);
		frmRadio.getContentPane().add(chckbxGuardarEstacin);
		
		JLabel lblVolumen = new JLabel("Volumen:");
		lblVolumen.setBounds(20, 177, 46, 14);
		frmRadio.getContentPane().add(lblVolumen);
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(84, 177, 46, 14);
		frmRadio.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(116, 174, 54, 20);
		frmRadio.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(192, 174, 54, 20);
		frmRadio.getContentPane().add(btnNewButton_1);
		
	}
}
