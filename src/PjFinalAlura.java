import java.util.Scanner;
public class PjFinalAlura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome ;
        String tipoConte ;
        double saldo;
        int opcao = 0;

        System.out.println("Nome do Cliente: ");
        nome = scanner.next();
        System.out.println("Olá, " + nome);
        System.out.println("Qual o tipo da conta?: ");
        tipoConte = scanner.next();
        System.out.println("Saldo da Conta: ");
        saldo = scanner.nextDouble();
        System.out.println("\n****************************");

        String menu = """
                **Digite sua opção: **
                1 - Consultar Saldo
                2 - Transferir Saldo 
                3 - Receber Valor   
                4 - Sair
                """;
        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();
            if(opcao == 1){
                System.out.println("Saldo na conta: " + saldo);
            } else if (opcao == 2 ) {
                System.out.println("Valor a ser transferido: ");
                double valor = scanner.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para ser transferido");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Novo Saldo: " + saldo);
                }
            }else if(opcao == 3){
                    System.out.println("Valor a ser recebido: ");
                    double valor = scanner.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Novo Saldo: " + saldo);
                } else if (opcao!=4) {
                System.out.println("Opção Inválida");

            }
        }


    }
}