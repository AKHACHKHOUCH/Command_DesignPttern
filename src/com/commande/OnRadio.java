package com.commande;

import com.recepteur.Device;
import com.recepteur.Radio;

public class OnRadio implements ICommande {
    private Device radio;
    public OnRadio(Radio radio) {
    this.radio = radio;
    }
    @Override
    public void execute() {
        radio.on();
    }

    @Override
    public void undo() {
        radio.off();
    }
}
