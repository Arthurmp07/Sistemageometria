import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a forma geométrica:");
            System.out.println("1. Geometria Plana");
            System.out.println("2. Geometria Espacial");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Geometriaplana geometriaPlana = new Geometriaplana();
                    geometriaPlana.calculaFormas();
                    break;
                case 2:
                    Geometriaespacial geometriaEspacial = new Geometriaespacial();
                    geometriaEspacial.calculaFormas();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            if (continuar) {
                System.out.print("Deseja voltar ao menu de opções? (sim/não): ");
                String resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("sim")) {
                    continuar = false;
                }
            }
        }

        scanner.close();
    }
}
