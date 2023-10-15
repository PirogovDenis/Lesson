package game;

public class Enemy {
    public int health;

    Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }


}
