import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        int numero1, numero2;

        
        System.out.println("Digite o primeiro número:");
        numero1 = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = terminal.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        finally {
            terminal .close();
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) throw new ParametrosInvalidosException();
        int i = 1;
        while (parametro1 < parametro2) {
            System.out.printf("Imprimindo o número %d\n", i++);
            parametro1++;
        }
    }
}
