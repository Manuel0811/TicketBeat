package com.ticketbeat.Usuarios;

import com.ticketbeat.Evento;
import com.ticketbeat.Pagos.Reserva;
import com.ticketbeat.Boletos.Boleto;

import java.util.List;

public class Comprador extends Usuario {

    protected List<Reserva> reservas;
    protected Evento eventoSeleccionado;

    public Comprador(Evento eventoSeleccionado, List<Reserva> reservas, String apellido, String cedula, String contrasena, String email, int idUsuario, String nombre, String telefono) {
        super(apellido, cedula, contrasena, email, idUsuario, nombre, telefono);
        this.eventoSeleccionado = eventoSeleccionado;
        this.reservas = reservas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Evento getEventoSeleccionado() {
        return eventoSeleccionado;
    }

    public void setEventoSeleccionado(Evento eventoSeleccionado) {
        this.eventoSeleccionado = eventoSeleccionado;
    }

    public List<Evento> buscarEvento(String criterio, List<Evento> todosEventos) {
        List<Evento> encontrados = new ArrayList<>();
        for (Evento e : todosEventos) {
            if (e.getNombre().toLowerCase().contains(criterio.toLowerCase())
                    || e.getArtista().toLowerCase().contains(criterio.toLowerCase())
                    || e.getUbicacion().toLowerCase().contains(criterio.toLowerCase())) {
                encontrados.add(e);
            }
        }
        return encontrados;
    }

    public void seleccionarEvento(Evento e) {
        this.eventoSeleccionado = e;
    }

    public Reserva reservarBoletos(Evento e, String tipo, int cant) {
        List<Boleto> boletos = e.obtenerBoletosDisponibles(tipo, cant);
        if (boletos.size() < cant) {
            System.out.println("No hay suficientes boletos para reservar.");
            return null;
        }

        Reserva nueva = Reserva.crearReserva(this, boletos);
        reservas.add(nueva);
        System.out.println("Reserva creada con éxito.");
        return nueva;
    }

    public void realizarPago(Reserva r, Pago metodo) {
        if (r == null) {
            System.out.println("Reserva inválida.");
            return;
        }
        r.confirmarPago(metodo);
    }

    public void cancelarReserva(Reserva r) {
        if (r == null) {
            System.out.println("Reserva inválida.");
            return;
        }
        r.cancelarReserva();
    }

}
