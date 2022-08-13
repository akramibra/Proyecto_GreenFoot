import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Calle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calle extends World
{

    /**
     * Constructor for objects of class Calle.
     * 
     */
    public Calle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(761, 228, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Carro carro1 = new Carro();
        addObject(carro1,107,58);
        Moto moto = new Moto();
        addObject(moto,108,155);
        Finish finish = new Finish();
        addObject(finish,758,62);
        Finish finish2 = new Finish();
        addObject(finish2,756,165);
    }
}
