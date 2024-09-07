package com.notificaciones;

public class CreadorSMS extends CreadorNotificacion{
	public Notificacion factoryMethod() {
        return new SMSNotificacion();
    }

}
