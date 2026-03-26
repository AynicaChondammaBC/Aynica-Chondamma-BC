import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter the age :");
        age=sc.nextInt();
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to avail fund");
            }
            else
            System.out.println("We are eligible to vote and not eligible to avail government scheme");
        }
        else
        System.out.println("We are not eligible to vote");
    }
}
