package model.characters;

public class BlackMagic extends Hero
{
   public BlackMagic(String name)
   {
       super(name);
       this.type = "BlackMagic";
       this.attack = 20;
       this.defence = 30;
       this.level = 1;
       this.experience = 1;
       this.hp = 50;
   }
}