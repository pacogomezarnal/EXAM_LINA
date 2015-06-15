package app;

import Modelo.ConexionDB;
import Vista.vistaPrincipal;

/*
 * Calse Principal lanzadera
 */
public class LabyApp {

	public static void main(String[] args) {
		//Conectamos a la base de datos
		ConexionDB cDB=ConexionDB.getInstance();
		cDB.connectDB();
		vistaPrincipal frame = new vistaPrincipal();
		frame.setVisible(true);
	}

}
