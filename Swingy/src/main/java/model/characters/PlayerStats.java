package model.characters;

import model.artifacts.Armor;
import model.artifacts.Helmet;
import model.artifacts.Weapon;

public class PlayerStats
{

   public static void statistic(Hero hero)
   {
       Weapon weapon = new Weapon();
       Armor armor = new Armor();
       Helmet helmet = new Helmet();
       System.out.println("You are: " + hero.getName());
       System.out.println("You fall under this class: " + hero.getType());
       System.out.println("You level is: " + hero.level);
       System.out.println("Experience is: " + hero.experience);
       System.out.println("Weapon type: " + weapon.typesofweapon(hero));
       System.out.println("Amor type: " + armor.typesofArmor(hero));
       System.out.println("Helmet type: " + helmet.typesofHel(hero));
       System.out.println("attack: " + hero.getAttack());
       System.out.println("defence: " + hero.getDefence());
       System.out.println("Hit points: " + hero.hp);
       System.out.println("*****************");
   }
}
