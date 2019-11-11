package controller;

import model.characters.*;
import model.characters.Knight;
import model.characters.BlackMagic;
import model.characters.Warrior;

  public class CharaFactory
  {
        // public static Hero newHero(String name, int type)
        // {
        //   if (type == 1)
        //   {
        //     return new Knight(name);
        //   }

        //   else if (type == 2)
        //   {
        //     return new BlackMagic(name);
        //   }

        //   else if (type == 3)
        //   {
        //     return new Warrior(name);
        //   }
        //   else
        //   {
        //     return null;
        //   }
        // }

        public static Hero createHero(String name, String type)
        {
          if (type.equalsIgnoreCase("Knight"))
          {
            return new Knight(name);
          }
          else if (type.equalsIgnoreCase("BlackMagic"))
          {
            return new BlackMagic(name);
          }
          else if (type.equalsIgnoreCase("Warrior"))
          {
            return new Warrior(name);
          }
          else
          {
            return null;
          }
        }
  }
