package Practica2_Tema4;
import java.util.Scanner;

public class PROYECTO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu edad para decirte si eres mayor de edad o no.");
        int edad= sc.nextInt();
        if(edad>=18){
            System.out.println("¡eres mayor de edad!");
        }else{
            System.out.println("¡eres menor de edad!");
        }
    }

}
