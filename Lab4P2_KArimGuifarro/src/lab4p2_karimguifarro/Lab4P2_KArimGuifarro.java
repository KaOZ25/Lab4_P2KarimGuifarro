package lab4p2_karimguifarro;

import java.util.*;

public class Lab4P2_KArimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<String> vin = new ArrayList();
    public static ArrayList<toyota> car = new ArrayList();

    public static void main(String[] args) {
        char k = 'k';
        while (k == 'k') {
            System.out.println("******MENU*******\n"
                    + "1)Crear\n"
                    + "2)Leer\n"
                    + "3)Editar\n"
                    + "4)ELiminar\n"
                    + "5)Calculo\n"
                    + "6)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("******MENU*******\n"
                            + "1)NEV\n"
                            + "2)HEV\n"
                            + "3)PHEV\n"
                            + "4)BEV\n");
                    int op1 = KaOz.nextInt();
                    switch (op1) {
                        case 1: {
                            String modelo, VIN = "", carroceria = "";
                            int cant_pas, cap_mal, con_com, dur_ac, vel_max;
                            String tipo = "";
                            System.out.println("Ingrese el modelo:");
                            KaOz.nextLine();
                            modelo = KaOz.next();
                            System.out.println("Ingrese el VIN:");
                            VI(VIN);
                            vin.add(VIN);
                            System.out.println("Ingrese el tipo de carroceria:");
                            KaOz.nextLine();
                            System.out.println("******MENU*******\n"
                                    + "1)Sedan\n"
                                    + "2)Notchback\n"
                                    + "3)SUV\n"
                                    + "4)MPV\n"
                                    + "5)Roadster\n");
                            int tip = KaOz.nextInt();
                            switch (tip) {
                                case 1: {
                                    carroceria = "Sedan";
                                }
                                break;
                                case 2: {
                                    carroceria = "Notchback";
                                }
                                break;
                                case 3: {
                                    carroceria = "SUV";
                                }
                                break;
                                case 4: {
                                    carroceria = "MPV";
                                }
                                break;
                                case 5: {
                                    carroceria = "Roadster";
                                }
                                break;
                            }
                            System.out.println("Ingrese la cantidad de pasajeros:");
                            cant_pas = KaOz.nextInt();
                            System.out.println("Capacidad Maletero:");
                            cap_mal = KaOz.nextInt();
                            System.out.println("Ingrese consumo combustible:");
                            con_com = KaOz.nextInt();
                            System.out.println("Ingrese la duracion del aceite:");
                            dur_ac = KaOz.nextInt();
                            System.out.println("Ingrese la velocidad maxima:");
                            vel_max = KaOz.nextInt();
                            System.out.println("****TIPO*****"
                                    + "1)Automatico\n"
                                    + "2)Mecanico\n");
                            int tip2 = KaOz.nextInt();
                            switch (tip2) {
                                case 1: {
                                    tipo = "Automatico";
                                }
                                break;
                                case 2: {
                                    tipo = "Mecanico";
                                }
                                break;
                            }
                            car.add(new NEV(modelo, VIN, carroceria, cant_pas, cap_mal, con_com, dur_ac, vel_max, tipo));
                        }
                        break;
                        case 2: {
                            String modelo, VIN = "", carroceria = "";
                            int cant_pas, cap_mal, cap_bat, cap_mot;
                            System.out.println("Ingrese el modelo:");
                            KaOz.nextLine();
                            modelo = KaOz.next();
                            System.out.println("Ingrese el VIN:");
                            VI(VIN);
                            vin.add(VIN);
                            System.out.println("Ingrese el tipo de carroceria:");
                            KaOz.nextLine();
                            System.out.println("******MENU*******\n"
                                    + "1)Sedan\n"
                                    + "2)Notchback\n"
                                    + "3)SUV\n"
                                    + "4)MPV\n"
                                    + "5)Roadster\n");
                            int tip = KaOz.nextInt();
                            switch (tip) {
                                case 1: {
                                    carroceria = "Sedan";
                                }
                                break;
                                case 2: {
                                    carroceria = "Notchback";
                                }
                                break;
                                case 3: {
                                    carroceria = "SUV";
                                }
                                break;
                                case 4: {
                                    carroceria = "MPV";
                                }
                                break;
                                case 5: {
                                    carroceria = "Roadster";
                                }
                                break;
                            }
                            System.out.println("Ingrese la cantidad de pasajeros:");
                            cant_pas = KaOz.nextInt();
                            System.out.println("Capacidad Maletero:");
                            cap_mal = KaOz.nextInt();
                            System.out.println("Ingrese la capacidad de la bateria:");
                            cap_bat = KaOz.nextInt();
                            System.out.println("Ingrese la capacidad del motro electrico:");
                            cap_mot = KaOz.nextInt();
                            car.add(new HEV(modelo, VIN, carroceria, cant_pas, cap_mal, cap_bat, cap_mot));
                        }
                        break;
                        case 3: {
                            String modelo, VIN = "", carroceria = "";
                            int cant_pas, cap_mal, cant_km, cant_motel, cap_remol;
                            Boolean cxc = true;
                            System.out.println("Ingrese el modelo:");
                            KaOz.nextLine();
                            modelo = KaOz.next();
                            System.out.println("Ingrese el VIN:");
                            VI(VIN);
                            vin.add(VIN);
                            System.out.println("Ingrese el tipo de carroceria:");
                            KaOz.nextLine();
                            System.out.println("******MENU*******\n"
                                    + "1)Sedan\n"
                                    + "2)Notchback\n"
                                    + "3)SUV\n"
                                    + "4)MPV\n"
                                    + "5)Roadster\n");
                            int tip = KaOz.nextInt();
                            switch (tip) {
                                case 1: {
                                    carroceria = "Sedan";
                                }
                                break;
                                case 2: {
                                    carroceria = "Notchback";
                                }
                                break;
                                case 3: {
                                    carroceria = "SUV";
                                }
                                break;
                                case 4: {
                                    carroceria = "MPV";
                                }
                                break;
                                case 5: {
                                    carroceria = "Roadster";
                                }
                                break;
                            }
                            System.out.println("Ingrese la cantidad de pasajeros:");
                            cant_pas = KaOz.nextInt();
                            System.out.println("Capacidad Maletero:");
                            cap_mal = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de kilometros en modo electrico:");
                            cant_km = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de motores electrico:");
                            cant_motel = KaOz.nextInt();
                            System.out.println("Ingrese la capacidad de remolque:");
                            cap_remol = KaOz.nextInt();
                            System.out.println("*****4x4*****"
                                    + "1)Si\n"
                                    + "2)no\n");
                            int tip2 = KaOz.nextInt();
                            switch (tip2) {
                                case 1: {
                                    cxc = true;
                                }
                                break;
                                case 2: {
                                    cxc = false;
                                }
                                break;
                            }
                            car.add(new PHEV(modelo, VIN, carroceria, cant_pas, cap_mal, cant_km, cant_motel, cap_remol, cxc));
                        }
                        break;
                        case 4: {
                            String modelo, VIN = "", carroceria = "";
                            int cant_pas, cap_mal, autonomia, cant_bat, aceleracion, carg;
                            System.out.println("Ingrese el modelo:");
                            KaOz.nextLine();
                            modelo = KaOz.next();
                            System.out.println("Ingrese el VIN:");
                            VI(VIN);
                            vin.add(VIN);
                            System.out.println("Ingrese el tipo de carroceria:");
                            KaOz.nextLine();
                            System.out.println("******MENU*******\n"
                                    + "1)Sedan\n"
                                    + "2)Notchback\n"
                                    + "3)SUV\n"
                                    + "4)MPV\n"
                                    + "5)Roadster\n");
                            int tip = KaOz.nextInt();
                            switch (tip) {
                                case 1: {
                                    carroceria = "Sedan";
                                }
                                break;
                                case 2: {
                                    carroceria = "Notchback";
                                }
                                break;
                                case 3: {
                                    carroceria = "SUV";
                                }
                                break;
                                case 4: {
                                    carroceria = "MPV";
                                }
                                break;
                                case 5: {
                                    carroceria = "Roadster";
                                }
                                break;
                            }
                            System.out.println("Ingrese la cantidad de pasajeros:");
                            cant_pas = KaOz.nextInt();
                            System.out.println("Capacidad Maletero:");
                            cap_mal = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de kilometros que puede recorrer el auto:");
                            autonomia = KaOz.nextInt();
                            System.out.println("Ingrese la cantidad de baterias que almacenan:");
                            cant_bat = KaOz.nextInt();
                            System.out.println("Ingrese el tiempo de aceleracion:");
                            aceleracion = KaOz.nextInt();
                            System.out.println("Ingrese el tiempo que dura la bateria:");
                            carg = KaOz.nextInt();
                            car.add(new BEV(modelo, VIN, carroceria, cant_pas, cap_mal, autonomia, cant_bat, aceleracion, carg));
                        }
                    }
                }
                case 2: {
                    leer();
                }
                break;
                case 3: {
                    int mod = KaOz.nextInt();
                    if (mod < 0 || mod > car.size()) {
                        System.out.println("No existe este PYME");
                        leer();
                        System.out.println("Igrese de nuevo el valor:");
                        mod = KaOz.nextInt();
                    }
                    if (car.get(mod).getClass()== NEV.class) {
                        System.out.println("******MENU*******\n"
                                + "1) Modelo\n"
                                + "2) VIN\n"
                                + "3) Carroceria\n"
                                + "4) Cantidad de pasajeros\n"
                                + "5) capacidad del maletero\n"
                                + "6) Consumo de Combustible\n"
                                + "7) Duracion del aceite\n"
                                + "8) Velocidad Maxima\n"
                                + "9) Tipo de Cambio\n");
                        int tip=KaOz.nextInt();
                        switch (tip){
                            case 1:{
                                System.out.println("Ingrese el modelo:");
                            KaOz.nextLine();
                            String modelo = KaOz.next();
                            car.get(mod).setModelo(modelo);
                            }
                            break;
                            case 2:{
                            String VIN="";
                            System.out.println("Ingrese el VIN:");
                            VI(VIN);
                            vin.add(VIN);
                            }
                            break;
                            case 3:{
                                String carroceria="";
                                System.out.println("******MENU*******\n"
                                    + "1)Sedan\n"
                                    + "2)Notchback\n"
                                    + "3)SUV\n"
                                    + "4)MPV\n"
                                    + "5)Roadster\n");
                            int tip2 = KaOz.nextInt();
                            switch (tip) {
                                case 1: {
                                    carroceria = "Sedan";
                                }
                                break;
                                case 2: {
                                    carroceria = "Notchback";
                                }
                                break;
                                case 3: {
                                    carroceria = "SUV";
                                }
                                break;
                                case 4: {
                                    carroceria = "MPV";
                                }
                                break;
                                case 5: {
                                    carroceria = "Roadster";
                                }
                                break;
                            }
                            car.get(mod).setCarroceria(carroceria);
                            }
                            break;
                            case 4:{
                                System.out.println("Ingrese la cantidad de pasajeros:");
                           int cant_pas = KaOz.nextInt();
                           car.get(mod).setCant_pas(cant_pas);
                            }
                            break;
                            case 5:{
                                 System.out.println("Capacidad Maletero:");
                            int cap_mal = KaOz.nextInt();
                            car.get(mod).setCap_mal(cap_mal);
                            }
                            break;
                            case 6:{
                                 System.out.println("Ingrese consumo combustible:");
                            int con_com = KaOz.nextInt();
                            }
                        }
                    }
                }
                break;
                case 4: {
                    int mod = KaOz.nextInt();
                    if (mod < 0 || mod > car.size()) {
                        System.out.println("No existe este PYME");
                        leer();
                        System.out.println("Igrese de nuevo el valor:");
                        mod = KaOz.nextInt();
                    }
                    car.remove(mod);
                }
                break;
                case 5:{
                    
                }
                break;
                case 6:{
                    k='j';
                }
            }
        }
    }

    public static String VI(String VIN) {
        if (VIN.isEmpty()) {
            int dig;
            for (int i = 0; i < 7; i++) {
                dig = 0 + r.nextInt(9);
                VIN += String.valueOf(dig);
            }
            String d;
            for (int i = 0; i < vin.size(); i++) {
                if (vin.get(i).equals(VIN)) {
                    VIN = " ";
                } else {
                    i = vin.size();
                }
            }
        }
        return VIN;
    }

    public static void leer() {
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i).toString());
        }
    }
}
