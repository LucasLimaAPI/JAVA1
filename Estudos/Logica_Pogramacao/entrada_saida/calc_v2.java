package Estudos.Logica_Pogramacao.entrada_saida;

import javax.swing.JOptionPane;

public class calc_v2 {
    public static void main(String[] args) {
       
            double num1;
            double num2, sum, sub, mult, div;

            
            num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));

           
            num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero: "));

            sum = num1 + num2;
            sub = num1 - num2;
            mult = num1 * num2;
            div = num1 / num2;

            JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum +
                    "\n" + num1 + " + " + num2 + " = " + sub +
                    "\n" + num1 + " + " + num2 + " = " + mult +
                    "\n" + num1 + " + " + num2 + " = " + div );
        
        

    }
}
