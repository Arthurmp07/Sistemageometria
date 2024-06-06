import java.util.Scanner;

public class Geometriaespacial {
    private Scanner scanner;
    private int escolha;
    private float altura;
    private float base;
    private float raio;
    
    private static final float PI = 3.14f;

    public Geometriaespacial(Scanner scanner) {
        this.scanner = scanner;
        mostrarMenu();
    }

    private void mostrarMenu() {
        boolean voltarMenu = false;

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

            if (escolha == 7) {
                voltarMenu = true;
            } else if (escolha == 8) {
                System.exit(0);
            } else {
                if (!receberDados()) {
                    System.out.println("Opção inválida.");
                } else {
                    calculaFormas();
                }
            }
        } while (!voltarMenu);
    }

    private boolean receberDados() {
        switch (escolha) {
            case 1:
                System.out.print("Digite a aresta: ");
                altura = parseInput(scanner.next());
                break;
            case 2:
                System.out.print("Digite a aresta (altura): ");
                altura = parseInput(scanner.next());
                System.out.print("Digite a área da base: ");
                base = parseInput(scanner.next());
                break;
            case 3:
                System.out.print("Digite a altura: ");
                altura = parseInput(scanner.next());
                System.out.print("Digite a área da base: ");
                base = parseInput(scanner.next());
                break;
            case 4:
                System.out.print("Digite o raio: ");
                raio = parseInput(scanner.next());
                break;
            case 5:
                System.out.print("Digite a área da base: ");
                base = parseInput(scanner.next());
                System.out.print("Digite a altura: ");
                altura = parseInput(scanner.next());
                break;
            case 6:
                System.out.print("Digite o raio: ");
                raio = parseInput(scanner.next());
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

    public void calculaFormas() {
        float volume = calcularVolume();
        System.out.println("O volume calculado é: " + volume);
    }

    private float calcularVolume() {
        switch (escolha) {
            case 1:
                return altura * altura * altura;
            case 2:
                return base * altura;
            case 3:
                return (base * altura) / 3;
            case 4:
                return (4 * PI * raio * raio * raio) / 3;
            case 5:
                return (PI * raio * raio) * altura;
            case 6:
                return ((PI * raio * raio) * altura) / 3;
            default:
                return 0;
        }
    }
}
