package exercitando.casting;

public class Cast {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; 

        long l1;
        int i1 = 10;
        l1 = i1;

        double d1 = 10000000000000.0000000000000000000000000000000000000000000000000000000000;


        System.out.println("b1: "+ b1);
        System.out.println("b1: "+ l1);
        b1 = (byte) d1;
        l1 = (long) d1;
        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);


        
    }
}
