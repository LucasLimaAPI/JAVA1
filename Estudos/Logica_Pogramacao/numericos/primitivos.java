// TIPOS PRIMITIVOS
package Estudos.Logica_Pogramacao.numericos;

public class primitivos {

    public static void main(String[] args) {
        //8 BITS
        byte minimoByte = -128;
        byte maximoByte = 127;

        //16 Bits
        short minimoShort = -32768;
        short maximoShort = 32755;

        //32 bits
        int maximoInt = 215487963;

        // 64 bits
        long minimoLong = -987874567777777777L; 
        long maximoLong = 987874567777777377L; 

        float variavelFloat = 5.6f;
        double variavelDouble = 3.64;

        char caracter = 'c';

        System.out.println(minimoByte+"\n"+maximoByte+"\n"+minimoShort+"\n"+maximoShort+"\n"+maximoInt+
                          "\n"+ minimoLong+maximoLong+"\n"+variavelFloat+"\n"+variavelDouble+"\n"+caracter);

    }
    
}
