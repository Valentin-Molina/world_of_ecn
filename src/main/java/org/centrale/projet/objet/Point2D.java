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
public class Point2D {
    
    /**
     * The coordinate of the point along the first axis.
     */
    private int x;
    
    /**
     * The coordinate of the point along the second axis.
     */
    private int y;
    
    
    /**
     * Default constructor for Point2D. Default coordinates are (0,0).
     */
    public Point2D()
    {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor for Point2D. 
     * @param x The coordinate of the point along the first axis.
     * @param y The coordinate of the point along the second axis. 
     */
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Copy constructor for Point2D.
     * @param p : the point to copy.
     */
    public Point2D(Point2D p)
    {
        this.x = p.getX();
        this.y = p.getY();
    }
    
    /**
     * @return the x
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * @return the y
     */
    public int getY()
    {
        return y;
    }
    
    /**
     * @param x the x to set
     */
    public void setX(int x)
    {
        this.x = x ;
    }
    
    /**
     * @param y the y to set
     */
    public void setY(int y)
    {
        this.y = y ;
    }
            
    
    /**
     * Change the coordinates of point to a specific (x,y).
     * @param x : the coordinate of the point along the first axis.
     * @param y : the coordinate of the point along the second axis.
     */
    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * Move the coordinates of the point of a specific amount in each direction.
     * @param dx : shift along the first axis. 
     * @param dy : shift along the second axis.  
     */
    public void translate(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }
    
    /**
     * distance from another Point2D
     * @param p
     * @return 
     */
    public double distance(Point2D p){
        double dist;
        dist = Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
        return dist;
    }
    
    
    /**
     * Print the coordinates of the point on the terminal.
     */
    public void affiche()
    {
        System.out.println("[" + this.x + ";" + this.y + "]");
    }
    
    
    /**
     * Compute the geometrical barycenter of the point to an other point.
     * One can use associativity property of the barycenter to compute the 
     * barycenter of multiple point with a loop.
     * @param other The point with which the barycenter is computed.
     * @return The barycenter of the current Point2D and other.
     */
    public Point2D barycentre(Point2D other)
    {
        Point2D out = new Point2D();
        
        out.setX((other.getX() + this.x)/2);
        out.setY((other.getY() + this.y)/2);
        
        return out;
    }
}
