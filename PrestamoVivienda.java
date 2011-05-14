/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TrabajoGrupo1;

/**
 *
 * @author Administrador
 */
public class PrestamoVivienda extends Prestamo {

    boolean usaBanprovi;


    public PrestamoVivienda(double prestamo, int cuota, boolean usa){
        super(prestamo, cuota);
        usaBanprovi=usa;
    }

    @Override
    public double getTasaInteres() {
        if (usaBanprovi==true){
            return tasainteres=0.10;
        }
        else {
            return tasainteres = 0.20;
        }

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
        return saldopendiente+57000;
    }



}
