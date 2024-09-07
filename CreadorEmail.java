package com.notificaciones;

public class CreadorEmail extends CreadorNotificacion{
	public Notificacion factoryMethod() {
        return new EmailNotificaciones();
    }

}
