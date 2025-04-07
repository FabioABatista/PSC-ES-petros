//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> ic
import com.example.Calculadora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o primeiro número: ");
        int num2 = scanner.nextInt();
        System.out.printf("numeros: %d numero2: %d", num1, num2);
Calculadora calculadora = new Calculadora();
System.out.printf("\nsoma: %d", calculadora.somar(num1, num2));
    }
    }