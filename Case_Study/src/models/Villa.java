package models;

public class Villa extends Service {
//    standard : Tiêu chuẩn.
    private String standardVilla;
    private String otherFacilities;
    private double areaPool;
    private int amountFloor;

    public Villa(){}

    public Villa(String standardVilla, String otherFacilities, double areaPool, int amountFloor) {
        this.standardVilla = standardVilla;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.amountFloor = amountFloor;
    }

    public Villa(String idService, String nameService, int areaService, int payService, int amountPeople, String typeService, String standardVilla, String otherFacilities, double areaPool, int amountFloor) {
        super(idService, nameService, areaService, payService, amountPeople, typeService);
        this.standardVilla = standardVilla;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.amountFloor = amountFloor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getAmountFloor() {
        return amountFloor;
    }

    public void setAmountFloor(int amountFloor) {
        this.amountFloor = amountFloor;
    }

    @Override
    public String showInfo() {
        return toString()+"\n" +
                "Standard of Villa: "+standardVilla+"\n" +
                "Other facilities: "+otherFacilities+"\n"+
                "Area of Villa: "+areaPool+"\n" +
                "Number of Floor: "+amountFloor;
    }
}
