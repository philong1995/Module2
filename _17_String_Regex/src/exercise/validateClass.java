package exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateClass {

    public static final String REGEX = "(A|C|P)[0-9]{4}(G|H|I|K|L|M)[0-9]{1}$";

    public static void main(String[] args) {
        Pattern validateClass = Pattern.compile(REGEX);
        Matcher matcher = validateClass.matcher("C0720G1");

        if (matcher.matches()){
            System.out.println("Tên class hợp lệ");
        }else {
            System.out.println("Tên class không hợp lệ");
        }
    }
}
