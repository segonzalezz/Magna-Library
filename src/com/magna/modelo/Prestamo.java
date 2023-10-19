package Modelo;

public class Prestamo {
    
    private String id_prestamo;
    private String dateS_prestamo;
    private String dateF_prestamo;
    private String cod_user;
    private String cod_libro;

    public Prestamo(String id_prestamo, String dateS_prestamo, String dateF_prestamo, String cod_user, String cod_libro) {
        this.id_prestamo = id_prestamo;
        this.dateS_prestamo = dateS_prestamo;
        this.dateF_prestamo = dateF_prestamo;
        this.cod_user = cod_user;
        this.cod_libro = cod_libro;
    }

    public String getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(String id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public String getDateS_prestamo() {
        return dateS_prestamo;
    }

    public void setDateS_prestamo(String dateS_prestamo) {
        this.dateS_prestamo = dateS_prestamo;
    }

    public String getDateF_prestamo() {
        return dateF_prestamo;
    }

    public void setDateF_prestamo(String dateF_prestamo) {
        this.dateF_prestamo = dateF_prestamo;
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
    
    
    
}
