import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rect = new Rectangle();

        System.out.println("Entre com as medidas do triângulo Base e Altura");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.println();
        System.out.printf("ÁREA = %.2f \n", rect.area());
        System.out.printf("PERÍMETRO = %.2f \n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f \n", rect.diagonal());
    }
}