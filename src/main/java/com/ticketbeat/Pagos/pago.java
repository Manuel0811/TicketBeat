package com.ticketbeat.Pagos;

import com.ticketbeat.Usuarios.Usuario;
import com.ticketbeat.Boletos.Reserva;

public class Pago {

    private boolean estado;
    private Usuario user;

    public boolean realizarPago(Reserva reserva) {
        if (reserva != null) {
            estado = true;
            System.out.println("Pago realizado exitosamente.");
            return true;
        }
        return false;
    }
}
