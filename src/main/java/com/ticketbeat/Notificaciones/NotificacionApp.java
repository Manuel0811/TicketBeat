package com.ticketbeat.Notificaciones;

import com.ticketbeat.Usuarios.Usuario;

public class NotificacionApp implements INotificacion {

    @Override
    public void enviarNotificacion(Usuario user, String asunto, String mensaje) {
        System.out.println("Enviando APP a " + user.getNombre() + " | Mensaje: " + mensaje);
    }
}
