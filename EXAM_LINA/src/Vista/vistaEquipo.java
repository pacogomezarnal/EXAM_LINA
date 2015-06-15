package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class vistaEquipo extends JPanel {
	private JTextField nombreField;
	private JTextField apellido1Field;
	private JTextField apellido2Field;
	private JTextField nacionalidadField;
	private JTextField idField;

	/**
	 * Create the panel.
	 */
	public vistaEquipo() {
		setLayout(null);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(176, 11, 63, 14);
		add(label);
		
		nombreField = new JTextField();
		nombreField.setEditable(false);
		nombreField.setColumns(10);
		nombreField.setBounds(176, 36, 110, 20);
		add(nombreField);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(176, 67, 63, 14);
		add(lblerApellido);
		
		apellido1Field = new JTextField();
		apellido1Field.setEditable(false);
		apellido1Field.setColumns(10);
		apellido1Field.setBounds(176, 92, 110, 20);
		add(apellido1Field);
		
		JLabel lblerApellido_1 = new JLabel("2o Apellido");
		lblerApellido_1.setBounds(176, 123, 63, 14);
		add(lblerApellido_1);
		
		apellido2Field = new JTextField();
		apellido2Field.setEditable(false);
		apellido2Field.setColumns(10);
		apellido2Field.setBounds(176, 148, 110, 20);
		add(apellido2Field);
		
		JLabel label_3 = new JLabel("Nacionalidad");
		label_3.setBounds(176, 179, 89, 14);
		add(label_3);
		
		nacionalidadField = new JTextField();
		nacionalidadField.setEditable(false);
		nacionalidadField.setColumns(10);
		nacionalidadField.setBounds(176, 204, 110, 20);
		add(nacionalidadField);
		
		idField = new JTextField();
		idField.setEditable(false);
		idField.setColumns(10);
		idField.setBounds(331, 36, 79, 20);
		add(idField);
		
		JLabel label_4 = new JLabel("Id");
		label_4.setBounds(333, 11, 63, 14);
		add(label_4);
		
		JButton button = new JButton("Siguiente >>");
		button.setBounds(290, 238, 120, 23);
		add(button);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 11, 63, 14);
		add(lblEquipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 126, 20);
		add(comboBox);
		
		JButton button_1 = new JButton("<< Anterior");
		button_1.setBounds(10, 238, 120, 23);
		add(button_1);

	}
}
