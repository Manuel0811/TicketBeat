package com.ticketbeat.Estados;

import com.ticketbeat.DecoratorBoleto.Boleto;

public class Disponible implements EstadoBoleto {

    @Override
    public void reservar(Boleto boleto) {
        boleto.setEstado(new Reservado());
        System.out.println("Boleto reservado correctamente");
    }

    @Override
    public void pagar(Boleto boleto) {
        System.out.println("Debe reservar el boleto antes de pagarlo");
    }

    @Override
    public void cancelar(Boleto boleto) {
        System.out.println("El boleto ya está disponible");
    }

    @Override
    public String getNombre() {
        return "Disponible";
    }
}
