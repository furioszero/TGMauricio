/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TrabajoGrupo1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class JavaBank {
    public static Prestamo arr[];


    public int contador=0;

static    Scanner lea= new Scanner(System.in);

public static void main(String args[]){
        System.out.println("longitud de prestamo: ");
        int x=lea.nextInt();
         arr=new Prestamo[x];

         System.out.println("ingrese tipo de prestamo: ");
         char tipo=lea.next().charAt(0);

         AdicionCliente(tipo);
    }
private static boolean AdicionCliente(char tipo) {
    for(int a=0;a<arr.length;a++){
        if(arr[a]==null){
            System.out.println("ingrese prestamo: ");
           double prestamo=lea.nextDouble();
           System.out.println("ingrese cuota:");
           int cuota=lea.nextInt();


           if(tipo=='v'){

           System.out.println("utiliza banprovi:");
           char ban=lea.next().charAt(0);

           boolean usa;

           if(ban=='s'){
        usa=true;
           }
 else{
               usa=false;
               }

            arr[a]=new PrestamoVivienda(prestamo,cuota,usa);
            return true;
       }
 else if(tipo=='a'){

           System.out.println("ingrese serie:");
           String serie=lea.next();

           boolean usa;


            arr[a]=new PrestamoAuto(prestamo,cuota,serie);
            return true;
    }

    }
        else{
               return false;
 }
    }
}
