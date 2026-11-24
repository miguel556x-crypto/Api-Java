package com.example.Medicamentos;

import java.util.List;

public class Medicamento {
    private String nombre;
    private List<String> nombresComerciales;
    private List<String> viasAdministracion;
    private List<String> dosis;
    private List<String> indicaciones;
    private List<String> contraindicaciones;
    private List<String> efectosAdversos;
    private List<String> cuidadosEnfermeria;

    public Medicamento() {
    }

    public Medicamento(String nombre, List<String> nombresComerciales, List<String> viasAdministracion,
                       List<String> dosis, List<String> indicaciones, List<String> contraindicaciones,
                       List<String> efectosAdversos, List<String> cuidadosEnfermeria) {
        this.nombre = nombre;
        this.nombresComerciales = nombresComerciales;
        this.viasAdministracion = viasAdministracion;
        this.dosis = dosis;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
        this.efectosAdversos = efectosAdversos;
        this.cuidadosEnfermeria = cuidadosEnfermeria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getNombresComerciales() {
        return nombresComerciales;
    }

    public void setNombresComerciales(List<String> nombresComerciales) {
        this.nombresComerciales = nombresComerciales;
    }

    public List<String> getViasAdministracion() {
        return viasAdministracion;
    }

    public void setViasAdministracion(List<String> viasAdministracion) {
        this.viasAdministracion = viasAdministracion;
    }

    public List<String> getDosis() {
        return dosis;
    }

    public void setDosis(List<String> dosis) {
        this.dosis = dosis;
    }

    public List<String> getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(List<String> indicaciones) {
        this.indicaciones = indicaciones;
    }

    public List<String> getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(List<String> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public List<String> getEfectosAdversos() {
        return efectosAdversos;
    }

    public void setEfectosAdversos(List<String> efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

    public List<String> getCuidadosEnfermeria() {
        return cuidadosEnfermeria;
    }

    public void setCuidadosEnfermeria(List<String> cuidadosEnfermeria) {
        this.cuidadosEnfermeria = cuidadosEnfermeria;
    }
}