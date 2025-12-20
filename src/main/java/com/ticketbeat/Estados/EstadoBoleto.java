package com.ticketbeat.Estados;

import com.ticketbeat.DecoratorBoleto.Boleto;

public interface EstadoBoleto {

    void reservar(Boleto boleto);
    void pagar(Boleto boleto);
    void cancelar(Boleto boleto);
    String getNombre();
}
