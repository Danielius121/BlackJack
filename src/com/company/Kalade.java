package com.company;
import java.util.ArrayList;
import java.util.Collections;


public class Kalade {

    private ArrayList<Korta> kortos;
    public Kalade(){ this.kortos = new ArrayList<Korta>(); }
    public void SukurtiKalade(){
        for(Rusys x : Rusys.values()){
            for(Kortos_Verte y : Kortos_Verte.values()){
                this.kortos.add(new Korta(x,y));
            }
        }
            Collections.shuffle(this.kortos);
        }
    public void IstryntiKorta(int i){

        this.kortos.remove(i);
    }
    public Korta paimtiKorta(int i){
        return this.kortos.get(i);
    }
    public void trauktiKorta(Kalade temp){
        this.kortos.add(temp.paimtiKorta(0));
        temp.IstryntiKorta(0);
    }
    public String toString(){
        String KortuSarasas = "";
        int i = 0;
        for(Korta x : this.kortos){
            KortuSarasas +=  "\n" + x.toString();
            i++;

        }
        return KortuSarasas;
    }
    public int KaladesDydis(){

        return this.kortos.size();
    }
    public int kortosTaskai(){
        int taskuSuma = 0;
        int tuzuKiekis = 0;
        for(Korta x : this.kortos){
            switch(x.ApskaiciuotiKortosReiksme()){
                case TUZAS: tuzuKiekis += 1; break;
                default:taskuSuma+=x.ApskaiciuotiKortosReiksme().gautiVerte();
            }

        }
        for(int i = 0; i < tuzuKiekis; i++){
            if (taskuSuma > 10){
                taskuSuma += 1;
            }
            else{
                taskuSuma += 11;
            }
        }
        return taskuSuma;

    }


}
