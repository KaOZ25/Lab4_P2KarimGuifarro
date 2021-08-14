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
public class PHEV extends toyota {

    private int cant_km;
    private int cant_motel;
    private int cap_remol;
    private boolean cxc;

    public PHEV(String modelo, String VIN, String carroceria, int cant_pas, int cap_mal,int cant_km, int cant_motel, int cap_remol,boolean cxc) {
        super(modelo, VIN, carroceria, cant_pas, cap_mal);
        this.cant_km = cant_km;
        this.cant_motel = cant_motel;
        this.cap_remol = cap_remol;
        this.cxc = cxc;
    }

    public int getCant_km() {
        return cant_km;
    }

    public void setCant_km(int cant_km) {
        this.cant_km = cant_km;
    }

    public int getCant_motel() {
        return cant_motel;
    }

    public void setCant_motel(int cant_motel) {
        this.cant_motel = cant_motel;
    }

    public int getCap_remol() {
        return cap_remol;
    }

    public void setCap_remol(int cap_remol) {
        this.cap_remol = cap_remol;
    }

    public boolean getCxc() {
        return cxc;
    }

    public void setCxc(boolean cxc) {
        this.cxc = cxc;
    }

    @Override
    public String toString() {
        return "PHEV{" + "cant_km=" + cant_km + ", cant_motel=" + cant_motel + ", cap_remol=" + cap_remol + ", cxc=" + cxc + '}';
    }

}
