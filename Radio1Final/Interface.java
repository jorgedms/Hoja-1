import java.awt.EventQueue;

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
		
		final JCheckBox check = new JCheckBox("Guardar estaci\u00F3n");
		check.setBounds(6, 55, 119, 23);
		frmRadio.getContentPane().add(check);
		
		final JButton E1 = new JButton("No. 1");
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
		if(comboBox.getSelectedItem() == "A.M"){ 		
			if (check.isSelected() == true ){
				radio1.guardarEmisora(radio1.emisoraa, 1);;
			}
			else if (check.isSelected() == false ){
				 radio1.cargarEmisora(1);
				textField.setText(Double.toString(radio1.emisoraa));
		}
		}	
		if(comboBox.getSelectedItem() == "F.M"){ 		
			if (check.isSelected() == true ){
				radio1.guardarEmisora(radio1.emisoraf, 1);
			}
			else if (check.isSelected() == false ){
				 radio1.cargarEmisora(1);
				 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
					textField.setText(pp);
			}
		}	
			}
		});
		E1.setEnabled(false);
		E1.setBounds(10, 75, 70, 23);
		frmRadio.getContentPane().add(E1);
		
		final JButton E2 = new JButton("No.2");
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 2);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(2);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 2);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(2);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}	
		});
		E2.setEnabled(false);
		E2.setBounds(84, 75, 70, 23);
		frmRadio.getContentPane().add(E2);
		
		final JButton E3 = new JButton("No.3");
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 3);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(3);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 1);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(3);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}
		});
		E3.setEnabled(false);
		E3.setBounds(158, 75, 70, 23);
		frmRadio.getContentPane().add(E3);
		
		final JButton E4 = new JButton("No.4");
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 4);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(4);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 4);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(4);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}	
		});
		E4.setEnabled(false);
		E4.setBounds(232, 75, 70, 23);
		frmRadio.getContentPane().add(E4);
		
		final JButton E5 = new JButton("No.5");
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 5);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(5);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 5);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(5);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}	
		});
		E5.setEnabled(false);
		E5.setBounds(10, 109, 70, 23);
		frmRadio.getContentPane().add(E5);
		
		final JButton E6 = new JButton("No.6");
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 6);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(6);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 6);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(6);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
			}
		});
		E6.setEnabled(false);
		E6.setBounds(84, 109, 70, 23);
		frmRadio.getContentPane().add(E6);
		
		final JButton E7 = new JButton("No.7");
		E7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 7);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(7);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 7);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(7);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}	
		});
		E7.setEnabled(false);
		E7.setBounds(158, 109, 70, 23);
		frmRadio.getContentPane().add(E7);
		
		final JButton E8 = new JButton("No.8");
		E8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 8);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(8);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 8);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(8);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}
		});
		E8.setEnabled(false);
		E8.setBounds(232, 109, 70, 23);
		frmRadio.getContentPane().add(E8);
		
		final JButton E9 = new JButton("No.9");
		E9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 9);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(9);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 9);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(9);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}
		});
		E9.setEnabled(false);
		E9.setBounds(10, 143, 70, 23);
		frmRadio.getContentPane().add(E9);
		
		final JButton E10 = new JButton("No.10");
		E10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 10);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(10);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 10);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(10);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}
		});
		E10.setEnabled(false);
		E10.setBounds(84, 143, 70, 23);
		frmRadio.getContentPane().add(E10);
		
		final JButton E11 = new JButton("No.11");
		E11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 11);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(11);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 11);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(11);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
					}
		});
		E11.setEnabled(false);
		E11.setBounds(158, 143, 70, 23);
		frmRadio.getContentPane().add(E11);
		
		final JButton E12 = new JButton("No.12");
		E12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s; 
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraa, 12);;
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(12);
						textField.setText(Double.toString(radio1.emisoraa));
					}
				}	
				if(comboBox.getSelectedItem() == "F.M"){ 		
					if (check.isSelected() == true ){
						radio1.guardarEmisora(radio1.emisoraf, 12);
					}
					else if (check.isSelected() == false ){
						 radio1.cargarEmisora(12);
						 //String l = Double.toString(radio1.emisoraf);
						 String pp = String.format("%.1f", radio1.emisoraf); // muestra la estación actual con un decimal 
							textField.setText(pp);
					}
				}	
			}
		});
		E12.setEnabled(false);
		E12.setBounds(232, 143, 70, 23);
		frmRadio.getContentPane().add(E12);
		
		final JButton aumentar = new JButton("+");
		aumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio1.frec = (String) comboBox.getSelectedItem();
				if(comboBox.getSelectedItem() == "A.M"){ // aumenta la estacion si es A.M
					radio1.adelantarEmisora();
					textField.setText(Double.toString(radio1.emisoraa));
				}
				else if(comboBox.getSelectedItem() == "F.M"){
					radio1.adelantarEmisora();				
					String s = String.format("%.1f", radio1.emisoraf);// muestra la estación actual con un decimal 
					textField.setText(s);
			}
			}
		});
		aumentar.setEnabled(false);
		aumentar.setBounds(256, 11, 48, 23);
		frmRadio.getContentPane().add(aumentar);
		
		final JButton disminuir = new JButton("-");
		disminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// aumenta la estacion si es A.M
				radio1.frec = (String) comboBox.getSelectedItem();
					if(comboBox.getSelectedItem() == "A.M"){
						radio1.atrasarEmisora();
						textField.setText(Double.toString(radio1.emisoraa));
					}
					else {
						radio1.atrasarEmisora();				
						String s = String.format("%.1f", radio1.emisoraf);// muestra la estación actual con un decimal 
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
				textField.setText(Double.toString(radio1.emisoraa));
				}
				else {
					textField.setText(Double.toString(radio1.emisoraf));
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
				radio1.encenderApagar();
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
		
		JLabel lblVolumen = new JLabel("Volumen:");
		lblVolumen.setBounds(20, 177, 46, 14);
		frmRadio.getContentPane().add(lblVolumen);
		
		final JLabel label = new JLabel("0");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(84, 177, 46, 14);
		frmRadio.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radio1.volumen < 10 ){
					radio1.subirVolumen();
				}
			   label.setText(Integer.toString(radio1.volumen));
			}
		});
		btnNewButton.setBounds(116, 174, 54, 20);
		frmRadio.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radio1.volumen > 0 ){
					radio1.bajarVolumen();
				}
			   label.setText(Integer.toString(radio1.volumen));
			}
		});
		btnNewButton_1.setBounds(192, 174, 54, 20);
		frmRadio.getContentPane().add(btnNewButton_1);
		
	}
}
