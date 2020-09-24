package exercise;

public class ProductManager implements Comparable<ProductManager>{
    private String nameProduct;
    private int idProduct;
    private double priceProduct;

    public ProductManager(){

    }

    public ProductManager(int idProduct, String nameProduct, double priceProduct){
        super();
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }


    @Override
    public String toString(){
        return "ID Product : "+idProduct+" - "+nameProduct+" - "+priceProduct;
    }


    @Override
    public int compareTo(ProductManager otherPrice) {
        return (int) (this.priceProduct - otherPrice.getPriceProduct());
    }
}
