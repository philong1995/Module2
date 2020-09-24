package exercise.Optional.Demerging;

import exercise.Optional.Demerging.Students;

public class test{
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.setName("Nguyen Van A");
        s1.setGender("Nam");
        s1.setBirthday("01/04/1995");
        s2.setName("Nguyen Thi B");
        s2.setGender("Nu");
        s2.setBirthday("16/10/1998");
        System.out.println("-------------------------");
        s1.display();
        s2.display();
    }
}
