package fr.supercanard.comportementsDesCanardsImpl.comportementCancan;

import fr.supercanard.comportementDesCanardsInterfaces.ComportementCancan;

public class CanardMuet implements ComportementCancan {
    @Override
    public void cancaner() {
        System.out.println("Silence");
    }
}
