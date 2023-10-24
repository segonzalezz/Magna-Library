package com.magna.modelo;

public class Devolucion {
    private String cod_prestamo;
    private String dateF_devolucion;
    private String des_devolucion;

    public Devolucion(String cod_prestamo, String dateF_devolucion, String des_devolucion) {
        this.cod_prestamo = cod_prestamo;
        this.dateF_devolucion = dateF_devolucion;
        this.des_devolucion = des_devolucion;
    }

    public String getCod_prestamo() {
        return cod_prestamo;
    }

    public void setCod_prestamo(String cod_prestamo) {
        this.cod_prestamo = cod_prestamo;
    }

    public String getDateF_devolucion() {
        return dateF_devolucion;
    }

    public void setDateF_devolucion(String dateF_devolucion) {
        this.dateF_devolucion = dateF_devolucion;
    }

    public String getDes_devolucion() {
        return des_devolucion;
    }

    public void setDes_devolucion(String des_devolucion) {
        this.des_devolucion = des_devolucion;
    }
}
