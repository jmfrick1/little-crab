import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    private GreenfootImage crab;
    private GreenfootImage crab2;
    int Worm=0;
    
    private int count = 0;
    
    /**
     * Crab constructor
     * 
     */
    public Crab()
    {
        crab=new GreenfootImage("crab.png");

        crab2=new GreenfootImage("crab2.png");
        
       
        
        

    }
    
    
    
    
    /**
     * Crab is controled across the screen looking for Worm.
     */
    public void act()
    {
        lookForWorm();
        checkKeypress();
        seeWin();
        moveForward();

    }

    /**
     * If Worm is visable by Turtle it will be eaten.
     */

    public void lookForWorm()
   {
       
        if(canSee(Worm.class)== true)
        {
            eat(Worm.class);
            Worm++;
        }
    }
    /**
     * Key "d" is right
     * Key "a" is left
     */
    public void checkKeypress()
    {
        if(Greenfoot.isKeyDown("d")==true)
            turn(18);
        if(Greenfoot.isKeyDown("a")==true)
            turn(-18);
    }
    /**
     * If all Worms are gone game is over/stops
     */
    public void seeWin()
    {
        if(Worm== 8)
          {  
         Greenfoot.stop();
            Greenfoot.playSound("fanfare.wav");
        }
    }
    
    
      /**
     * MoveForward
     * key "w"= forward
     */
    public void moveForward()
    
    {
        if(Greenfoot.isKeyDown("w"))
        move(3);
        
        if(count%6==0){

            if(getImage()==crab)
                setImage(crab2);
            else
                setImage(crab);

        }
        count++;
    }
    
}

