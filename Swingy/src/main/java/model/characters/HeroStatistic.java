package model.characters;

import java.util.Scanner;

import model.artifacts.Armor;
import model.artifacts.*;
import utils.files.Writing;
import controller.*;

import view.maps.Maps;

public class HeroStatistic extends Character
{
   Maps maps = new Maps();

   public static String heroType(int type)
   {
       if (type == 1)
       {
        return ("Knight");
       }
        else if (type == 2)
        {
            return ("BlackMagic");
        }
        else if (type == 3)
        {
            return ("Warrior");
        }
        else 
            return null;

   }

   public void Display(String name)
   {
      
        Weapon weapon = new Weapon();
        Armor armor = new Armor();
        Helmet helmet = new Helmet();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("***Choose a number for hero type***");
        System.out.println("Hero name: " + name + "\n");
        System.out.println("1. Knight");
        System.out.println("2. Blackmagic");
        System.out.println("3. Warrior");

        Scanner scan = new Scanner(System.in);
        // String lines = scan.nextLine();
        // int num = Integer.parseInt(lines);
        int num = scan.nextInt();
        String type = heroType(num);
        //Hero hero = CharaFactory.newHero(name, num);
        Hero hero = CharaFactory.createHero(name, type);
        PlayerStats.statistic(hero);
        Writing.Openfile();
        String wrt = hero.getName() + "," + hero.getType() + "," + hero.level + "," + hero.experience + "," + armor.typesofArmor(hero) + "," + weapon.typesofweapon(hero) + "," + helmet.typesofHel(hero)+ "," + hero.getAttack() + "," + hero.getDefence() + "," + hero.hp;
        Writing.writeToFile(wrt);
        Writing.closefile();

        System.out.println("Press 1: to start game");
        System.out.println("Press 2: to exit the program");


        Scanner enter = new Scanner(System.in);
        int number = enter.nextInt();

        if (number == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            maps.initMap((hero.level-1)*5+10-(hero.level%2), (hero.level-1)*5+10-(hero.level%2));
            maps.PutPlayer(hero.getName().charAt(0));

            Monster[] monsters = new Monster[8];
            monsters[0] = new Monster(50, 10, 1, "E");
            monsters[1] = new Monster(100, 40, 2, "E");
            monsters[2] = new Monster(50, 10, 1, "E");
            monsters[3] = new Monster(10, 10, 1, "E");
            monsters[4] = new Monster(10, 10, 1, "E");
            monsters[5] = new Monster(10, 5, 1, "E");
            monsters[6] = new Monster(10, 10, 1, "E");
            monsters[7] = new Monster(10, 10, 1, "E");
            maps.PutMonsters(monsters);
        while(true) 
        {
            maps.PrintMap();
            System.out.println("Enter the direction of choice");
            System.out.println("1: North ");
            System.out.println("2: South ");
            System.out.println("3: West ");
            System.out.println("4: East ");
            System.out.println("0: Exit Game");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.matches("[0-4]"))
            {
                int move = Integer.parseInt(line);
                if (move == 1)
                {
                    maps.moveup();
                }
                else if (move == 2)
                {
                    
                    maps.movedown();
                }
                else if (move == 3)
                {
                    maps.moveleft();
                }
                else if (move == 4)
                {
                    maps.moveright();  
                }
                else if (move == 0)
                {
                    System.exit(0);
                }
            }
            else
                System.out.println("Invalid input");
        }

            }
            else if (number == 2)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid number");
            }
   }

   public void StartGame(Hero hero)
   {
       System.out.print("\033[H\033[2J");
       System.out.flush();
       maps.initMap((hero.level-1)*5+10-(hero.level%2), (hero.level-1)*5+10-(hero.level%2));
       maps.PutPlayer(hero.getName().charAt(0));

       Monster[] monsters = new Monster[8];
       monsters[0] = new Monster(50, 10, 1, "E");
       monsters[1] = new Monster(100, 40, 2, "E");
       monsters[2] = new Monster(50, 10, 1, "E");
       monsters[3] = new Monster(10, 10, 1, "E");
       monsters[4] = new Monster(10, 10, 1, "E");
       monsters[5] = new Monster(10, 5, 1, "E");
       monsters[6] = new Monster(10, 10, 1, "E");
       monsters[7] = new Monster(10, 10, 1, "E");
       maps.PutMonsters(monsters);
       while(true)
       {
           maps.PrintMap();
           System.out.println("Enter the direction of choice");
           System.out.println("1: North ");
           System.out.println("2: South ");
           System.out.println("3: West ");
           System.out.println("4: East ");
           System.out.println("0: Exit Game");
           Scanner scanner = new Scanner(System.in);
           String line = scanner.nextLine();
           if (line.matches("[0-4]"))
           {
               int move = Integer.parseInt(line);
               if (move == 1)
               {
                   maps.moveup();
               }
               else if (move == 2)
               {

                   maps.movedown();
               }
               else if (move == 3)
               {
                   maps.moveleft();
               }
               else if (move == 4)
               {
                   maps.moveright();
               }
               else if (move == 0)
               {
                   System.exit(0);
               }
           }
           else
               System.out.println("Invalid input");
        }
   }
}
