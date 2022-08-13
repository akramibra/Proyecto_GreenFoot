import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto extends Actor
{
    /**
     * Act - do whatever the Moto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("Right"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("Up"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            turn(3);
        }
    }
}