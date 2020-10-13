package models;

public class Villa extends Service {
//    standard : Tiêu chuẩn.
    private String standardVilla;
    private String otherFacilities;
    private String areaPool;
    private String amountFloor;

    public Villa(){}

    public Villa(String standardVilla, String otherFacilities, String areaPool, String amountFloor) {
        this.standardVilla = standardVilla;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.amountFloor = amountFloor;
    }

    public Villa(String idService, String nameService, int areaService, int payService, int amountPeople, String typeService, String standardVilla, String otherFacilities, String areaPool, String amountFloor) {
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getAmountFloor() {
        return amountFloor;
    }

    public void setAmountFloor(String amountFloor) {
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
