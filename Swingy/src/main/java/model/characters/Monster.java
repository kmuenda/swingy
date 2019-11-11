package model.characters;
import view.maps.Maps;
public class Monster extends Character
{
   private int attack = 20;
   private boolean alive = true;
   private int movement;
   public  String name;
   Maps map = new Maps();


   public Monster(int energy, int attack, int movement, String ininame)
   {
       this.attack = attack;
       this.Name = ininame;
       name = ininame;
       this.energy = energy;
       this.movement = movement;
    }
    public int getAttack()
    {
        return attack;
    }
    
    public int getMovement()
    {
        return movement;
    }
    public int getEnergy()
    {
        return energy;
    }

   public void setEnergy(double decrease_energy)
   {
       int decenergy = (int)decrease_energy;
       energy = energy - decenergy;
       if (energy < 0)
       {
           alive = false;
       }
   }

   public boolean getAlive()
   {
       return alive;
   }
}
