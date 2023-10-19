package com.magna.modelo;

public class Libro {
    
    private String id_libro;
    private String tit_libro;
    private String aut_libro;
    private String ano_public;
    private int can_stock;
    private String cod_categoria;

    public Libro(String id_libro, String tit_libro, String aut_libro, String ano_public, int can_stock, String cod_categoria) {
        this.id_libro = id_libro;
        this.tit_libro = tit_libro;
        this.aut_libro = aut_libro;
        this.ano_public = ano_public;
        this.can_stock = can_stock;
        this.cod_categoria = cod_categoria;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getTit_libro() {
        return tit_libro;
    }

    public void setTit_libro(String tit_libro) {
        this.tit_libro = tit_libro;
    }

    public String getAut_libro() {
        return aut_libro;
    }

    public void setAut_libro(String aut_libro) {
        this.aut_libro = aut_libro;
    }

    public String getAno_public() {
        return ano_public;
    }

    public void setAno_public(String ano_public) {
        this.ano_public = ano_public;
    }

    public int getCan_stock() {
        return can_stock;
    }

    public void setCan_stock(int can_stock) {
        this.can_stock = can_stock;
    }

    public String getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(String cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

}
