package models;

public class House extends Service {
    private String standardHouse;
//    convenient : Tiện .
    private String convenient;
    private int floorHouse;

    public House(){}

    public House(String standardHouse, String convenient, int floorHouse) {
        this.standardHouse = standardHouse;
        this.convenient = convenient;
        this.floorHouse = floorHouse;
    }

    public House(String nameService, int areaService, int payService, int amountPeople, String typeService, String standardHouse, String convenient, int floorHouse) {
        super(nameService, areaService, payService, amountPeople, typeService);
        this.standardHouse = standardHouse;
        this.convenient = convenient;
        this.floorHouse = floorHouse;
    }

    @Override
    public String showInfo() {
        return toString()+"\n" +
                "Standard of House: "+standardHouse+"\n" +
//                Description of the facility : mô tả tiện ích.
                "Description of the facility: "+convenient+"\n" +
                "Number of Floor: "+floorHouse;
    }
}
