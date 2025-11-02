package com.ticketbeat.Notificaciones;

import com.ticketbeat.Usuarios.Usuario;

public class NotificacionEmail implements INotificacion {

    @Override
    public void enviarNotificacion(Usuario user, String asunto, String mensaje) {
        System.out.println("Enviando EMAIL a " + user.getEmail() + " | Asunto: " + asunto + " | Mensaje: " + mensaje);
    }
}
