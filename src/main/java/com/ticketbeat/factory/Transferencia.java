package com.ticketbeat.factory;

public class Transferencia implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago por transferencia bancaria: $" + monto);
    }
}

