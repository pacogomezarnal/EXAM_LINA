package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class vistaComprobacion extends JPanel {
	private JTextField idField;
	private JTextField textField;
	private JTextField mensajeField;

	/**
	 * Create the panel.
	 */
	public vistaComprobacion() {
		setLayout(null);
		
		JButton button = new JButton("<< Anterior");
		button.setBounds(10, 246, 120, 23);
		add(button);
		
		JButton button_1 = new JButton("Siguiente >>");
		button_1.setBounds(290, 246, 120, 23);
		add(button_1);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 38, 46, 14);
		add(lblId);
		
		idField = new JTextField();
		idField.setBounds(10, 67, 86, 20);
		add(idField);
		idField.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(138, 38, 127, 14);
		add(lblerApellido);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 67, 272, 20);
		add(textField);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(10, 112, 400, 23);
		add(btnComprobar);
		
		mensajeField = new JTextField();
		mensajeField.setEditable(false);
		mensajeField.setColumns(10);
		mensajeField.setBounds(10, 162, 400, 20);
		add(mensajeField);

	}

}
