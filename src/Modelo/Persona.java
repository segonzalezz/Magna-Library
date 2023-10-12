package Modelo;

public class Persona {
    
    private String nom_persona;
    private int ed_persona;
    private String ced_persona;
    private String dir_persona;

    public Persona(String nom_persona, int ed_persona, String ced_persona, String dir_persona) {
        this.nom_persona = nom_persona;
        this.ed_persona = ed_persona;
        this.ced_persona = ced_persona;
        this.dir_persona = dir_persona;
    }

    public String getNom_persona() {
        return nom_persona;
    }

    public void setNom_persona(String nom_persona) {
        this.nom_persona = nom_persona;
    }

    public int getEd_persona() {
        return ed_persona;
    }

    public void setEd_persona(int ed_persona) {
        this.ed_persona = ed_persona;
    }

    public String getCed_persona() {
        return ced_persona;
    }

    public void setCed_persona(String ced_persona) {
        this.ced_persona = ced_persona;
    }

    public String getDir_persona() {
        return dir_persona;
    }

    public void setDir_persona(String dir_persona) {
        this.dir_persona = dir_persona;
    }

    

   
}
