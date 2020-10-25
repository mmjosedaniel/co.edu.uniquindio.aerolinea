package co.edu.uniquindio.aerollinea.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import co.edu.uniquindio.aerollinea.controllers.PasajeroController;
import co.edu.uniquindio.aerollinea.model.Aerolinea;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PasajeroView {

    private JFrame frmRegistroDelPasajero;
	private JTextField textFieldNombre;
	private JTextField textField_apellido;
	private JTextField textField_cedula;
	private JTextField textField_ciudad;
	private JTextField textField_telefono;
	private JTextField textField_fechaNacimiento;
	JLabel lblNewLabel_Mensaje;
	 PasajeroController pasajeroController=new PasajeroController();
	String nombre, apellido, cedula, ciudad, fechaNacimiento, telefono;
	Aerolinea aerolinea;
	private JTextField textFieldMensaje;
	
	
	

	/**
	 * Create the application.
	 */
	public PasajeroView() {
		initialize();
		aerolinea=pasajeroController.getAerolinea();
		
	}
	public boolean verificarCamposVacios() {
		if(textFieldNombre.getText().equalsIgnoreCase("")|| textField_apellido.getText().equalsIgnoreCase("")
				|| textField_cedula.getText().equalsIgnoreCase("")||textField_ciudad.getText().equalsIgnoreCase("")
				|| textField_telefono.getText().equalsIgnoreCase("")
				||textField_fechaNacimiento.getText().equalsIgnoreCase("")) {
			return false;
		}
		else
			return true;
	}
	
	

	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmRegistroDelPasajero(new JFrame());
		getFrmRegistroDelPasajero().setTitle("Registro del pasajero");
		getFrmRegistroDelPasajero().setBounds(100, 100, 529, 416);
		getFrmRegistroDelPasajero().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmRegistroDelPasajero().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese los datos");
		lblNewLabel.setBounds(163, 11, 103, 25);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 66, 110, 14);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel_1);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(130, 63, 110, 20);
		getFrmRegistroDelPasajero().getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setBounds(10, 116, 46, 14);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel_2);
		
		textField_apellido = new JTextField();
		textField_apellido.setText("");
		textField_apellido.setBounds(130, 113, 110, 20);
		getFrmRegistroDelPasajero().getContentPane().add(textField_apellido);
		textField_apellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cedula:");
		lblNewLabel_3.setBounds(10, 170, 46, 14);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel_3);
		
		textField_cedula = new JTextField();
		textField_cedula.setBounds(130, 167, 110, 20);
		getFrmRegistroDelPasajero().getContentPane().add(textField_cedula);
		textField_cedula.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ciudad:");
		lblNewLabel_4.setBounds(10, 222, 46, 14);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel_4);
		
		textField_ciudad = new JTextField();
		textField_ciudad.setBounds(130, 219, 110, 20);
		getFrmRegistroDelPasajero().getContentPane().add(textField_ciudad);
		textField_ciudad.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono:");
		lblNewLabel_5.setBounds(10, 275, 46, 14);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel_5);
		
		textField_telefono = new JTextField();
		textField_telefono.setBounds(130, 272, 110, 20);
		getFrmRegistroDelPasajero().getContentPane().add(textField_telefono);
		textField_telefono.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_6.setBounds(10, 330, 110, 14);
		getFrmRegistroDelPasajero().getContentPane().add(lblNewLabel_6);
		
		textField_fechaNacimiento = new JTextField();
		textField_fechaNacimiento.setBounds(130, 327, 110, 20);
		getFrmRegistroDelPasajero().getContentPane().add(textField_fechaNacimiento);
		textField_fechaNacimiento.setColumns(10);
		textFieldMensaje = new JTextField();
		textFieldMensaje.setEditable(false);
		textFieldMensaje.setBounds(329, 219, 160, 70);
		frmRegistroDelPasajero.getContentPane().add(textFieldMensaje);
		textFieldMensaje.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				nombre=textFieldNombre.getText();
				apellido=textField_apellido.getText();
				cedula=textField_cedula.getText();
				ciudad=textField_ciudad.getText();
				telefono=textField_telefono.getText();
				fechaNacimiento=textField_fechaNacimiento.getText();
				if(verificarCamposVacios()) {
				
				textFieldMensaje.setText(pasajeroController.crearPasajero(nombre,
						apellido, cedula, ciudad, telefono, fechaNacimiento));
				
		        }
				else {
					textFieldMensaje.setText("Llene todos los campos de texto");
				}
				}
		});
		btnNewButton.setBounds(329, 166, 160, 23);
		frmRegistroDelPasajero.getContentPane().add(btnNewButton);
		
		
		
		}
		

		public JFrame getFrmRegistroDelPasajero() {
			return frmRegistroDelPasajero;
		}

		public void setFrmRegistroDelPasajero(JFrame frmRegistroDelPasajero) {
			this.frmRegistroDelPasajero = frmRegistroDelPasajero;
		}
	}

