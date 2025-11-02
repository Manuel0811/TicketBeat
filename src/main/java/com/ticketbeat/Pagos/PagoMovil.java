package com.ticketbeat.Pagos;

public class PagoMovil extends Pago {
    private String numeroTelefono;

    public PagoMovil(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
