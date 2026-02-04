package practice;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence,word;
        System.out.println("Enter a sentence");
        sentence=sc.nextLine();
        if(!sentence.matches("[a-zA-Z ]+")){
            System.out.println(sentence+" is an invalid sentence");
            return;
        }
        System.out.println("Enter a word");
        word=sc.next();
        if(!word.matches("[A-Za-z]+"))
            System.out.println(word+" is an invalid word");
        String[] wordInSentence=sentence.split(" ");
        boolean found=false;
        for(String w:wordInSentence){
            if(w.equals(word)){
                found=true;
                break;
            }
        }
        if(found=false){
            System.out.println(word+" is not in the sentence");
            return;
        }
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }
        String result=sentence.replace(word,rev);
        System.out.println(result);
    }

}
