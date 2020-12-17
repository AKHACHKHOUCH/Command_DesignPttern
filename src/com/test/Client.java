package com.test;

import com.commande.*;
import com.recepteur.Light;
import com.recepteur.Radio;
import com.recepteur.Tv;
import com.telecommande.TeleCommande;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Client {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Tv tv = new Tv();
        Light light = new Light();
        ICommande onRadio = new OnRadio(radio);
        ICommande onTv = new OnTv(tv);
        ICommande onLight = new OnLight(light);
        TeleCommande teleCommande = new TeleCommande();
        teleCommande.addNewCommande("onradio", onRadio);
        teleCommande.addNewCommande("ontv", onTv);
        teleCommande.addNewCommande("onlight", onLight);
        teleCommande.execute("ontv");
        teleCommande.execute("onradio");
        teleCommande.execute("onlight");
        teleCommande.undo();
    }
}
