import java.util.Locale;
import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        BankAccount account = new BankAccount(scanner);
        account.printStatus();
        scanner.close();
    }
}