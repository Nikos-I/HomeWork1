// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)




import java.math.BigInteger;
import java.util.Scanner;
import com.google.common.math.BigIntegerMath;

public class nw1 {
    public static void main(String[] args) {
        int numVal = 0;
        while (numVal<=0) {
            System.out.print( "Введите целое число: ");    
            Scanner in = new Scanner(System.in);
            try {
                numVal = in.nextInt();
            } catch (Exception e) {
                numVal = 0;
            }
            if (numVal<=0) System.out.println( "Неверное значение, введите заново");    
        } 

        int numTriangular = numVal*(numVal+1)/2;
        BigInteger bigIntFactorial = BigInteger.ONE;
        bigIntFactorial = BigIntegerMath.factorial(numVal);
        System.out.printf("Треугольное число для %d: %d \n", numVal, numTriangular);    
        System.out.printf("Факториал для %d: %s \n", numVal, bigIntFactorial.toString().replaceAll("0+$", ""));    
    }
}    
