//Classe de exemplo para o exercicio da Aula 1 de Métodos.

public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println(" A Soma de " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println(" A subtração de " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println(" A multiplicacao de " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println(" A divisao de " + numero1 + " / " + numero2 + " = " + resultado);
    }

}
