package com.ticketbeat.Boletos;
import com.ticketbeat.Evento.Evento;
import java.util.*;

public class BoletoVIP extends Boleto {
    public BoletoVIP(String artista, Evento evento, Date fecha, EstadoBoleto estado, int precio) {
        super(artista, evento, fecha, estado, precio);
    }

    public void paseDirecto() {
        System.out.println("Acceso al pase directo VIP concedido.");
    }
}
