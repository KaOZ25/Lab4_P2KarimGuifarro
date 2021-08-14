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
public class HEV extends toyota {

    private int cap_bat;
    private int cap_mot;

    public HEV(String modelo, String VIN, String carroceria, int cant_pas, int cap_mal,int cap_bat, int cap_mot) {
        super(modelo, VIN, carroceria, cant_pas, cap_mal);
        this.cap_bat = cap_bat;
        this.cap_mot = cap_mot;
    }

    public int getCap_bat() {
        return cap_bat;
    }

    public void setCap_bat(int cap_bat) {
        this.cap_bat = cap_bat;
    }

    public int getCap_mot() {
        return cap_mot;
    }

    public void setCap_mot(int cap_mot) {
        this.cap_mot = cap_mot;
    }

    @Override
    public String toString() {
        return "HEV{" + "cap_bat=" + cap_bat + ", cap_mot=" + cap_mot + '}';
    }

}
