package model.artifacts;

import java.util.Random;
import model.characters.Hero;

public class Armor
{
    public static String Armor[] = {"Leather armor", "Iron leather", "Cuirass", "Brigandine"};

    public String typesofArmor(Hero hero)
    {
        Random rand = new Random();
        int armortype = rand.nextInt(4);
        return Armor[armortype];
    }

}