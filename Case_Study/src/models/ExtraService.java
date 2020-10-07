package models;

public class ExtraService {
    private String nameServiceExtra;
    private String typeServiceExtra;
    private double priceServiceExtra;

    public ExtraService() {
    }

    public ExtraService(String nameServiceExtra, String typeServiceExtra, double priceServiceExtra) {
        this.nameServiceExtra = nameServiceExtra;
        this.typeServiceExtra = typeServiceExtra;
        this.priceServiceExtra = priceServiceExtra;
    }

    public String getNameServiceExtra() {
        return nameServiceExtra;
    }

    public void setNameServiceExtra(String nameServiceExtra) {
        this.nameServiceExtra = nameServiceExtra;
    }

    public String getTypeServiceExtra() {
        return typeServiceExtra;
    }

    public void setTypeServiceExtra(String typeServiceExtra) {
        this.typeServiceExtra = typeServiceExtra;
    }

    public double getPriceServiceExtra() {
        return priceServiceExtra;
    }

    public void setPriceServiceExtra(double priceServiceExtra) {
        this.priceServiceExtra = priceServiceExtra;
    }

    @Override
    public String toString() {
        return "ExtraService{" +
                "nameServiceExtra='" + nameServiceExtra + '\'' +
                ", typeServiceExtra='" + typeServiceExtra + '\'' +
                ", priceServiceExtra=" + priceServiceExtra +
                '}';
    }
}
