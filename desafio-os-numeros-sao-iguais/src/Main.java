import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();
        System.out.println((A - B) == 0 ? "Sao iguais!" : "Nao sao iguais!");

        leitor.close();
    }
}