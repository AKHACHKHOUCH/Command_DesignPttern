package com.commande;

import com.recepteur.Light;
import com.recepteur.Tv;

public class OnLight implements ICommande {
    private Light light;

    public OnLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
    light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
