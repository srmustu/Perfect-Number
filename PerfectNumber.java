import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String m1,m2,m3;
        int number,calculator = 0;

        m1 = "Welcome to the perfect number finder. Please enter a number : ";
        m2 = " is the perfect number.";
        m3 = " is not a perfect number.";
        System.out.print(m1);
        number = entry.nextInt();

        for (int i  = 1; i < number; i++){
            if (number % i == 0){
                calculator += i;
            }
        }

        if (calculator == number){
            System.out.print(number + m2);
        }else {
            System.out.print(number + m3);
        }
    }

}
