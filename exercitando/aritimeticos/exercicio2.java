package exercitando.aritimeticos;

public class exercicio2 {

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
 
    }
    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30; 

        int a =  i++ + --j + k; 

        System.out.println("i++ + --j + k:" + a );
        System.out.println("i: " + i);


    }
    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long I = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:"+d);

        i += 5;
        j -= 4;
        d /= 2.7d;
        I += 3;
        k %= 2;

        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("d:"+d);
        System.out.println("I:"+I);
        System.out.println("k:"+k);



    }
    private static void prePos(){
        int k = 14;

        int i =++k;
        int j =k--;
        int x = k;

        System.out.println("i:"+ i);
        System.out.println("j:"+ j);
        System.out.println("x:"+ x);

    }
    private static void aritmetico(){

        int a = 10;
        int b = 20;
        int c = 30;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = b+c;
        int r4 = a/c;
        int r5 = c*b;
        int r6 = c%a;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);



    }




    
}
