package com.ticketbeat.factory;

public class PagoMovil implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con Pago Móvil: $" + monto);
    }
}

