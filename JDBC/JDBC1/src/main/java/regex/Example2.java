package regex;

public class Example2 {
    public static void main(String[] args) {
        String no="7865744532";
        System.out.println(no.matches("[0-9]+"));
        System.out.println(no.matches("[\\d]+"));   // "\\d" is like [0-9]
        no="1234567891";
        //mobile number must have 10 digits
        System.out.println(no.matches("[\\d]{10}"));

        String empId="ram3465767CTS";  //alpha numeric a-z A-z 0-9 and _
        //[a-zA-Z0-9_] equivalent is \w

        System.out.println(empId.matches("[a-zA-Z0-9_]+"));
        System.out.println(empId.matches("\\w+"));

        System.out.println("Ram kumar".matches("[a-z]+\\s[a-z]+"));      // "\\s" is for space

        System.out.println(empId.matches("^ram.*"));    //ram word in start then anything

        System.out.println(empId.matches(".*CTS$"));    //CTS word in last

        System.out.println("hello123hello".matches("^.*(123).*$"));
        System.out.println("hello123hello".matches("^.*\\d.*$"));
    }
}
