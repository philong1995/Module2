package models;

public class Room extends Service{
    private String freeService;

    public Room(){}

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idService, String nameService, int areaService, int payService, int amountPeople, String typeService, String freeService) {
        super(idService, nameService, areaService, payService, amountPeople, typeService);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService;
    }

    @Override
    public String showInfo() {
        return this.toString();
    }
}
