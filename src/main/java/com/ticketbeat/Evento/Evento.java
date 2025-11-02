package com.ticketbeat.Evento;
import com.ticketbeat.Boletos.Boleto;
import java.util.*;
import com.ticketbeat.Boletos.EstadoBoleto;

public class Evento {
    public static ArrayList<Evento> eventos = new ArrayList<>();
    private String artista;
    private ArrayList<String> lugar;
    private String tipoMusica;
    private ArrayList<Date> fechas;
    private ArrayList<Boleto> boletos;
    private String politicaDevolucion;
    private String politicaCambio;
    private ArrayList<String> restricciones;

    public Evento(String artista, ArrayList<String> lugar, String tipoMusica, ArrayList<Date> fechas,
                  ArrayList<Boleto> boletos, String politicaDevolucion, String politicaCambio,
                  ArrayList<String> restricciones) {
        this.artista = artista;
        this.lugar = lugar;
        this.tipoMusica = tipoMusica;
        this.fechas = fechas;
        this.boletos = boletos;
        this.politicaDevolucion = politicaDevolucion;
        this.politicaCambio = politicaCambio;
        this.restricciones = restricciones;
    }
    public String getArtista() {
        return artista;
    }   
    public ArrayList<String> getLugar() {
        return lugar;
    }
    public String getTipoMusica() {
        return tipoMusica;
    }
    public ArrayList<Date> getFechas() {
        return fechas;
    }
    public ArrayList<Boleto> getBoletos() {
        return boletos;
    }
    public String getPoliticaDevolucion() {
        return politicaDevolucion;
    }
    public String getPoliticaCambio() {
        return politicaCambio;
    }
    public ArrayList<String> getRestricciones() {
        return restricciones;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setLugar(ArrayList<String> lugar) {
        this.lugar = lugar;
    }
    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }
    public void setFechas(ArrayList<Date> fechas) {
        this.fechas = fechas;
    }
    public void setBoletos(ArrayList<Boleto> boletos) {
        this.boletos = boletos;
    }
    public void setPoliticaDevolucion(String politicaDevolucion) {
        this.politicaDevolucion = politicaDevolucion;
    }
    public void setPoliticaCambio(String politicaCambio) {
        this.politicaCambio = politicaCambio;
    }
    public void setRestricciones(ArrayList<String> restricciones) {
        this.restricciones = restricciones;
    }

    public int cantidadBoletosDisponibles() {
        int contador = 0;
        for (Boleto boleto : boletos) {
            if (boleto.getEstado() == EstadoBoleto.DISPONIBLE) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarEventos() {
        for (Evento evento : eventos) {
            System.out.println("Artista: " + evento.getArtista());
            System.out.println("Tipo de Música: " + evento.getTipoMusica());
            System.out.println("Fechas: " + evento.getFechas());
            System.out.println("Cantidad de Boletos Disponibles: " + evento.cantidadBoletosDisponibles());
            System.out.println("-----");
        }
    }

    public static void agregarEvento(Evento evento) {
        eventos.add(evento);
    }
    
}
