package ejercicio.seis;

import java.util.Random;

public class EjercicioSeis {
    public static int ArrayRandom[] = new int[20];
    public static Random aleatorio = new Random();
    
    public static void main(String[] args) {
        //SeparaParesImpares();
        
        for (int i=0; i<ArrayRandom.length; i++) {
            ArrayRandom[i] = aleatorio.nextInt(100 - 0 + 1) + 0;
        }
        
        System.out.println("Números random: ");
        for (int i=0; i<20; i++) {
            System.out.print(ArrayRandom[i]+", ");
        }
        System.out.println();
        
        SeparaParesImpares();
    }
           
    public static void SeparaParesImpares() {
        System.out.println("Los números pares son: ");
        for (int i=0; i<20; i++) {
            if (ArrayRandom[i]%2==0) {
                System.out.print(ArrayRandom[i]+", ");
            }
        }
        System.out.println("");
        System.out.println("Los números impares son: ");
        for (int i=0; i<20; i++) {
            if (ArrayRandom[i]%2!=0) {
                System.out.print(ArrayRandom[i]+", ");
            }
        }
    }
    
}
