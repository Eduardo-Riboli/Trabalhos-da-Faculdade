import java.util.Scanner;

public class Trabalho2 {
    public static void main(String[] args){
        menu();
    }

    public static void menu() {
        // No menu, ele oferece as opções que o usuário pode digitar.
        System.out.println("Digite o número da opção abaixo");
        System.out.println("1 - Presente. ");
        System.out.println("2 - Pretérito Perfeito. ");
        System.out.println("3 - Futuro do presente. ");
        System.out.println("4 - Sair do programa");

        // Cria uma variável e atribui ela o valor do método "menuOption()";
        int option = menuOption();

        switch (option){
            // Caso o usuário digite 1, ele vai para o método diasVida();
            case 1:
                presente();
                System.out.println();
                break;
            // Caso o usuário digite 2, ele vai para o método aniversario();
            case 2:
                preterito();
                System.out.println();
                break;
            // Caso o usuário digite 3, ele vai para o método diaSemana();
            case 3:
                futuro();
                System.out.println();
                break;
            // Caso o usuário digite 4, ele encerra o programa;
            case 4:
                System.exit(0);
                System.out.println();
                break;
            // Qualquer outro número, ele invalida essa opção e chama novamente o menu(), repetindo o processo.
            default:
                System.out.println("Você digitou uma opção inválida, por favor, digite um número de 1 a 4");
                menu();
                break;
        }
        // Chama sempre o menu(), para continuar o loop após cada questão.
        menu();
    }

    public static int menuOption(){
        // Cria-se uma variável do tipo inteiro.
        int option;
        // Utiliza-se o try para qualquer excessão, ele mostre no catch.
        try{
            // Nessa parte, ele realiza a leitura do número digitado pelo usuário no método menu();
            Scanner teclado = new Scanner(System.in);
            System.out.println();
            // Armazena a opção na variável "option";
            option = teclado.nextInt();
        } catch (Exception exception) {
            // Caso o usuário digite um número fora das opções, ocorrerá essa excessão.
            System.out.println("Você não digitou um número, por favor, digite um número novamente.");
            menu();
            // Nesse caso, ele mostra novamente o menu e pede para o usuário digitar novamente uma opção
            option = menuOption();
        }
        // Retorna essa opção
        return option;
    }

    public static void presente(){
        Scanner teclado = new Scanner(System.in);
        String tempoVerbal = "";
        String letra = "";

        System.out.println("Digite uma palavra no infito");
        String palavra = teclado.nextLine();

        for (int i = 0; i < palavra.length() - 1; i++){
            if (i == palavra.length() - 2){
                letra += palavra.charAt(i);
                break;
            }
            tempoVerbal += palavra.charAt(i);
        }

        System.out.println("Eu: " + tempoVerbal + "o");
        System.out.println("Tu: " + tempoVerbal + letra + "s");
        System.out.println("Ele, Ela: " + tempoVerbal + letra);
        System.out.println("Nós: " + tempoVerbal + letra + "mos");
        System.out.println("Vós: " + tempoVerbal + letra + "is");
        System.out.println("Eles, Elas: " + tempoVerbal + letra + "m");

    }

    public static void preterito(){
        Scanner teclado = new Scanner(System.in);
        String tempoVerbal = "";
        String tempoVerbalFinal = "";
        String letra = "";

        System.out.println("Digite uma palavra no infito");
        String palavra = teclado.nextLine();

        for (int j = palavra.length() - 2; j <= palavra.length() - 1; j++){
            tempoVerbalFinal += palavra.charAt(j);
        }

        for (int i = 0; i < palavra.length() - 1; i++){
            if (i == palavra.length() - 2){
                letra += palavra.charAt(i);
                break;
            }
            tempoVerbal += palavra.charAt(i);
        }

        if (tempoVerbalFinal.equals("ar")) {
            System.out.println("Eu: " + tempoVerbal + "ei");
            System.out.println("Tu: " + tempoVerbal + letra + "ste");
            System.out.println("Ele, Ela: " + tempoVerbal + "ou");
            System.out.println("Nós: " + tempoVerbal + letra + "mos");
            System.out.println("Vós: " + tempoVerbal + letra + "stes");
            System.out.println("Eles, Elas: " + tempoVerbal + letra + "ram");
        }
        else {
            System.out.println("Eu: " + tempoVerbal + "i");
            System.out.println("Tu: " + tempoVerbal + letra + "ste");
            System.out.println("Ele, Ela: " + tempoVerbal + letra + "u");
            System.out.println("Nós: " + tempoVerbal + letra + "mos");
            System.out.println("Vós: " + tempoVerbal + letra + "stes");
            System.out.println("Eles, Elas: " + tempoVerbal + letra + "ram");
        }
    }

    public static void futuro(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma palavra no infito");
        String palavra = teclado.nextLine();

        System.out.println("Eu: " + palavra + "ei");
        System.out.println("Tu: " + palavra + "ás");
        System.out.println("Ele, Ela: " + palavra + "á");
        System.out.println("Nós: " + palavra + "emos");
        System.out.println("Vós: " + palavra + "eis");
        System.out.println("Eles, Elas: " + palavra + "ão");
    }
}
