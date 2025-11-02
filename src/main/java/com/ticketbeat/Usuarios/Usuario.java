package com.ticketbeat.Usuarios;

public abstract class Usuario {

    protected int idUsuario;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String cedula;
    protected String telefono;
    protected String contrasena;

    public Usuario(String apellido, String cedula, String contrasena, String email, int idUsuario, String nombre, String telefono) {
        this.apellido = apellido;
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.email = email;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
