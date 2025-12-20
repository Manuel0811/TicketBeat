package com.ticketbeat.Estados;

import com.ticketbeat.DecoratorBoleto.Boleto;

public class Reservado implements EstadoBoleto {

    @Override
    public void reservar(Boleto boleto) {
        System.out.println("El boleto ya está reservado");
    }

    @Override
    public void pagar(Boleto boleto) {
        boleto.setEstado(new Pagado());
        System.out.println("Pago realizado con éxito");
    }

    @Override
    public void cancelar(Boleto boleto) {
        boleto.setEstado(new Disponible());
        System.out.println("Reserva cancelada");
    }

    @Override
    public String getNombre() {
        return "Reservado";
    }
}
