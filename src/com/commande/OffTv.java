package com.commande;

import com.recepteur.Radio;
import com.recepteur.Tv;

public class OffTv implements ICommande {
    private Tv tv;

    public OffTv(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
    tv.off();
    }

    @Override
    public void undo() {
        tv.on();

    }
}
