package com.ticketbeat.factory;

public class PagoTarjeta implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con tarjeta: $" + monto);
    }
}
