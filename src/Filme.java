//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Filme {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bem-Vindo(a) ao CineStream! ");
        System.out.println("File: Os Incríveis");

//        Declaraão de variáveis
        int  anoDeLancamento = 2004;
        System.out.println("Ano de Lançamento: " +anoDeLancamento);
        boolean incluiNoPlano = true;
        double notaDoFilme = 4.5;

//        soma das minhas notas
//        os parenteses significam prioridade na hora de executar
        double media = ( 5.5 + 8.7 + 7.3 )/ 2;
        System.out.println(media);

        String sinopse;
        sinopse = "O Filme de " + anoDeLancamento+ " segue as aventuras de uma família de ex-super-heróis redescobrindo a verdadeira origem de seus poderes - sua união.";
        System.out.printf(sinopse);

//        Avaliação (estrelas) - com casting (conversão)
//        a variável classificacao é do tipo int e o valor da variável media é double, por esse motivo é necessário converter para inteiro
//        pegou um nº double e jogou dentro de uma variável inteiro
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}

