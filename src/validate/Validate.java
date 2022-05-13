package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String regexPhone = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    private static final String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    ;

    public Validate() {
    }
    public boolean validatePhone(String regex){
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validateEmail(String regex){
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
