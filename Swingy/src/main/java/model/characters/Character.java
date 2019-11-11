package model.characters;
 import javax.validation.constraints.NotNull;
 import javax.validation.constraints.Digits;
 import javax.validation.constraints.Size;

public   class Character
{
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")
            @NotNull
            protected String Name;
            protected String type;
            protected int attack;
            protected int defence;
            protected int health;
            protected int hp;
            protected int movement;
            protected char nameChar;
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")
            protected int level;
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")
            protected int experience;
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")
            protected int xposition = 0;
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")
            protected int yposition = 0;
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")
            protected int energy = 100;
            @Digits(integer = 5, fraction = 1, message = "Number cannot be above 10")
            @Size(min = 1, max = 5, message = "Enter number greater than 0")

            public void setName(String name)
            {
                this.Name = name;
            }

            public void setType(String type)
            {
                this.type = type;
            }

            public void setAttack(int attack)
            {
                this.attack = attack;
            }

            public void setDefence(int defence)
            {
                this.defence = defence;
            }

            public void setHp(int hp)
            {
                this.hp = hp;
            }

            public void setMovement(int movement)
            {
                this.movement = movement;
            }

            public boolean getAlive()
            {
                return health > 0;
            }

            public String getType()
            {
                return type;
            }

            public int getAttack()
            {
                return attack;
            }

            public int getDefence()
            {
                return defence;
            }

            public int getHp()
            {
                return hp;
            }

            public int getMovement()
            {
                return movement;
            }

            public void setHealth(int health)
            {
                health = this.health;
            }

   public int getHealth()
   {
       return (this.health);
   }

   public int getX()
   {
       return this.xposition;
   }

   public int getY()
   {
       return this.yposition;
   }

}
