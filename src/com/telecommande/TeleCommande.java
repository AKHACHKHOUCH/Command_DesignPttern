package com.telecommande;

import com.commande.ICommande;

import java.util.HashMap;
import java.util.Map;

public class TeleCommande {
    Map<String, ICommande> commandes = new HashMap<String, ICommande>();
    private ICommande cmdUndo;

    public ICommande addNewCommande(String item, ICommande cmd){

        return commandes.put(item, cmd);
    }
    public void execute(String item){
        ICommande cmd = commandes.get(item);
        if(cmd != null){
            cmd.execute();
            cmdUndo = cmd;
        }
    }
    public void undo(){
        cmdUndo.undo();
    }

}
