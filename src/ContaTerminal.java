import java.util.Scanner;

public class  ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência");
        String agencia = sc.nextLine();
        

        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();
        

        System.out.println("Digite o saldo");
        Double saldo  = sc.nextDouble();
        sc.nextLine();


        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e o número da sua conta é " + numeroConta + " e seu saldo no valor de " + saldo + " reais já está disponível para saque");

        
        
        sc.close();
    }

}
