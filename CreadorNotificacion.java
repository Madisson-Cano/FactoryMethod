package com.notificaciones;

public abstract class CreadorNotificacion {
	public abstract Notificacion factoryMethod();
	
	 public void enviarNotificacion() {
	        Notificacion notificacion = factoryMethod();
	        notificacion.enviar();
	    }

}
