package multiserviciossalinos;
import java.util.Scanner;

public class PROBLEMA1 {
    public static void ejecutable1(){
        Scanner sc =new Scanner(System.in);
        boolean value=true;
        while(value){
            System.out.println("¡MENU DE OPCIONES!");
            System.out.println("1.problema1");
            System.out.println("2.problema2");
            System.out.println("3.problema3");
            System.out.println("4.problema4");
            System.out.println("presiona cualquier numero si quieres salir del programa: ");
            System.out.println("elige el problema que quieres visualizar: ");
        int opcion=sc.nextInt();
        switch(opcion){
            case 1: System.out.println("¡PROBLEMA a !");
            break;
            case 2: System.out.println("¡PROBLEMA b !");
            break;
            case 3: System.out.println("¡PROBLEMA c !");
            break;
            case 4: System.out.println("¡PROBLEMA d !");
            break;
            default:{
                value=false;
                System.out.println("la opcion no existe");
            }
            }
        }    
    }
}
