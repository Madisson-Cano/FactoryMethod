package com.notificaciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreadorNotificacion creadorEmail = new CreadorEmail();
        creadorEmail.enviarNotificacion();
        
        CreadorNotificacion creadorSMS = new CreadorSMS();
        creadorSMS.enviarNotificacion();

	}

}
