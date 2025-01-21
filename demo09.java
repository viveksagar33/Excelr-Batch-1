import java.util.Scanner;
 public class demo09 {
    String Cust_Name = "Vivek Sagar";
    long Account_no = 1234567890;
    Double Balance = 20000.00;
    @SuppressWarnings("resource")
    void accept_details(){
        System.out.println("Enter your name,Account no");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello" +Cust_Name);
        System.out.println("ur balance is" +Balance);
    }
    public static void main(String[] args){
        demo09 obj = new demo09();
        obj.accept_details();
        obj.Display_details();
    } 
}