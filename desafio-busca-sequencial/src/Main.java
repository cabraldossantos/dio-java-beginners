import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number, localization = -1;
        int[] elements = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        number = reader.nextInt();
        localization = position(number, elements);

        if (localization == -1){
            System.out.println("Numero " + number + " nao encontrado!");
        } else {
            System.out.println("Achei " + number + " na posicao " + localization);
        }
    }

    static int position(int number, int[] elements) {
        int localization = -1;
        for (int i = 0; i < elements.length; i++){
            if(number == elements[i]){
                localization = i;
            }
        }
        return localization;
    }
}