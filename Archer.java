/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Valentin Molina valentin@molina.pro
 * @author Noé Masson
 */
public class Archer extends Personnage {

    /**
     * The number of arrows that remain to the archer.
     */
    private int nbFleches;
    
    
    /**
     * @return the nbFleches
     */
    public int getNbFleches() {
        return nbFleches;
    }

    
    /**
     * @param nbFleches the nbFleches to set
     */
    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }
    
    
    /**
     * Archer constructor which specify all the attributes.
     * @param nom
     * @param ptV
     * @param ptM
     * @param pA
     * @param pP
     * @param pM
     * @param rM
     * @param dA
     * @param dM
     * @param distMax
     * @param pos
     * @param nbF 
     */
    public Archer(String nom, int ptV, int ptM, int pA, int pP, int pM, int rM, 
            int dA, int dM, int distMax, Point2D pos, int nbF)
    {
        super(nom, ptV, ptM, pA, pP, pM, rM, dA, dM, distMax, pos);
        nbFleches = nbF;
    }
    
    
    /**
     * Archer copy constructor.
     * @param perso : Archer to copy.
     */
    public Archer(Archer perso)
    {
        super(perso);
        nbFleches = perso.getNbFleches();
    }
    
    
    /**
     * Default constructor for Archer. 
     * Each variables is initiated with default values (0 for int, null for 
     * String, (0,0) for Point2D, ...)
     */
    public Archer()
    {
        super();
    }
    
    
    /**
     * Print the values of each attributes into the terminal.
     */
    public void affiche()
    {
        super.affiche();
        System.out.println("Ce personnage est un archer qui possède " + 
                nbFleches+ " flèches.");
    }
}
