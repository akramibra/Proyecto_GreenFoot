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
        super(648, 266, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Carro1 carro = new Carro1();
        addObject(carro,308,239);
        Motocicleta moto = new Motocicleta();
        addObject(moto,179,199);
        Persona persona = new Persona();
        addObject(persona,538,126);
        persona.setLocation(457,129);
        Finish finish = new Finish();
        addObject(finish,53,81);
    }
}
