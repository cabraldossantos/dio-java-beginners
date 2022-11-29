import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int N;
        N = number.nextInt();
        System.out.println(summation(N));
    }

    static int summation(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number + summation(number - 1);
        }
    }
}