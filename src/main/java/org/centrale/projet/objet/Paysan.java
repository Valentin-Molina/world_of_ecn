/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author Valentin Molina valentin@molina.pro
 * @author Noé Masson
 */
public class Paysan extends Personnage {
    
    /**
     * Constructor which specify all attributes
     * @param nom Name of the character.
     * @param ptV Number of health point of the character
     * @param ptM Number of mana point of the character.
     * @param pA Percentage corresponding to the success of an attack.
     * @param pP Percentage corresponding to the success of a parade
     * @param pM Percentage corresponding to the success of a magical attack.
     * @param rM Percentage corresponding to the resistance to magical attack.
     * @param dA The amount of damage that inflict the character.
     * @param dM The amount of magical damage that inflict the character.
     * @param distMax The range at which the character can access.
     * @param pos The position of the character on the map.
     * @param ptPar The amount of damage that the character can counter.
     */
    public Paysan(String nom, int ptV, int ptM, int pA, int pP, int pM, int rM,
            int dA, int dM, int distMax, Point2D pos, int ptPar)
    {
        super(nom, ptV, ptM, pA, pP, pM, rM, dA, dM, distMax, pos, ptPar);
    }
    
    /**
     * Constructor from another Paysan
     * @param perso 
     */
    public Paysan(Paysan perso)
    {
        super(perso);
    }
    
    /**
     * Constructor without any parameter
     */
    public Paysan()
    {
        super();
        this.setNom("Paysan");
    }
    
    
    /**
     * Constructor used to load a Paysan with data from a save file.
     * @param data A line of data coming from a save file.
     * @throws org.centrale.projet.objet.WrongSaveFileFormatException
     */
    public Paysan(String data) throws WrongSaveFileFormatException
    {
        super(data);
    }
    
    /**
     * 
     * @return string corresponding to the caracteristics of the Paysan
     * 
     */
    @Override
    public String getTexteSauvegarde(){
        return("Paysan "+getNom()+" "+getPtVie()+" "+getPtMana()+" "+getPourcentageAtt()+" "
                +getPourcentagePar()+" "+getPourcentageMag()+" "
                +getPourcentageResistMag()+" "+getDegAtt()+" "+getDegMag()+" "+getDistAttMax()
                +" "+getPtPar()+" "+getPos().getX()+" "+getPos().getY());
        
        
   
    }
    
    
    /**
     * Fighting method for the Paysan.
     * @param opponent The opponent that the Warrior try to hit.
     */
    @Override
    public void combattre(Creature opponent)
    {
        System.out.println("Aaaaaaah!");
        System.out.println("The Paysan "+this.getNom()+" doesn't know how to fight.");
    }
}
