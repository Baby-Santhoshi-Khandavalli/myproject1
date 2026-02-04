package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String s="helloworldA";
//        String pattern="[a-z]+";
//
//        Pattern pattern1=Pattern.compile(pattern);
//        Matcher matcher=pattern1.matcher(s);
//
//        System.out.println(matcher.find());

        String age="20A";
        System.out.println(age.matches("[0-9]+"));

        String name="ram";
        System.out.println(name.matches("[a-z]+"));

        String empId="CtsEmp2465936";
        System.out.println(empId.matches("[a-zA-Z0-9]+"));

        //string matching other than a,b,c
        System.out.println("h".matches("[^abc]"));
        System.out.println("a".matches("[^abc]"));  //without + it takes only one character

        System.out.println("abc".matches("[a-z]{3}"));
        System.out.println("abcd".matches("[a-z]{3}"));
        System.out.println("abcd".matches("[a-z]{3,8}"));
        System.out.println("abcdefghijklmn".matches("[a-z]{3,8}"));
    }
}
