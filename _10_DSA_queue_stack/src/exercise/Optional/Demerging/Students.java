package exercise.Optional.Demerging;

public class Students {
    private String name;
    private String gender;
    private String birthday;

    public Students(){

    }

    public Students(String name, String gender, String birthday ){
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    void display() {
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Birthday: "+this.birthday );
        System.out.println("-------------------------");
    }
}
