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
public class toyota {

    private String modelo;
    private String VIN;
    private String carroceria;
    private int cant_pas;
    private int cap_mal;

    public toyota() {
    }

    public toyota(String modelo, String VIN, String carroceria, int cant_pas, int cap_mal) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.cant_pas = cant_pas;
        this.cap_mal = cap_mal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCant_pas() {
        return cant_pas;
    }

    public void setCant_pas(int cant_pas) {
        this.cant_pas = cant_pas;
    }

    public int getCap_mal() {
        return cap_mal;
    }

    public void setCap_mal(int cap_mal) {
        this.cap_mal = cap_mal;
    }

    @Override
    public String toString() {
        return "toyota{" + "modelo=" + modelo + ", VIN=" + VIN + ", carroceria=" + carroceria + ", cant_pas=" + cant_pas + ", cap_mal=" + cap_mal + '}';
    }

}
