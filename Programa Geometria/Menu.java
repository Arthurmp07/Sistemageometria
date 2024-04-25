import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Geometria Plana");
        System.out.println("2. Geometria Espacial");
        System.out.print("Opção: ");
        
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            Geometriaplana geometriaPlana = new Geometriaplana();
            geometriaPlana.calculaFormas();
        } else if (escolha == 2) {
            Geometriaespacial geometriaEspacial = new Geometriaespacial();
            geometriaEspacial.calculaFormas();
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
