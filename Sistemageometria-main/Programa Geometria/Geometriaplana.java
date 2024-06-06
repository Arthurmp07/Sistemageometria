
import java.util.Scanner;

public class Geometriaplana {
    private Scanner scanner;
    private int escolha;
    private float altura;
    private float base;
    private float raio;
    private float lado;
    private float base_maior;
    
    private static final float PI = 3.14f;
    private static final float RAIZ_DE_TRES = 1.7f;

    public Geometriaplana(Scanner scanner) {
        this.scanner = scanner;
        mostrarMenu();
    }

    private void mostrarMenu() {
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
        if (escolha == 7 || escolha == 8) {
            return; // Voltar ao menu principal ou finalizar programa
        }
        if (!receberDados()) {
            System.out.println("Opção inválida.");
            return;
        }

        float area = calcularArea();
        System.out.println("A área calculada é: " + area);
    }

    private boolean receberDados() {
        switch (escolha) {
            case 1:
                System.out.print("Digite o lado: ");
                lado = parseInput(scanner.next());
                break;
            case 2:
                System.out.print("Digite a base: ");
                base = parseInput(scanner.next());
                System.out.print("Digite a altura: ");
                altura = parseInput(scanner.next());
                break;
            case 3:
                System.out.print("Digite a base: ");
                base = parseInput(scanner.next());
                System.out.print("Digite a altura: ");
                altura = parseInput(scanner.next());
                break;
            case 4:
                System.out.print("Digite o raio: ");
                raio = parseInput(scanner.next());
                break;
            case 5:
                System.out.print("Digite o lado: ");
                lado = parseInput(scanner.next());
                break;
            case 6:
                System.out.print("Digite a base maior: ");
                base_maior = parseInput(scanner.next());
                System.out.print("Digite a base menor: ");
                base = parseInput(scanner.next());
                System.out.print("Digite a altura: ");
                altura = parseInput(scanner.next());
                break;
            default:
                return false;
        }
        return true;
    }

    private float parseInput(String input) {
        return Float.parseFloat(input.replace(",", "."));
    }

    private float calcularArea() {
        switch (escolha) {
            case 1:
                return lado * lado;
            case 2:
                return base * altura;
            case 3:
                return (base * altura) / 2;
            case 4:
                return PI * raio * raio;
            case 5:
                return (3 * (lado * lado) * RAIZ_DE_TRES) / 2;
            case 6:
                return ((base_maior + base) * altura) / 2;
            default:
                return 0;
        }
    }
}
