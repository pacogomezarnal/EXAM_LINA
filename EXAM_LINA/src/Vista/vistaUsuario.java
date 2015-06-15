package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import Modelo.Cadete;
import Modelo.ModeloCadete;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaUsuario extends JPanel {
	private JTextField nombreField;
	private JTextField apellidosField;
	private JTextField edadField;
	private JTextField nacionalidadField;
	private JTextField idField;
	
	private vistaPrincipal vPrincipal;

	/**
	 * Create the panel.
	 */
	public vistaUsuario(vistaPrincipal vPrincipal) {
		this.vPrincipal=vPrincipal;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(vistaUsuario.class.getResource("/img/user_150.jpg")));
		lblNewLabel.setBounds(10, 11, 137, 140);
		add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(157, 11, 63, 14);
		add(lblNombre);
		
		nombreField = new JTextField();
		nombreField.setEditable(false);
		nombreField.setBounds(157, 36, 110, 20);
		add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(157, 67, 63, 14);
		add(lblNewLabel_1);
		
		apellidosField = new JTextField();
		apellidosField.setEditable(false);
		apellidosField.setColumns(10);
		apellidosField.setBounds(157, 92, 110, 20);
		add(apellidosField);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(157, 123, 63, 14);
		add(lblEdad);
		
		edadField = new JTextField();
		edadField.setEditable(false);
		edadField.setColumns(10);
		edadField.setBounds(157, 148, 110, 20);
		add(edadField);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(157, 179, 89, 14);
		add(lblNacionalidad);
		
		nacionalidadField = new JTextField();
		nacionalidadField.setEditable(false);
		nacionalidadField.setColumns(10);
		nacionalidadField.setBounds(157, 204, 110, 20);
		add(nacionalidadField);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(314, 11, 63, 14);
		add(lblId);
		
		idField = new JTextField();
		idField.setEditable(false);
		idField.setColumns(10);
		idField.setBounds(312, 36, 79, 20);
		add(idField);
		
		JButton btnNewButton = new JButton("Siguiente >>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vPrincipal.cambiarVistaEquipo();
			}
		});
		btnNewButton.setBounds(271, 238, 120, 23);
		add(btnNewButton);
		
		//Rellenar Datos
		rellenarCadete();

	}
	
	private void rellenarCadete(){
		ModeloCadete mCadete=new ModeloCadete();
		Cadete c;
		
		c=mCadete.consultaCadete(7);
		
		//Poner datos en TextFields
		nombreField.setText(c.getNombre());
		apellidosField.setText(c.getApellidos());
		edadField.setText(String.valueOf(c.getEdad()));
	}
}
