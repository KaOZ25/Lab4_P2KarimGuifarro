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
public class NEV extends toyota {

    private int con_com;
    private int dur_ac;
    private int vel_max;
    private String tipo;

    public NEV(String modelo, String VIN, String carroceria, int cant_pas, int cap_mal,int con_com, int dur_ac, int vel_max, String tipo) {
        super(modelo, VIN, carroceria, cant_pas, cap_mal);
        this.con_com = con_com;
        this.dur_ac = dur_ac;
        this.vel_max = vel_max;
        this.tipo = tipo;
    }

    public int getCon_com() {
        return con_com;
    }

    public void setCon_com(int con_com) {
        this.con_com = con_com;
    }

    public int getDur_ac() {
        return dur_ac;
    }

    public void setDur_ac(int dur_ac) {
        this.dur_ac = dur_ac;
    }

    public int getVel_max() {
        return vel_max;
    }

    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NEV{" + "con_com=" + con_com + ", dur_ac=" + dur_ac + ", vel_max=" + vel_max + ", tipo=" + tipo + '}';
    }

}
