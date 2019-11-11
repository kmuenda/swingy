package model.characters;

public class Knight extends Hero
{
   public Knight(String name)
   {
       super(name);
       this.type = "Knight";
       this.attack = 20;
       this.defence = 30;
       this.level = 1;
       this.experience = 1;
       this.hp = 50;
   }

}