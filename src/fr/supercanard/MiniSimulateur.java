package fr.supercanard;

import fr.supercanard.comportementsDesCanardsImpl.comportementVol.PropulsionAReaction;

public class MiniSimulateur {
    public static void main(String[] args) {
        Canard colvert = new Colvert();

        /*
        Cette ligne appelle la méthode héritée effectuerCancan() de Colvert,
        qui délègue alors à ComportementCancan de l'objet (autrement dit appelle cancaner()
        sur la référence héritée comportementCancan du canard)
         */
        colvert.effectuerCancan();


        colvert.effectuerVol();

        Canard proto = new PrototypeCanard();

        /*
        Le premier appel de effectuerVol() délègue à l'objet comportementVol défini
        dans le constructeur de PrototypeCanard, qui est une instance de NePasVoler
         */
        proto.effectuerVol();

        /*
        Ceci invoque la méthode set héritée du prototype, et ...voilà !
        Le prototype est soudain doté d'une fonctionnalité de vol... à réaction
         */
        proto.setComportementVol(new PropulsionAReaction());

        /*
        Le canard a changé de comportement de vol dynamiquement !
        Ce serait IMPOSSIBLE si l'implémentation résidait dans la classe Canard
         */
        proto.effectuerVol();
    }
}
