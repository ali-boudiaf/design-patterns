package fr.supercanard.comportementsDesCanardsImpl.comportementVol;

import fr.supercanard.comportementDesCanardsInterfaces.ComportementVol;

public class PropulsionAReaction implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je vole avec un réacteur !");
    }
}
