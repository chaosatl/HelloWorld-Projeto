import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String Nome = scanner.nextLine();

        System.out.print("Quantos anos vc tem?: ");
        int Idade = scanner.nextInt();

        int AnoAtual= 2024;
        int Ano = AnoAtual-Idade;

        System.out.println("Olá," +Nome);
        System.out.println("Quantos anos você tem:  " +Idade + " anos");
        System.out.println("você nasceu em: "+ Ano);

        scanner.close();
    }
}
