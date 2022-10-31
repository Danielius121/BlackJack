package com.company;

public class Korta {
    private Rusys rusys;
    private Kortos_Verte kortos_Verte;
    public Korta(Rusys rusys, Kortos_Verte verte){
        this.rusys = rusys;
        this.kortos_Verte = verte;
    }
    public String toString(){
        return this.rusys.toString() + " - " + this.kortos_Verte.toString();
    }
    public Kortos_Verte ApskaiciuotiKortosReiksme(){
        return this.kortos_Verte;
    }
}