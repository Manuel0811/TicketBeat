package com.ticketbeat.Boletos;
import com.ticketbeat.Evento.Evento;
import java.util.*;

public class BoletoGeneral extends Boleto {
    private int asiento;
    public BoletoGeneral(String artista, Evento evento, Date fecha, EstadoBoleto estado, int precio, int asiento) {
        super(artista, evento, fecha, estado, precio);
        this.asiento = asiento;
    }
    public int getAsiento() {
        return asiento;
    }
    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
}
