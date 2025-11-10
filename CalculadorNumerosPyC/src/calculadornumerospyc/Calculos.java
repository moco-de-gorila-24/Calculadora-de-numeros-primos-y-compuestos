package calculadornumerospyc;

import java.util.InputMismatchException;
import java.util.LinkedList;

public class Calculos {
    LinkedList<Long> numeros = new LinkedList<Long>();

    public Calculos(){

    }


    public boolean esCompuesto(long num){
        if(num % 2 == 0){
            System.out.println("El nunero:" + num + " es compuesto");
            numerosDivisibles(num);
            return true;
        }
        else{
            esPrimo(num);
        }

        return false;
    }

    public boolean numerosDivisibles(long num){
        try{
            long  residuo;

            if(num <= 0){
                System.out.println("Ingrese un numero positivo");
                return false;
            }

            for(long divisor = 1; divisor <= num; divisor++){
                if(num % divisor == 0){

                    residuo = num % divisor;
                    System.out.println("El numero: " + num + " es divisible entre " + divisor + " Y el residuo es: " + residuo);
                }
            }

        }
        catch(NumberFormatException ex){
            System.out.println("Dato no valido" + ex);
        }
        catch (InputMismatchException ex){
            System.out.println("Debe ingresar un numero" + ex);
        }
        return true;
    }


    public boolean esPrimo(long num){
        if(num <= 1){
            return false;
        }

        long raiz = (long) Math.sqrt(num);

        for(long divisor = 2; divisor <= raiz; divisor ++){
            if(num % divisor == 0){
                System.out.println("El numero: " + num + " es impar y es divisible entre: " + divisor);
                return false;
            }

        }
        System.out.println("El numero: " + num + "es primo");
        return true;
    }
}
