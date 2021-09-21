package fr.supercanard.comportementsDesCanardsImpl.comportementVol;

import fr.supercanard.comportementDesCanardsInterfaces.ComportementVol;

public class NePasVoler implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je ne sais pas voler");
    }
}
