package Estudos.Logica_Pogramacao.Vetores;

public class Matrizes {

    // ARRAYS BIDIMENSIONAIS
    public static void main(String[] args) {
//                                      L  C                       
        String [][] matriz = new String[2][2];

        matriz [0][0]= "X1 - Y1";
        matriz [0][1]= "X1 - Y2 ";

        matriz[1][0] = "X2 - Y1";
        matriz[1][1] = "X2 - Y2";

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("\t\t"+ matriz[i][j]);
            }
            System.out.println();
        }


    }
    
}
