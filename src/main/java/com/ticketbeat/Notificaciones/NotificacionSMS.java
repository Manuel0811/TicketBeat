package com.ticketbeat.Notificaciones;

import com.ticketbeat.Usuarios.Usuario;

public class NotificacionSMS implements INotificacion {

    @Override
    public void enviarNotificacion(Usuario user, String asunto, String mensaje) {
        System.out.println("Enviando SMS a " + user.getTelefono() + " | Mensaje: " + mensaje);
    }
}
