package com;
import java.util.Scanner;

import model.characters.ExistingHero;
import model.characters.HeroStatistic;
import view.gui.*;

public class Main
{
    public static void main(String[] args)
    {
        SelectHero heros = new SelectHero();
        ExistingHero hell = new ExistingHero();
        HeroStatistic display = new HeroStatistic();
        
		if ("console".equals(args[0].toLowerCase())) 
		{
            System.out.println("***********Main menu****************");
            System.out.println("**Press 1 Create a new hero**");
            System.out.println("**Press 2 Select existing hero**");
            System.out.println("**Press 3 for GUI program");
            System.out.println("**Press 4 to Exit the program**");
            System.out.println("Please choose a number of which program you want to run...");

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if (line.matches("[0-5]")) 
                {
                    int num = Integer.parseInt(line);
                    switch (num)
                    {
                        case 1:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Please enter your hero name");

                            Scanner enter = new Scanner(System.in);
                            while (enter.hasNextLine())
                            {
                                String name = enter.nextLine();
                                if (name.length() > 0)
                                {
                                    display.Display(name);
                                }
                                else
                                {
                                    System.out.println("Error: Invalid input.");
                                }
                            }
                            enter.close();
                            break;
                        case 2:
                            hell.Herochoice();
                            break;
                        case 3:
                            heros.CreateHeros();
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Error: Invalid input.");
                    }
                } else
                    System.out.println("Error: Invalid input.");

            }

		}
        if ("gui".equals(args[0].toLowerCase())) 
        {
            System.out.println("GUI");
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SwingyJF().setVisible(true);
                }
            });
		}
	}
}
