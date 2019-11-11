package model.characters;
import java.util.Scanner;
import java.util.*;
import controller.*;

import utils.files.Writing;

public class ExistingHero extends Character
{

    HeroStatistic lol = new HeroStatistic();
    Hero hero;
     public void Herochoice()
     {
       Writing.Openfile();
       List<String[]> list = Writing.readFile();
       int index = 1;

       for (String[] s : list)
       {
           if (s != null && s.length > 0)
           {
               System.out.println(index + ". " + s[0] + s[1]);
               index++;
           }
           else
            System.out.println("File is empty");
           
       }
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       
       num--;
       String[] tempArray = list.get(num);
       hero = CharaFactory.createHero(tempArray[0], tempArray[1]);
       Writing.closefile();

       System.out.println("Press 1 to start game");
       System.out.println("Press 2 to exit game");
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       if (number == 1)
       {
            System.out.println("**************WELCOME****");
            lol.StartGame(hero);
       }

       else if (number == 2)
       {
           System.exit(0);
       }
       else
           System.out.println("Invalid input");
   }


}