/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pc Smart
 */
import Vista.InOut;
import java.util.ArrayList;
import Modelo.textil;

public class Procesobolso {

    InOut ob = new InOut();
    ArrayList<textil> elegante = new ArrayList<textil>();
    ArrayList<textil> viaje = new ArrayList<textil>();
    int tam = 0;
    String insumo1 = "Cremallera";
    String insumo2 = "Cuero";
    String insumo3 = "Hilo";
    int metroelegante = 3, metrohilo = 30;

    textil tx = new textil();

    public void llenar() {

        String categoria = "";
        String empleado = "";
        String elega = "";
        String viaje = "";
        String categoria1 = "Elegante";
        String categoria2 = "Viaje";

        int r = 0, op = 0, acuminsumo3 = 0, acuminsumo1 = 0, acuminsumo2 = 0, met = 0;
        tam = ob.pedirentero("¿Cuantos empleados desea registar?");
        while (tam < 0) {
            ob.mostrar("Error, el numero debe ser positivo.");
            tam = ob.pedirentero("¿Cuantos vehiculos desea registar?");
        }

        for (int i = 0; i < tam; i++) {
            empleado = ob.pedircaracter("Ingrese el nombre del empleado");
            tx.setNomempleado(empleado);

            categoria = ob.pedircaracter("\nIngrese la categoria:\nElegante. \nViaje.\nMochila.\nMorral.");

            while ((categoria.equalsIgnoreCase(categoria1) || categoria.equalsIgnoreCase(categoria2)) == false) {
                ob.mostrar("Error, digite una categoria de bolso valida");
                categoria = ob.pedircaracter("\nIngrese la categoria:\nElegante. \nViaje.\nMochila.\nMorral.");
            }
            tx.setCategoria(categoria);

            if (categoria.equalsIgnoreCase(categoria1)) {

                acuminsumo1 = 0;
                acuminsumo2 = 0;
                acuminsumo3 = 0;
                do {

                    op = ob.pedirentero("Digite 1 para agregar insumo 1, 2 para agregar insumo 2, 3 para agregar insumo 3: ");
                    switch (op) {
                        case 1: {

                            ob.mostrar("Insumo 1: " + insumo1);

                            ob.mostrar("Insumo agregado.");

                            met = ob.pedirentero("ingrese la cantidad de metros");

                            while (met < 0) {
                                ob.mostrar("error, el metraje debe ser multiplo de 3");
                                met = ob.pedirentero("ingrese la cantidad de metros");
                            }

                            ob.mostrar("Cantidad metros-insumo Cremallera " + "No. " + met + " metros");

                            acuminsumo1 += met;
                            tx.setMetrosinsumo1(acuminsumo1);

                            break;
                        }

                        case 2: {
                            ob.mostrar("insumo 2: " + insumo2);

                            ob.mostrar("Insumo agregado.");
                            met = ob.pedirentero("ingrese la cantidad de metros, tenga en cuenta que el metraje se vende en multiplos de 3.");

                            while (met % metroelegante != 0) {
                                ob.mostrar("error, el metraje debe ser multiplo de 3");
                                met = ob.pedirentero("ingrese la cantidad de metros");
                            }

                            ob.mostrar("Cantidad metros-insumo Cremallera " + "No. " + met + " metros");

                            acuminsumo2 += met;
                            tx.setMetrosinsumo2(acuminsumo2);
                            break;
                        }

                        case 3: {
                            ob.mostrar("insumo 3: " + insumo3);

                            ob.mostrar("Insumo agregado.");
                            met = ob.pedirentero("ingrese la cantidad de metros, tenga en cuenta que el metraje se vende en multiplos de 30.");

                            while (met % metrohilo != 0) {
                                ob.mostrar("Error, el metraje debe ser multiplo de 30");
                                met = ob.pedirentero("ingrese la cantidad de metros");
                            }

                            ob.mostrar("Cantidad metros-insumo Cremallera " + "No. " + met + " metros");

                            acuminsumo3 += met;
                            tx.setMetrosinsumo3(acuminsumo3);
                            break;
                        }

                    }

                    r = ob.pedirentero("Digite 1 para agregar un insumo, otro para finalizar");
                } while (r == 1);

                elegante.add(new textil(categoria, empleado, acuminsumo1, acuminsumo2, acuminsumo3));

            }

            if (categoria.equalsIgnoreCase(categoria2)) {
                this.viaje.add(new textil(categoria, empleado, acuminsumo1, acuminsumo2, acuminsumo3));

            }

        }

    }

    public void mostrarelegante() {
        int a = -1, b = 0, acum1 = 0, acum2 = 0, acum3 = 0, inver1 = 0, inver2 = 0, inver3 = 0;
        String mayempleado = "";
        for (int i = 0; i < elegante.size(); i++) {

            ob.mostrar(elegante.get(i).getNomempleado());
            ob.mostrar(elegante.get(i).getCategoria());
            ob.mostrar("metros insumo cremallera " + elegante.get(i).getMetrosinsumo1());
            ob.mostrar("metros insumo cuero " + elegante.get(i).getMetrosinsumo2());
            ob.mostrar("Metros insumo hilo " + elegante.get(i).getMetrosinsumo3());
            ob.mostrar(canbolsos(elegante.get(i).getMetrosinsumo2(), metroelegante));

            acum1 += elegante.get(i).getMetrosinsumo1();
            acum2 += elegante.get(i).getMetrosinsumo2();
            acum3 += elegante.get(i).getMetrosinsumo3();
            inver1 = acum1 * 1000;
            inver2 = acum2 * 20000;
            inver3 = acum3 * 500;

            b = bolsos(elegante.get(i).getMetrosinsumo2(), metroelegante);

            if (b > a) {
                a = b;
                mayempleado = elegante.get(i).getNomempleado();

            }

        }
        //ob.mostrar("el "+acum1);
        ob.mostrar("\nPrecios por metro y/o unidad  de los insumos:\n1.Insumo cremallera: $1000. \n2.Insumo cuero: $20000. \n3.Insumo hilo: $500.");
        ob.mostrar(mayorelegante(acum1, acum2, acum3));
        ob.mostrar(inversionelegante(inver1, inver2, inver3));
        ob.mostrar("el total de la inversion elegante  es: " + sumar(inver1, inver2, inver3));
        ob.mostrar("El costo por cada bolso es: " + bolsos(sumar(inver1, inver2, inver3), a));
        ob.mostrar("El mayor empleado que fabrico mas bolsos en la categoria elegante es: " + mayempleado + " con cantidad de " + a);

    }

    public void mostrarviaje() {
        for (int i = 0; i < viaje.size(); i++) {

            ob.mostrar(viaje.get(i).getNomempleado());
            ob.mostrar(viaje.get(i).getCategoria());
        }

    }

    public String mayorelegante(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return "El insumo " + insumo1 + " tiene un mayor consumo y es de: " + n1;
        }
        if (n2 > n1 && n2 > n3) {
            return "El insumo " + insumo2 + " tiene un mayor consumo y es de: " + n2;
        }
        if (n3 > n1 && n3 > n2) {
            return "El insumo " + insumo3 + " tiene un mayor consumo y es de: " + n3;
        }
        return null;

    }

    public String inversionelegante(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return "El insumo " + insumo1 + " requiere de mayor inversion y  es de: " + n1;
        }
        if (n2 > n1 && n2 > n3) {
            return "El insumo " + insumo2 + " requiere de mayor inversion y es de: " + n2;
        }
        if (n3 > n1 && n3 > n2) {
            return "El insumo " + insumo3 + " requiere de mayor inversion y es de: " + n3;
        }
        return null;

    }

    public int sumar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public String canbolsos(int n1, int n2) {

        return "la cantidad de bolsos a elaborar: " + n1 / n2;

    }

    public int bolsos(int n1, int n2) {

        return n1 / n2;

    }

}
