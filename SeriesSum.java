// 1. Write a program to calculate the sum of following series where n is input by user. 
// e.g 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        Scanner I=new Scanner(System.in);
        System.out.print("Enter the number you want to sum upto-:");
        int n=I.nextInt();
        double sum=0;
for (int i = 1; i <= n; i++) {
    sum+=(1/i);
}
I.close();
System.out.println("Sum is-:"+sum);
    }
}
