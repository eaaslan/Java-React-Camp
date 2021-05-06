package Day04.HW3.DigitalGameDistributionSystem.Concrete;

import Day04.HW3.DigitalGameDistributionSystem.Abstract.GameService;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game[] games) {
        for (Game game : games)
            System.out.println("Game " + game.getName() + " added");

    }

    @Override
    public void update(Game[] games) {
        for (Game game : games)
            System.out.println("Game " + game.getName() + " updated");
    }

    @Override
    public void delete(Game[] games) {
        for (Game game : games)
            System.out.println("Game " + game.getName() + " deleted");
    }

}
