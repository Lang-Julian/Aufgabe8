public class Land {
    //Atribute
    private String name;
    private int einwohner;
    private double flaeche;

    //Constructor

    public Land(String name, int einwohner, double flaeche) {
        this.name = name;
        this.einwohner = einwohner;
        this.flaeche = flaeche;
    }
    //Methode
    //getter
    public String getName() {
        return name;
    }
    public int getEinwohner() {
        return einwohner;
    }
    public double getFlaeche() {
        return flaeche;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setEinwohner(int einwohner) {
        this.einwohner = einwohner;

    }
    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }
}
