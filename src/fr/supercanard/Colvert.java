package fr.supercanard;

import fr.supercanard.comportementsDesCanardsImpl.comportementCancan.Cancan;
import fr.supercanard.comportementsDesCanardsImpl.comportementVol.VolerAvecDesAiles;

public class Colvert extends Canard {
    public Colvert() {

        /*
        Puisque Colvert utilise la classe Cancan pour cancaner, quand effectuerCancan() est appelée,
        la responsabilité du cancanement est déléguée à l'objet Cancan et nous obtenons un vrai cancan.

        Et il utilise VolerAvecDesAiles comme type de ComportementVol.
         */
        comportementCancan = new Cancan();
        comportementVol = new VolerAvecDesAiles();
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un vrai colvert");
    }
}
