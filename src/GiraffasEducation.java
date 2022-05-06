import java.util.Scanner;

public class GiraffasEducation {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite lado do prédio 1: ");
        double lado1 = teclado.nextDouble();
        System.out.println("Digite altura do prédio 1: ");
        double altura1 = teclado.nextDouble();

        System.out.println("Digite o raio do prédio 2: ");
        double raio2 = teclado.nextDouble();

        System.out.println("Digite largura do prédio 3: ");
        double largura3 = teclado.nextDouble();
        System.out.println("Digite comprimento do prédio 3: ");
        double comprimento3 = teclado.nextDouble();
        System.out.println("Digite altura do prédio 3: ");
        double altura3 = teclado.nextDouble();

        System.out.println("Digite a largura do terreno: ");
        double larguraTerreno = teclado.nextDouble();
        System.out.println("Digite comprimento do terreno: ");
        double comprimentoTerreno = teclado.nextDouble();

        double tintaTotal = (aQuadrado(lado1, altura1) + aEsfera(raio2) + aRetangulo(largura3, comprimento3, altura3)) / 0.5;
        double valorTotal = Math.ceil(tintaTotal * 216);
        System.out.println(" O valor total para a pintura dos 2 edifícios e da esfera é de " + valorTotal);

        double terretoTotal = aTerreno(larguraTerreno, comprimentoTerreno);
        double umaCaixa = 36;
        double qntdCaixa = Math.ceil((terretoTotal / umaCaixa) * 1.05);
        System.out.println(" A quantidade de caixas necessárias para a troca do piso do terreno é de " + qntdCaixa);

    }

    public static double aQuadrado(double lado, double altura){
        return (4 * (lado * altura) + (Math.pow(lado, 2))) * 0.8;
    }

    public static double aEsfera(double raio){
        return 4 * (Math.pow(raio, 2) * Math.PI);
    }

    public static double aRetangulo(double largura, double comprimento, double altura){
        return ((2 * (largura * altura)) + (2 * (comprimento * altura)) + (largura * comprimento)) * 0.7;
    }

    public static double aTerreno(double largura, double comprimento){
        return largura * comprimento;
    }
}
