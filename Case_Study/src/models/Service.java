package models;

public abstract class Service {
    private String idService;
    private String nameService;
    private int areaService;
    private int payService;
    private int amountPeople;
    private String typeService;

    public Service() {
    }

    public Service(String idService, String nameService, int areaService, int payService, int amountPeople, String typeService) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaService = areaService;
        this.payService = payService;
        this.amountPeople = amountPeople;
        this.typeService = typeService;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaService() {
        return areaService;
    }

    public void setAreaService(int areaService) {
        this.areaService = areaService;
    }

    public int getPayService() {
        return payService;
    }

    public void setPayService(int payService) {
        this.payService = payService;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString(){
        return "Service : "+nameService+"\n" +
                "Area : "+areaService+"\n" +
                "Pay: "+payService+"\n" +
                "Amount people: "+amountPeople+"\n" +
                "Type service: "+typeService;
    }

    public abstract String showInfo();
}
