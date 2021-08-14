/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class BEV extends toyota {

    private int autonomia;
    private int cant_bat;
    private int aceleracion;
    private int carg;

    public BEV(String modelo, String VIN, String carroceria, int cant_pas, int cap_mal,int autonomia, int cant_bat, int aceleracion, int carg) {
        super(modelo, VIN, carroceria, cant_pas, cap_mal);
        this.autonomia = autonomia;
        this.cant_bat = cant_bat;
        this.aceleracion = aceleracion;
        this.carg = carg;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getCant_bat() {
        return cant_bat;
    }

    public void setCant_bat(int cant_bat) {
        this.cant_bat = cant_bat;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getCarg() {
        return carg;
    }

    public void setCarg(int carg) {
        this.carg = carg;
    }

    @Override
    public String toString() {
        return "BEV{" + "autonomia=" + autonomia + ", cant_bat=" + cant_bat + ", aceleracion=" + aceleracion + ", carg=" + carg + '}';
    }
}
