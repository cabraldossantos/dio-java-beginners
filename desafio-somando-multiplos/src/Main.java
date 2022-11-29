import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int sum = 0;
        for(int i=1; i<=N; i++){
            if(i % A == 0) {
                sum+= i;
            }
        }
        System.out.println(sum);
    }
}