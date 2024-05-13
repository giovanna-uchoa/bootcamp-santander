import java.util.Locale;
import java.util.Scanner;

public class AccountTerminal {
    
    public  int    code;
    public  String agency;
    public  String userName;
    private float  balance;
        
    public void getData(Scanner scanner){
        System.out.println("Número da conta:");   code = scanner.nextInt();
        System.out.println("Número da agência:"); agency = scanner.next();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Nome do cliente:");   userName = scanner.nextLine();
        System.out.println("Saldo em conta:");    balance = scanner.nextFloat();
    }

    public void printStatus(){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.", 
        userName, agency, code, balance);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        AccountTerminal account = new AccountTerminal();
        account.getData(scanner);
        account.printStatus();
        scanner.close();
    }
}