import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner  scanner = new Scanner(System.in);




         try {
             int a = 10;
             int b = Integer.parseInt(scanner.nextLine());
             System.out.println("Division :" + (a/b));

         } catch (ArithmeticException e){
             System.out.println("No se puede divir entre cero");

         }catch (NumberFormatException nfe){
             System.out.println("NO CAPTURASTE EL DATO CORRECTAMENTE");
         }
         finally {
             System.out.println("Siempre se ejecuta");
         }

        System.out.println("Fin del programa !!!!");
    }
}