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
public class textil {

    private String categoria;
    private String nomempleado;
    private int metrosinsumo1;
    private int metrosinsumo2;
    private int metrosinsumo3;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomempleado() {
        return nomempleado;
    }

    public void setNomempleado(String nomempleado) {
        this.nomempleado = nomempleado;
    }

    public int getMetrosinsumo1() {
        return metrosinsumo1;
    }

    public void setMetrosinsumo1(int metrosinsumo1) {
        this.metrosinsumo1 = metrosinsumo1;
    }

    public int getMetrosinsumo2() {
        return metrosinsumo2;
    }

    public void setMetrosinsumo2(int metrosinsumo2) {
        this.metrosinsumo2 = metrosinsumo2;
    }

    public int getMetrosinsumo3() {
        return metrosinsumo3;
    }

    public void setMetrosinsumo3(int metrosinsumo3) {
        this.metrosinsumo3 = metrosinsumo3;
    }

    public textil(String categoria, String nomempleado, int metrosinsumo1, int metrosinsumo2, int metrosinsumo3) {
        this.categoria = categoria;
        this.nomempleado = nomempleado;

        this.metrosinsumo1 = metrosinsumo1;
        this.metrosinsumo2 = metrosinsumo2;
        this.metrosinsumo3 = metrosinsumo3;
    }

    public textil() {
        this.categoria = "";
        this.nomempleado = "";
        this.metrosinsumo1 = 0;
        this.metrosinsumo2 = 0;
        this.metrosinsumo3 = 0;
    }

}
