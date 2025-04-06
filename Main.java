import java.util.Scanner;
public class Main {

    public static class Triangulo{
        public boolean esEscaleno(int ladoA,int ladoB, int ladoC){
            return(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC);
        }


    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor de lado A");
        int ladoA = scanner.nextInt();
        System.out.println("ingrese el valor de lado B");
        int ladoB = scanner.nextInt();
        System.out.println("ingrese el valor de lado C");
        int ladoC = scanner.nextInt();

        Triangulo miTriangulo = new Triangulo();
        miTriangulo.esEscaleno(ladoA,ladoB,ladoC);
        System.out.println(miTriangulo.esEscaleno(ladoA,ladoB,ladoC));


    }
}