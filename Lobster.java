import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lobster moves randomly looking for Crab to eat
 * 
 * Jordan Frick
 * 4
 */
public class Lobster extends Animal
{
    /**
     * Lobster moves randomly looking for Crab to eat
     * 
     */
    public void act()
    {
        crabEatCrabs();
    }
    /**
     * Lobster turns randomly
     */
    public void turnAtEdge()
    {
        int random= Greenfoot.getRandomNumber(90);
        if(atWorldEdge())turn(random);
    }
    /**
     * Lobster moves randomly 
     */
        
    public void actorTurnRandomly()
    {
        int random= Greenfoot.getRandomNumber(90);
        if (random<20)
            turn(20);
        if (random>80)
            turn(-20);
    }
    /**
     * Lobster looks to eat crab
     */
    public void crabEatCrabs()
    {
         turnAtEdge();
            actorTurnRandomly();
            move(4);
       if(canSee(Crab.class)== true)
        {
        eat(Crab.class);
        Greenfoot.stop();
        Greenfoot.playSound("game-over.wav");
    }
    }
    
}
