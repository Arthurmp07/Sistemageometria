import java.util.Scanner;

public class Geometriaplana {
    Scanner scanner = new Scanner(System.in);
    private int escolha;
    private float altura;
    private float base;
    private float raio;
    private float lado;
    private float base_maior;

    public Geometriaplana() {

        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Círculo");
        System.out.println("5. Hexágono");
        System.out.println("6. Trapézio");
        System.out.println("7. Voltar Menu");
        System.out.println("8. Finalizar programa");
        System.out.print("Opção: ");
        escolha = scanner.nextInt();
    }

    public void calculaFormas() {

        float area = 0;
        switch (escolha) {
            case 1:
                System.out.println("Digite o lado: ");
                lado = scanner.nextFloat();
                break;
            case 2:
                System.out.println("Digite a base: ");
                base = scanner.nextFloat();
                System.out.println("Digite a altura: ");
                altura = scanner.nextFloat();
                break;
            case 3:
                System.out.println("Digite a base: ");
                base = scanner.nextFloat();
                System.out.println("Digite a altura: ");
                altura = scanner.nextFloat();
                break;
            case 4:
                System.out.println("Digite o raio: ");
                raio = scanner.nextFloat();
                break;
            case 5:
                System.out.print("Digite o lado: ");
                lado = scanner.nextFloat();
                break;
            case 6:
                System.out.println("Digite a base maior");
                base_maior = scanner.nextFloat();
                System.out.println("Digite a base menor");
                base = scanner.nextFloat();
                System.out.println("Digite a altura");
                altura = scanner.nextFloat();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        switch (escolha) {
            case 1:
                area = lado * lado;
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
            case 5:
                area = (float) ((3 * (lado * lado) * 1.7) / 2); // Raiz de três pode ser aproximada para 1.7
                break;
            case 6:
                area = (((base_maior + base) * altura) / 2); // base maior = lado mais comprido do trapézio
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("A área calculada é: " + area);
    }
}
