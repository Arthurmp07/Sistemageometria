import java.util.Scanner;

public class Geometriaespacial {
    private int escolha;
    private float altura;
    private float base;
    private float raio;

    public Geometriaespacial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Cubo");
        System.out.println("2. Paralelepípedo");
        System.out.println("3. Pirâmide");
        System.out.println("4. Esfera");
        System.out.print("Opção: ");
        escolha = scanner.nextInt();

        if (escolha == 1 || escolha == 2) {
            System.out.println("Digite a aresta (altura): ");
            altura = scanner.nextFloat();
        } else if (escolha == 3) {
            System.out.println("Digite a altura: ");
            altura = scanner.nextFloat();
            System.out.println("Digite a base: ");
            base = scanner.nextFloat();
        } else if (escolha == 4) {
            System.out.println("Digite o raio: ");
            raio = scanner.nextFloat();
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public void calculaFormas() {
        float volume = 0;

        switch (escolha) {
            case 1:
                volume = altura * altura * altura;
                break;
            case 2:
                volume = base * base * altura;
                break;
            case 3:
                volume = (base * base * altura) / 3;
                break;
            case 4:
                volume = (4 * 3.14f * raio * raio * raio) / 3; // Usando 3.14 como valor aproximado de Pi
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O volume calculado é: " + volume);
    }
}
