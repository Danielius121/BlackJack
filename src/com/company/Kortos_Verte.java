package com.company;
public enum Kortos_Verte {
    DVIAKE(2),
    TRIAKE(3),
    KETURAKE(4),
    PENKAKE(5),
    SESAKE(6),
    SEPTYNAKE(7),
    ASTUONAKE(8),
    DEVYNAKE(9),
    DESIMAKE(10),
    VALETAS(10),
    KARALIENE(10),
    KARALIUS(10),
    TUZAS(10);

    private int verte;
    Kortos_Verte(int verte)
    {
        this.verte=verte;
    }

    public int gautiVerte(){
        return verte;
    }

}
