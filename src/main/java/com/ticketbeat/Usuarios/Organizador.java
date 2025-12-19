package com.ticketbeat.Usuarios;

import com.ticketbeat.Evento.Evento;
import com.ticketbeat.Pagos.Reserva;

import java.util.List;
import java.sql.Date;

public class Organizador extends Usuario {

    protected List<String> politicas;

    public Organizador(List<String> politicas, String apellido, String cedula, String contrasena, String email, int idUsuario, String nombre, String telefono) {
        super(apellido, cedula, contrasena, email, idUsuario, nombre, telefono);
        this.politicas = politicas;
    }

    public List<String> definirPoliticas(String nuevaPolitica) {
        politicas.add(nuevaPolitica);
        System.out.println("Las políticas del evento definidas por el organizador " + this.getNombre()
                + " son: ");
        return this.politicas;
    }

    public void modificarEvento(Evento e) {
        if (!validarEvento(e)) {
            return;
        }

        mostrarMensajeModificacion(e);

        modificarNombre(e);
        modificarUbicacion(e);
        modificarFecha(e);
    }

    // --- Métodos privados: SRP ---
    private boolean validarEvento(Evento e) {
        if (e == null) {
            System.out.println("Evento inválido.");
            return false;
        }
        return true;
    }

    private void mostrarMensajeModificacion(Evento e) {
        System.out.println("Modificando evento: " + e.getNombre());
    }

    private void modificarNombre(Evento e) {
        e.setNombre("Nuevo nombre");
    }

    private void modificarUbicacion(Evento e) {
        e.setUbicacion("Nueva ubicación");
    }

    private void modificarFecha(Evento e, Date nuevaFecha) {
        e.setFecha(nuevaFecha);
    }

    public void reembolsarCompra(Reserva r) {
        if (r == null) {
            System.out.println("Reserva inválida.");
            return;
        }

        if (!r.isPagada()) {
            System.out.println("La reserva #" + r.getIdReserva() + " no fue pagada. No hay reembolso.");
            return;
        }

        System.out.println("Reembolso procesado para la reserva #" + r.getIdReserva());
    }
}
