package reto5;

public class Clientes {
    
    private String clien_alias;
    private String clien_nom;
    private String clien_ape;
    private String clien_email;
    private String clien_cel;
    private int clien_contras;
    private String clien_fnac;

    public Clientes(String clien_alias, String clien_nom, String clien_ape, String clien_email, String clien_cel, int clien_contras, String clien_fnac) {
        this.clien_alias = clien_alias;
        this.clien_nom = clien_nom;
        this.clien_ape = clien_ape;
        this.clien_email = clien_email;
        this.clien_cel = clien_cel;
        this.clien_contras = clien_contras;
        this.clien_fnac = clien_fnac;
    }

    public Clientes(String clien_alias, String clien_cel) {
        this.clien_alias = clien_alias;
        this.clien_cel = clien_cel;
    }

    public Clientes(String clien_alias, String clien_nom, String clien_ape) {
        this.clien_alias = clien_alias;
        this.clien_nom = clien_nom;
        this.clien_ape = clien_ape;
    }
    

    public String getClien_alias() {
        return clien_alias;
    }

    public void setClien_alias(String clien_alias) {
        this.clien_alias = clien_alias;
    }

    public String getClien_nom() {
        return clien_nom;
    }

    public void setClien_nom(String clien_nom) {
        this.clien_nom = clien_nom;
    }

    public String getClien_ape() {
        return clien_ape;
    }

    public void setClien_ape(String clien_ape) {
        this.clien_ape = clien_ape;
    }

    public String getClien_email() {
        return clien_email;
    }

    public void setClien_email(String clien_email) {
        this.clien_email = clien_email;
    }

    public String getClien_cel() {
        return clien_cel;
    }

    public void setClien_cel(String clien_cel) {
        this.clien_cel = clien_cel;
    }

    public int getClien_contras() {
        return clien_contras;
    }

    public void setClien_contras(int clien_contras) {
        this.clien_contras = clien_contras;
    }

    public String getClien_fnac() {
        return clien_fnac;
    }

    public void setClien_fnac(String clien_fnac) {
        this.clien_fnac = clien_fnac;
    }

    @Override
    public String toString() {
        return clien_alias +
                "|" + clien_nom +
                "|" + clien_ape;
    } 
    
}