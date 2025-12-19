package com.ticketbeat.factory;

public class PagoFactory {

    public static Pago crearPago(String tipo) {

        return switch (tipo.toLowerCase()) {
            case "transferencia" -> new Transferencia();
            case "movil" -> new PagoMovil();
            case "tarjeta" -> new PagoTarjeta();
            default -> throw new IllegalArgumentException("Método de pago no válido");
        };
    }
}

