import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método
            contar(parametroUm, parametroDois);
            
        }catch (ParametrosInvalidosException exception){
            //imprimir a mensagem: o segundo parametros deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
        terminal.close();

    }
static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    //validar se parametroum é maior que o dois e lançar a exceção
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

    }

    int contagem = parametroDois - parametroUm;
    //realizar o for para imprimir os numeros com base na variavel contagem
    for (int i = 1; i <= contagem; i++){
        System.out.println("Imprimindo o número " + i);
    }
}


}