
import java.util.Scanner;

public class Ejecutor_Terrreno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*Terreno t1 = new Terreno(40,10,21);
        Terreno t2 = new Terreno(21,12,21);
        Terreno t3 = new Terreno(10,10,21);
        Terreno arrayTerreno[]= new Terreno[5];
        arrayTerreno [0] = t1;
        arrayTerreno [1] = t2;
        arrayTerreno [2] = t3;
        for (int i = 0; i < arrayTerreno.length; i++) {
            arrayTerreno[i].calcularArea();
            arrayTerreno[i].calcularValorTerreno();
            System.out.println(arrayTerreno[i]);
        } 
        for(Terreno terreno : arrayTerreno){
            terreno.calcularArea();
            terreno.calcularValorTerreno();
            System.out.println(terreno);
        }
        Terreno arrayTerrenos[]= {new Terreno(10,3,2), new Terreno(15,4,2), new Terreno(20,8,2)};
        for(Terreno ter : arrayTerrenos){
            ter.calcularArea();
            ter.calcularValorTerreno();
            System.out.println(ter);
        }*/
        Terreno arrayTerrenos[] = new Terreno[2];
        int i = 0;
        String opcion;
        while(true){
            System.out.println("Ingrese el ancho, largo y valor metro cuadrado: ");
            arrayTerrenos[i] = new Terreno(teclado.nextDouble(), teclado.nextDouble(),teclado.nextDouble());
            i++;
            System.out.println("Desea segir ingresando mas terrenos [S] o [N]");
            opcion = teclado.next();
            if (opcion.equals("N") || (i>=arrayTerrenos.length)) {
                break;
            }
        }
        for(Terreno ter : arrayTerrenos){
            ter.calcularArea();
            ter.calcularValorTerreno();
            System.out.println(ter);
        }
        
        
        
        
        
    }
    
}
