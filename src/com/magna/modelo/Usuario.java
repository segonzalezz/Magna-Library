package com.magna.modelo;

public class Usuario extends Persona{
    
    private String user_u;
    private String pass_u;
    private String cod_rol;

    public Usuario(String nom_persona, int ed_persona, String ced_persona, String dir_persona, String user_u, String pass_u, String cod_rol) {
        super(nom_persona, ed_persona, ced_persona, dir_persona);
        this.user_u = user_u;
        this.pass_u = pass_u;
        this.cod_rol = cod_rol;
    }

    public String getUser_u() {
        return user_u;
    }

    public void setUser_u(String user_u) {
        this.user_u = user_u;
    }

    public String getPass_u() {
        return pass_u;
    }

    public void setPass_u(String pass_u) {
        this.pass_u = pass_u;
    }

    public String getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(String cod_rol) {
        this.cod_rol = cod_rol;
    }

}
