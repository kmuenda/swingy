package model.artifacts;

import java.util.Random;
import model.characters.Hero;


public class Weapon
{
    public static String Weapon[] = {"Long bow", "Short bow", "Sword", "Glass sword"};

    public String typesofweapon(Hero hero)
    {
        Random rand = new Random();
        int randweapon = rand.nextInt(4);
        return Weapon[randweapon];
    }
}