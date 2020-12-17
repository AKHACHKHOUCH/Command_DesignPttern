package com.commande;

import com.recepteur.Tv;

public class OnTv implements ICommande {
    private Tv tv;
    public OnTv(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
