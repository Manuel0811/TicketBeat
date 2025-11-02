package com.ticketbeat.Notificaciones;

import com.ticketbeat.Usuarios.Usuario;

public interface INotificacion {

    void enviarNotificacion(Usuario user, String asunto, String mensaje);
}
