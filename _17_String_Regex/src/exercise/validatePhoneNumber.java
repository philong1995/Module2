package exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validatePhoneNumber {

    public static final String REGEX = "[0-9]{2}(-)(0)[0-9]{9}";

    public static void main(String[] args) {
        Pattern number = Pattern.compile(REGEX);
        Matcher matcher = number.matcher("84-0931234560");

        if (matcher.matches()){
            System.out.println("Số điện thoại hợp lê.");
        }else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
