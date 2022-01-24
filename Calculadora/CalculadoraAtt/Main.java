package Calculadora.CalculadoraAtt;


public class Main {
    
    public static void main(String[] args){

        //Calculator 
        System.out.println("Calculator");
        CalculadoraAtt.soma(3,6);
        CalculadoraAtt.subtracao(9,1.8);
        CalculadoraAtt.divisao(5, 2.5);
        CalculadoraAtt.multiplicacao(7, 8);

        //Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(22);

        //Empréstimo 
        System.out.println("Empréstimo");
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



    }
    
}
