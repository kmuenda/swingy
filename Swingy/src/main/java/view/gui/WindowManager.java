package view.gui;
import model.characters.Hero;
public interface WindowManager
{
    void showSelectHero();
    void showNewHero();
    void showSelectMission(Hero hero);
}