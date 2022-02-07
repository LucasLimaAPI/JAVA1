package Estudos.Logica_Pogramacao.entrada_saida;

import javax.swing.JOptionPane;

public class Entrada_saida_dados_v2 {

    public static void main(String[] args) {

        String nome = "";
        nome = JOptionPane.showInputDialog(null, "Digite seu nome");

        if (nome == null) {
            System.out.println("");
        } else {
            JOptionPane.showMessageDialog(null, "Ola " + nome + " seja bem vindo aos meus testes!!");
        }
    }

}
