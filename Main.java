import java.util.Scanner;
public class Main {

    public static class Triangulo{
        public boolean esEscaleno(int ladoA,int ladoB, int ladoC){
            return(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC);
        }
        public boolean esIsosceles(int ladoA,int ladoB, int ladoC){
            return(ladoA == ladoB && ladoC != ladoA || ladoB==ladoC && ladoA != ladoB || ladoA == ladoC && ladoB != ladoA);
        }
        public boolean esEquilatero(int ladoA,int ladoB,int ladoC){
            return(ladoA == ladoB && ladoA==ladoC && ladoB==ladoC);
        }
        public boolean esRectangulo(int ladoA,int ladoB, int ladoC){
            return ((ladoA*ladoA) + (ladoB*ladoB) == ladoC*ladoC ||(ladoA*ladoA) + (ladoC*ladoC) == ladoB*ladoB || (ladoC*ladoC) + (ladoB*ladoB) == ladoA*ladoA);
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
        if (miTriangulo.esEscaleno(ladoA,ladoB,ladoC)){
            System.out.println("Es escaleno");
        }else {
            System.out.println("No es escaleno");
        }

        miTriangulo.esIsosceles(ladoA,ladoB,ladoC);
        if (miTriangulo.esIsosceles(ladoA,ladoB,ladoC)){
            System.out.println("Es isosceles");
        }else{
            System.out.println("No es isosceles");
        }

        miTriangulo.esEquilatero(ladoA,ladoB,ladoC);
        if (miTriangulo.esEquilatero(ladoA,ladoB,ladoC)){
            System.out.println("Es equilatero");
        }else{
            System.out.println("No es equilatero");
        }

        miTriangulo.esRectangulo(ladoA,ladoB,ladoC);
        if (miTriangulo.esRectangulo(ladoA,ladoB,ladoC)){
            System.out.println("Es rectangulo");
        }else {
            System.out.println("No es rectangulo");
        }



    }
}