package Estudos.Logica_Pogramacao.ferramentas;

import javax.swing.JOptionPane;

public class if_else_v2 {

    public static void main(String[] args) {
   
        double nota1;
        double nota2;
        double idade;
        double  result;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua nota: "));
        idade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua idade: "));

        
        result = (nota1 + nota2)/2;


        if(result > 5 && idade >=18){
            JOptionPane.showMessageDialog(null, "Você foi aprovado!!\n"+"Sua nota foi: " + result);
        }else if(idade <18){
            JOptionPane.showMessageDialog(null, "Você foi Reprovado!!\n"+"Você ainda é menor de idade: "+ idade);
    }else{
        JOptionPane.showMessageDialog(null, "Você foi Reprovado!!\n"+"Sua nota foi: " + result);

    }



    }
    
}
