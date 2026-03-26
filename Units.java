import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units :");
        int units =sc.nextInt();
        if(units<=150)
        System.out.println("Cost is: "+(units*1.5));
        else
        System.out.println("Cost is: "+(units*3));
    }
}
