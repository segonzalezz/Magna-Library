package com.magna.modelo;

public class Historial {
    
    private String id;
    private String tipo_transaccion;
    private String cod_user;
    private String cod_libro;
    private String fech_prestamo;
    private String fech_devolucion;
    private String des_transaccion;

    //Aquí hago la instancia para el prestamo
    public Historial(String id, String tipo_transaccion, String cod_user, String cod_libro, String fech_prestamo, String des_transaccion) {
        this.id = id;
        this.tipo_transaccion = tipo_transaccion;
        this.cod_user = cod_user;
        this.cod_libro = cod_libro;
        this.fech_prestamo = fech_prestamo;
        this.des_transaccion = des_transaccion;
    }
    //Aquí hago la instancia para la devolucion
    public Historial(String id, String tipo_transaccion, String fech_devolucion, String des_transaccion){
        this.id = id;
        this.tipo_transaccion = tipo_transaccion;
        this.fech_devolucion = fech_devolucion;
        this.des_transaccion = des_transaccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public String getCod_user() {
        return cod_user;
    }

    public void setCod_user(String cod_user) {
        this.cod_user = cod_user;
    }

    public String getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(String cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getFech_prestamo() {
        return fech_prestamo;
    }

    public void setFech_prestamo(String fech_prestamo) {
        this.fech_prestamo = fech_prestamo;
    }

    public String getFech_devolucion() {
        return fech_devolucion;
    }

    public void setFech_devolucion(String fech_devolucion) {
        this.fech_devolucion = fech_devolucion;
    }
    
    public String getDes_transaccion() {
        return des_transaccion;
    }

    public void setDes_transaccion(String des_transaccion) {
        this.des_transaccion = des_transaccion;
    }


    
}
