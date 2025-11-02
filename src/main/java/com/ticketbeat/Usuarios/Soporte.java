package com.ticketbeat.Usuarios;

public class Soporte extends Usuario {

    public Soporte(String email, int idUsuario, String nombre, String telefono) {
        super(email, idUsuario, nombre, telefono);
    }

    public void resolverProblema(String descripcion) {
        if (descripcion == null || descripcion.isEmpty()) {
            System.out.println("Descripción del problema inválida.");
            return;
        }

        System.out.println("Soporte ha resuelto el problema: " + descripcion);
    }

    public void escalarProblema(Organizador organizador) {
        if (organizador == null) {
            System.out.println("No se puede escalar a un organizador inválido.");
            return;
        }

        System.out.println("Problema escalado al organizador: " + organizador.getNombre());
    }
}
