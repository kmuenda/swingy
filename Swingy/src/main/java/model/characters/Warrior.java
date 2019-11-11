package model.characters;

public class Warrior extends Hero
{

   public Warrior(String name)
   {
       super(name);

       this.type  = "Warrior";
       this.attack = 20;
       this.defence = 50;
       this.level = 1;
       this.experience  = 1;
       this.hp = 50;
   }


}