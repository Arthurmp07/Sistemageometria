import java.util.Scanner;

public class Geometriaplana {
    private int escolha;
    private float altura;
    private float base;
    private float raio;

    public Geometriaplana() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Círculo");
        System.out.print("Opção: ");
        escolha = scanner.nextInt();

        if (escolha == 1 || escolha == 2 || escolha == 3) {
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
        float area = 0;

        switch (escolha) {
            case 1:
                area = base * base;
                break;
            case 2:
                area = base * altura;
                break;
            case 3:
                area = (base * altura) / 2;
                break;
            case 4:
                area = 3.14f * raio * raio; // Usando 3.14 como valor aproximado de Pi
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("A área calculada é: " + area);
    }
}
