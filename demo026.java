import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Count{
    ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
    void computeCount(String str){
        int vCount, cCount;
        vCount = cCount = 0;
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++){
            if(vowels.contains(str.charAt(i))){
                vCount++;
            }
            else if(str.charAt(i) != ' '){
                cCount++;
            }
        }
        System.out.println("Vowels: "+vCount);
        System.out.println("Consonants: "+cCount);
    }
}

class Demo26{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string: ");
            String str = sc.nextLine();
            Count c = new Count();
            c.computeCount(str);
        }
    }
}