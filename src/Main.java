//Classe de exemplo para o exercicio da Aula 1 de Métodos.
public class Main {
    public static void main(String[] args) {


    //Calculadora
    System.out.println("Exercicio Calculadora");
    Calculadora.soma(3, 6);
    Calculadora.subtracao(9, 1.8);
    Calculadora.multiplicacao(7, 8);
    Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("\nExercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("\nExercicio Emprestimo");
        Emprestimo.calculara(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calculara(1000, Emprestimo.getTresParcelas());
        Emprestimo.calculara(1000, 5);

    }


}