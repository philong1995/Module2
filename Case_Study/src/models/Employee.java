package models;

public class Employee {
    private String idEmployee;
    private String nameEmployee;
    private int ageEmployee;
    private String addressEmployee;

    public Employee(){}

    public Employee(String idEmployee, String nameEmployee, int ageEmployee, String addressEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return "Name of Employee: " + nameEmployee +"\n"+
                "Age of Employee: " + ageEmployee +"\n"+
                "Address of Employee: " + addressEmployee ;
    }
}
