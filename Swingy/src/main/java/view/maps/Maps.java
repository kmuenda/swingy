package view.maps;

import java.util.Arrays;
import model.characters.Monster;
public class Maps
{
    public static char[][] board;
    public static int dimentions;
    private static int playerx;
    private static int playery;
    private static char player;

    public void initMap(int x, int y)
    {
        char[][] pb = new char[y][x];
        for (char[] row : pb)
        {
            Arrays.fill(row, '+');
        }
        board = pb;
        dimentions = board.length;
    }

    public void PutMonsters(Monster[] monsters)
    {
        int randx, randy;

        for (int i = 0; i < monsters.length; i++)
        {
            while (true)
            {
                randx = (int) (Math.random() * dimentions);
                randy = (int) (Math.random() * dimentions);
                if (board[randy][randx] == '+')
                    break;
            }
            board[randy][randx] = monsters[i].name.charAt(0);
        }
    }

    public void PrintMap()
    {
        int k = 1;
        while (k <= 30) { System.out.print('-');k++; }
        System.out.println();

        for (int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++){System.out.print("|" + board[i][j] + "|");}
            System.out.println();
        }
        k = 1;
        while (k <= 30){System.out.print('-'); k++;}
        System.out.println();
    }

    public void PutPlayer(char iniplayer)
    {
        player = iniplayer;
        playerx = dimentions / 2;
        playery = dimentions / 2;
        board[playery][playerx] = player;
    }

    public void moveup()
    {
        if (playery - 1 >= 0)
        {
            board[playery][playerx] = '+';
            if (playery >= 0)
                playery = playery - 1;
            board[playery][playerx] = player;
        }
    }

    public void movedown()
    {
        if (playery + 1 <= dimentions - 1)
        {
            board[playery][playerx] = '+';
            if (playery <= dimentions)
                playery = playery + 1;
            board[playery][playerx] = player;
            
        }

    }

    public void moveleft()
    {
        if (playerx - 1 >= 0)
        {
            board[playery][playerx] = '+';
           if (playerx >= 0)
                playerx = playerx - 1;
            board[playery][playerx] = player;
        }
    }

    public void moveright()
    {
        if (playerx + 1 <= dimentions - 1)
        {
            board[playery][playerx] = '+';
            if (playerx <= dimentions)
                playerx = playerx + 1;
            board[playery][playerx] = player;
        }
    }
}
