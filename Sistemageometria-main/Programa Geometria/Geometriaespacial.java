import java.util.Scanner;

public class Geometriaespacial {
    private int escolha;
    private float altura;
    private float base;
    private float raio;
    private boolean voltarMenu;

    public Geometriaespacial() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha a forma geométrica:");
            System.out.println("1. Cubo");
            System.out.println("2. Paralelepípedo");
            System.out.println("3. Pirâmide");
            System.out.println("4. Esfera");
            System.out.println("5. Cilindro");
            System.out.println("6. Cone");
            System.out.println("7. Voltar ao menu principal");
            System.out.println("8. Finalizar programa");
            System.out.print("Opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a aresta: ");
                    altura = scanner.nextFloat();
                    break;
                case 2:
                    System.out.println("Digite a aresta (altura): ");
                    altura = scanner.nextFloat();
                    System.out.println("Digite a área da base: ");
                    base = scanner.nextFloat();
                    break;
                case 3:
                    System.out.println("Digite a altura: ");
                    altura = scanner.nextFloat();
                    System.out.println("Digite a área da base: ");
                    base = scanner.nextFloat();
                    break;
                case 4:
                    System.out.println("Digite o raio: ");
                    raio = scanner.nextFloat();
                    break;
                case 5:
                    System.out.println("Digite a área da base: ");
                    base = scanner.nextFloat();
                    System.out.println("Digite a altura: ");
                    altura = scanner.nextFloat();
                    break;
                case 6:
                    System.out.print("Digite o raio: ");
                    raio = scanner.nextFloat();
                    System.out.println("Digite a altura: ");
                    altura = scanner.nextFloat();
                    break;
                case 7:
                    voltarMenu = true; // Indica que o usuário deseja voltar ao menu principal
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (!voltarMenu) {
                calculaFormas();
            }
        } while (!voltarMenu);
        
        scanner.close();
    }

    // Classe Geometriaespacial
    public void calculaFormas() {
        float volume = 0;

        switch (escolha) {
            case 1:
                volume = altura * altura * altura;
                break;
            case 2:
                volume = base * altura;
                break;
            case 3:
                volume = (base * altura) / 3;
                break;
            case 4:
                volume = (4 * 3.14f * raio * raio * raio) / 3; // Usando 3.14 como valor aproximado de Pi
                break;
            case 5:
                volume = (3.14f * raio * raio) * altura;
                break;
            case 6:
                volume = ((3.14f * raio * raio) * altura)/3;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O volume calculado é: " + volume);
    }

    public static void main(String[] args) {
        new Geometriaespacial();
    }
}
