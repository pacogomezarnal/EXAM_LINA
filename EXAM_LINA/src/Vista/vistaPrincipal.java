package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class vistaPrincipal extends JFrame {

	private JPanel contentPane;
	private vistaUsuario vUsuario;
	private vistaEquipo vEquipo;
	private vistaComprobacion vComprobacion;

	/**
	 * Vista Principal
	 */
	public vistaPrincipal() {
		setTitle("The Laby");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		vUsuario=new vistaUsuario(this);
		contentPane.add(vUsuario,"vistaUsuario");
		vEquipo=new vistaEquipo();
		contentPane.add(vEquipo,"vistaEquipo");
		vComprobacion=new vistaComprobacion();
		contentPane.add(vComprobacion,"vistaComprobacion");
	}
	
	public void cambiarVistaEquipo(){
		CardLayout c=(CardLayout)contentPane.getLayout();
		c.show(contentPane, "vistaEquipo");
	}

}
