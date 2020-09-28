package models;

public class Villa extends Service {
//    standard : Tiêu chuẩn.
    private String standardVilla;
    private int areaVilla;
    private int numberFloor;

    public Villa(){}

    public Villa(String standardVilla, int areaVilla, int numberFloor) {
        this.standardVilla = standardVilla;
        this.areaVilla = areaVilla;
        this.numberFloor = numberFloor;
    }

    public Villa(String nameService, int areaService, int payService, int amountPeople, String typeService, String standardVilla, int areaVilla, int numberFloor) {
        super(nameService, areaService, payService, amountPeople, typeService);
        this.standardVilla = standardVilla;
        this.areaVilla = areaVilla;
        this.numberFloor = numberFloor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public int getAreaVilla() {
        return areaVilla;
    }

    public void setAreaVilla(int areaVilla) {
        this.areaVilla = areaVilla;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfo() {
        return toString()+"\n" +
                "Standard of Villa: "+standardVilla+"\n" +
                "Area of Villa: "+areaVilla+"\n" +
                "Number of Floor: "+numberFloor;
    }
}
