package com.ticketbeat.Estados;

import com.ticketbeat.DecoratorBoleto.Boleto;

public class Pagado implements EstadoBoleto {

    @Override
    public void reservar(Boleto boleto) {
        System.out.println("El boleto ya fue pagado");
    }

    @Override
    public void pagar(Boleto boleto) {
        System.out.println("El boleto ya está pagado");
    }

    @Override
    public void cancelar(Boleto boleto) {
        System.out.println("No se puede cancelar un boleto pagado");
    }

    @Override
    public String getNombre() {
        return "Pagado";
    }
}
