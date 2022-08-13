import greenfoot.*;

public class Carro extends Actor{

    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        moveAround();
        hitMoto();
        finish();
            }
    
    public void moveAround()
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
            Moto moto = new Moto();
            if (intersects(moto)){
            getWorld().showText("Has perdido",100,100);
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
