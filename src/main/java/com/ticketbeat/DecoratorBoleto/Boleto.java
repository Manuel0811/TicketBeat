package com.ticketbeat.Boletos;
import com.ticketbeat.Evento.Evento;
import java.util.*;


public abstract class Boleto {
    protected String artista;
    protected Evento evento;
    protected Date fecha;
    protected EstadoBoleto estado;
    protected int precio;

    public Boleto(String artista, Evento evento, Date fecha, EstadoBoleto estado, int precio) {
        this.artista = artista;
        this.evento = evento;
        this.fecha = fecha;
        this.estado = estado;
        this.precio = precio;
    }
    public String getArtista() {
        return artista;
    }
    public Evento getEvento() {
        return evento;
    }
    public Date getFecha() {
        return fecha;
    }
    public EstadoBoleto getEstado() {
        return estado;
    }
    public int getPrecio() {
        return precio;
    }
    public void setEstado(EstadoBoleto estado) {
        this.estado = estado;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    } 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    
}
