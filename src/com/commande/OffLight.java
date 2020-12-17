package com.commande;

import com.recepteur.Light;

public class OffLight implements ICommande {
    private Light light;

    public OffLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
    light.off();
    }

    @Override
    public void undo() {
        light.on();

    }
}
