import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact, num = 0;
        fact = sc.nextLong();
        if (fact <= 0) 
            System.out.println("Invalid Input");
        else {
            for( int i = 1; i <= fact; i++) {
                if(fact % i == 0) {
                    fact = fact/i;
                    num = num + 1;
                }
                else
                    break;
            }
            if(fact == 1)
                System.out.println(num);
            else
                System.out.println("Sorry. The given number is not a perfect factorial");
        }
    }
}
