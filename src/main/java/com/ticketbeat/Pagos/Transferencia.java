package com.ticketbeat.Pagos;

public class Transferencia extends Pago {
    private String bancoOrigen;
    private String bancoDestino;
    private String numeroCuentaOrigen;
    private String numeroCuentaDestino;

    public Transferencia(String bancoOrigen, String bancoDestino, String numeroCuentaOrigen, String numeroCuentaDestino) {
        this.bancoOrigen = bancoOrigen;
        this.bancoDestino = bancoDestino;
        this.numeroCuentaOrigen = numeroCuentaOrigen;
        this.numeroCuentaDestino = numeroCuentaDestino;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public void setBancoOrigen(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }

    public String getNumeroCuentaOrigen() {
        return numeroCuentaOrigen;
    }

    public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
    }

    public String getNumeroCuentaDestino() {
        return numeroCuentaDestino;
    }

    public void setNumeroCuentaDestino(String numeroCuentaDestino) {
        this.numeroCuentaDestino = numeroCuentaDestino;
    }
    
}
