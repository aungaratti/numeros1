import java.util.Scanner;
import java.lang.Math;
public class numeros{
    public static void main(String args[]){
        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\fInforme o primeiro número:");
        numero1 = teclado.nextInt();
        System.out.println("\fInforme o segundo número:");
        numero2 = teclado.nextInt();
        System.out.println("A soma dos dois números é:"+(numero1+numero2));
        System.out.println("A diferença entre os dois números é:"+(numero1-numero2));
        System.out.println("A média entre os dois números é:"+(numero1+numero2)/2);
        System.out.println("O valor absoluto da distancia entre os dois números é:"+Math.abs(numero2-numero1));
        System.out.println("O menor entre os dois números é:"+Math.min(numero1,numero2));
        System.out.println("O maior entre os dois números é:"+Math.max(numero1,numero2));
    }
}
