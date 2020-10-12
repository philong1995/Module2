package models;

public class Customer implements Comparable<Customer>{
    private String fullName;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Service services;

    public Customer(){}

    public Customer(String fullName, String birthDay, String gender, String idCard, String phoneNumber, String email, String typeCustomer, String address, Service services) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getServices() {
        return services;
    }

    public void setServices(Service services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Name of Customer: " + fullName + '\n' +
                "Day of birth: " + birthDay + '\n' +
                "Gender: " + gender + '\n' +
                "ID card: " + idCard + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Email: " + email + '\n' +
                "Type Customer: " + typeCustomer + '\n' +
                "Address: " + address + '\n' +
                "Services: " + services;
    }

    @Override
    public int compareTo(Customer second) {
        int result = this.fullName.compareTo(second.fullName);
        if (result == 0) {
            int yearCustomerFist = Integer.parseInt(this.birthDay.split("/")[2]);
            int yearCustomerSecond = Integer.parseInt(this.birthDay.split("/")[2]);
            return yearCustomerFist - yearCustomerSecond;
        }
        return result;
    }
}
