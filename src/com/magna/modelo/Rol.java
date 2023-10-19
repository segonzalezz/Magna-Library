package com.magna.modelo;

public class Rol{
    
    private String id_rol;
    private String nom_rol;

    public Rol(String id_rol, String nom_rol) {
        this.id_rol = id_rol;
        this.nom_rol = nom_rol;
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    public String getNom_rol() {
        return nom_rol;
    }

    public void setNom_rol(String nom_rol) {
        this.nom_rol = nom_rol;
    }
    
}
