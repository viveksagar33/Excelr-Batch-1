import java.util.Scanner;

class customer{
    private String custname;
    private long bankaccno;
    private Double balance;

    void input(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        custname = sc.next();
        System.out.print("Enter your account number: ");
        bankaccno = sc.nextLong();
        System.out.print("Enter bank balance: ");
        balance = sc.nextDouble();
        @SuppressWarnings("unused")
        demo012 obj = new demo012();
    }

    void display(){
        System.out.println("Hello "+custname+"\nBank account number: "+bankaccno+"\nBalance: "+balance);
    }
}
public class demo012 {
    public static void main(String[] args) {
        customer obj = new customer();
        obj.input();
        obj.display();
    }
}
