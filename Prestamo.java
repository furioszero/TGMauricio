/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TrabajoGrupo1;

/**
 *
 * @author Administrador
 */
public abstract class Prestamo {
    protected double montoprestamo;
    protected String nombre;
    protected Cuota cuotas[];
 protected double tasainteres=0;

    protected double saldopendiente=0;
    public Prestamo(double monto, int cuota){
        montoprestamo=monto;
        cuotas= new Cuota[cuota];

    }

    public abstract double  getTasaInteres();

    public abstract double  saldoPendiente() ;

}
