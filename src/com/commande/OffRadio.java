package com.commande;

import com.recepteur.Radio;

public class OffRadio implements ICommande {
    private Radio radio;

    public OffRadio(Radio radio){
        this.radio = radio;
    }
    @Override
    public void execute() {
    radio.off();
    }

    @Override
    public void undo() {
        radio.on();

    }
}
