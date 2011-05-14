/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TrabajoGrupo1;

/**
 *
 * @author Administrador
 */
public class PrestamoAuto extends Prestamo {
String serieauto;
Cuota Cuotaseguro[];

public PrestamoAuto(double monto, int cuota,String serie){
    super(monto,cuota);
    serieauto=serie;
    Cuotaseguro=new Cuota[cuotas.length];
}

    @Override
    public double getTasaInteres() {
        return 0.25;
    }

    @Override
    public double saldoPendiente() {
       for(int i=0;i<cuotas.length;i++){
            if(cuotas[i].pagada==true){
                saldopendiente+=0;
            }else{
                saldopendiente+=cuotas[i].pagomensual;
            }
        }
       for(int e=0;e<Cuotaseguro.length;e++){
           if(Cuotaseguro[e].pagada==false){
               saldopendiente+=Cuotaseguro[e].pagomensual;
           }
 else{
               saldopendiente+=0;
 }
       }
       return saldopendiente;
    }

}
