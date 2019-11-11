package model.artifacts;
import model.characters.Hero;

import java.util.Random;

public class Helmet
{
    public static String Helmet[] = {"Normar", "Kettle helm", "Barbuta", "Great helm"};

    public String typesofHel(Hero hero)
    {
        Random rand = new Random();
        int helm = rand.nextInt(4);
        return Helmet[helm];
    }
}
