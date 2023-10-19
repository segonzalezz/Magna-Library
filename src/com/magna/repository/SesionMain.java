package com.magna.repository;

import com.magna.modelo.Usuario;

public class SesionMain {
    
    private static Usuario usuarioAutenticado;

    public static void setUsuarioAutenticado(Usuario usuario) {
        usuarioAutenticado = usuario;
    }

    public static Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

}
