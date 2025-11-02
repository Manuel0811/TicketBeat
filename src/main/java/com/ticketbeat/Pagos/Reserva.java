package Pagos;

import Boletos.Boleto;
import Boletos.Evento;
import Usuarios.Usuario;

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

