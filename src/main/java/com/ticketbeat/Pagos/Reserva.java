package com.ticketbeat.Pagos;

import com.ticketbeat.Boletos.*;
import com.ticketbeat.Usuarios.Usuario;
import com.ticketbeat.Evento.Evento;

public class Reserva {
    private int timeReserva = 200;
    private Evento evento;
    private Boleto boleto;
    private Usuario user;
    private Pago pago;
    private int tiempo;

    public void tiempoRestante() {
        System.out.println("Tiempo restante: " + timeReserva + " segundos.");
    }
}

