package reto5;

public class IntencCompra {
    
    private String comp_clien_alias;
    private String comp_fabric_nom;
    private String comp_fecha_hora;

    public IntencCompra(String comp_clien_alias, String comp_fabric_nom, String comp_fecha_hora) {
        this.comp_clien_alias = comp_clien_alias;
        this.comp_fabric_nom = comp_fabric_nom;
        this.comp_fecha_hora = comp_fecha_hora;
    }

    public IntencCompra(String comp_clien_alias, String comp_fabric_nom) {
        this.comp_clien_alias = comp_clien_alias;
        this.comp_fabric_nom = comp_fabric_nom;
    }
    
    public IntencCompra(String comp_fabric_nom) {
        this.comp_fabric_nom = comp_fabric_nom;
    }

    public String getComp_clien_alias() {
        return comp_clien_alias;
    }

    public void setComp_clien_alias(String comp_clien_alias) {
        this.comp_clien_alias = comp_clien_alias;
    }

    public String getComp_fabric_nom() {
        return comp_fabric_nom;
    }

    public void setComp_fabric_nom(String comp_fabric_nom) {
        this.comp_fabric_nom = comp_fabric_nom;
    }

    public String getComp_fecha_hora() {
        return comp_fecha_hora;
    }

    public void setComp_fecha_hora(String comp_fecha_hora) {
        this.comp_fecha_hora = comp_fecha_hora;
    }

    @Override
    public String toString() {
        return comp_fabric_nom;
    }
}