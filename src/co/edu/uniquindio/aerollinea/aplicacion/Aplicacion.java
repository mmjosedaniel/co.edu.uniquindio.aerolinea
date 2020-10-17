package co.edu.uniquindio.aerollinea.aplicacion;

import java.awt.EventQueue;

import co.edu.uniquindio.aerollinea.views.PasajeroView;

public class Aplicacion {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasajeroView window = new PasajeroView();
					window.getFrmRegistroDelPasajero().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
