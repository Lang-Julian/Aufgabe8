public class Stadt extends Land {

    private String name;
    private int einwohner;
    private double flaeche;
    private String buergerMeister;

    public Stadt(String name, int einwohner, double flaeche, String buergerMeister) {
        super(name, einwohner, flaeche);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEinwohner() {
        return einwohner;
    }

    @Override
    public double getFlaeche() {
        return flaeche;
    }

    public String getBuergerMeister() {
        return buergerMeister;
    }

    @Override
    public void setEinwohner(int einwohner) {
        this.einwohner = einwohner;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public void setBuergerMeister(String buergerMeister) {
        this.buergerMeister = buergerMeister;
    }
}
