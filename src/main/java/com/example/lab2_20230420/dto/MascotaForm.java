package com.example.lab2_20230420.dto;
import java.math.BigDecimal;

public class MascotaForm {
    private Integer id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String nombreDueno;
    private String telefono;
    private String estado;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombreDueno() {
        return nombreDueno;
    }
    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}