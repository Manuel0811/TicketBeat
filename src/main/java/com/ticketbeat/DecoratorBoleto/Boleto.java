package com.ticketbeat.Boletos;

import java.util.Date;

import com.ticketbeat.Estados.Disponible;
import com.ticketbeat.Estados.EstadoBoleto;
import com.ticketbeat.Evento.Evento;

public abstract class Boleto {

    protected String artista;
    protected Evento evento;
    protected Date fecha;
    protected EstadoBoleto estado;
    protected int precio;

    public Boleto(String artista, Evento evento, Date fecha, int precio) {
        this.artista = artista;
        this.evento = evento;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = new Disponible(); // estado inicial
    }

    // 👉 Delegación al estado
    public void reservar() {
        estado.reservar(this);
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void setEstado(EstadoBoleto estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado.getNombre();
    }
}
