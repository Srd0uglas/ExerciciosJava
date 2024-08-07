
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        int cont = 1;
        System.out.println("Digite um número: ");
        num = scanner.nextInt();
        if(num == 0 ){
            System.out.println("O fatorial de 0 é 1.");
        } else if (num<0) {
            System.out.println("Não é possivel calcular o fatorial de um nº negativo :(");
        }
        for (int i = 1; i <=num; i++) {

//          o segredo é declarar a variável como 1
            cont = cont * i;
            System.out.println(cont);
        }

    }
}
