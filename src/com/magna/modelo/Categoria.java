package Modelo;

public class Categoria {

    private String id_categoria;
    private String nom_categoria;

    public Categoria(String id_categoria, String nom_categoria) {
        this.id_categoria = id_categoria;
        this.nom_categoria = nom_categoria;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNom_categoria() {
        return nom_categoria;
    }

    public void setNom_categoria(String nom_categoria) {
        this.nom_categoria = nom_categoria;
    }
    
}
