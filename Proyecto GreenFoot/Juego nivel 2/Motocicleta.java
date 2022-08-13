import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motocicleta extends Actor
{
    /**
     * Act - do whatever the Moto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        move();
        hitPersona();
            }
    public void move()
    {
        if (Greenfoot.isKeyDown("Up"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("Right"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            turn(3);
        }
    }
    
    public void hitPersona(){
            if (isTouching(Persona.class)){
            getWorld().showText("Has perdido",100,100);
            Greenfoot.stop();
        }
    }
}