package fr.supercanard;

import fr.supercanard.comportementDesCanardsInterfaces.ComportementCancan;
import fr.supercanard.comportementDesCanardsInterfaces.ComportementVol;

public abstract class Canard {

    /*
    Déclare deux variables de référence pour les types des interfaces comportementales.
    Toutes les sous-classes de fr.supercanard.Canard (dans le même ackae) en héritent
     */

    ComportementVol comportementVol;

    ComportementCancan comportementCancan;

    public Canard() {

    }

    public abstract void afficher();

    // Délègue à la classe comportementale.
    public void effectuerVol() {
        comportementVol.voler();
    }

    public void effectuerCancan() {
        comportementCancan.cancaner();
    }

    public void nager(){
        System.out.println("Tous les canards flottent, même les leurres  !");
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }
}
