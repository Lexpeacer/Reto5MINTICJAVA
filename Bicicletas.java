package reto5;

public class Bicicletas {
  
    private String bici_fabric_nom;
    private int bici_precio;
    private int bici_anno_constr;

    public Bicicletas(String bici_fabric_nom, int bici_precio, int bici_anno_constr) {
        this.bici_fabric_nom = bici_fabric_nom;
        this.bici_precio = bici_precio;
        this.bici_anno_constr = bici_anno_constr;
    }

    public Bicicletas(int bici_anno_constr, String bici_fabric_nom) {
        this.bici_fabric_nom = bici_fabric_nom;
        this.bici_anno_constr = bici_anno_constr;
    }

    public String getBici_fabric_nom() {
        return bici_fabric_nom;
    }

    public void setBici_fabric_nom(String bici_fabric_nom) {
        this.bici_fabric_nom = bici_fabric_nom;
    }

    public Bicicletas(String bici_fabric_nom) {
        this.bici_fabric_nom = bici_fabric_nom;
    }

    public int getBici_precio() {
        return bici_precio;
    }

    public void setBici_precio(int bici_precio) {
        this.bici_precio = bici_precio;
    }

    public int getBici_anno_constr() {
        return bici_anno_constr;
    }

    public void setBici_anno_constr(int bici_anno_constr) {
        this.bici_anno_constr = bici_anno_constr;
    }

    @Override
    public String toString() {
        return bici_fabric_nom +
                "|" + bici_precio +
                "|" + bici_anno_constr;
    }        
}
