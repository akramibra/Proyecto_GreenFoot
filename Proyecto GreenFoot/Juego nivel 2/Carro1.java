import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro1 extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        hitMoto();
        hitPersona();
        mover();
        finish();
    }
    public void mover()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(3);
        }
    }
        public void hitMoto(){
            if (isTouching(Motocicleta.class)){
            getWorld().showText("Has perdido",350,140);
            Greenfoot.stop();
            
            }
        }
        public void hitPersona(){
            if (isTouching(Persona.class)){
            getWorld().showText("Has perdido",350,140);
            Greenfoot.stop();
        }
    }
        public void finish(){
            if (isTouching(Finish.class)){
            getWorld().showText("El carro ha ganado",350,140);
            Greenfoot.stop();
        }
    }
}
