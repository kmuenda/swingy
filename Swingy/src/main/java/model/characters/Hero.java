package model.characters;
import view.maps.Maps;

public abstract class  Hero extends Character
{
   Maps maps = new Maps();

   public Hero(String name)
   {
       this.Name = name;
   }

   public void attack(Hero attacker, Hero defender) 
   {
       int damage = Math.max(0, attacker.getAttack() - defender.getDefence());
       System.out.println(attacker.getName() + "is attacking" + damage);
       System.out.println(defender.getName() + "defending ");
       System.out.println(health);

       defender.setHealth(health);
   }

   public void defence(int damage)
   {
       int thedamage = damage - this.defence;
       if (thedamage <= 0)
           thedamage = 1;

       this.hp -= thedamage;
       System.out.println();
   }

   public void fight(Hero hero, Monster monster) {
       while (hero.getAlive() && monster.getAlive()) {
           if (hero.getAlive()) {
               System.out.println("You win");
           } else if (monster.getAlive()) {
               System.out.println("you loose");
           } else
               System.out.println(" its a Draw");
       }
   }

   public int getLevel() 
   {
       return this.level;
   }

   public int getExperience() 
   {
       return this.experience;
   }

   public String getName()
   {
       return this.Name;
   }

   public void setLevel(int level) 
   {
       this.level = level;
   }

}