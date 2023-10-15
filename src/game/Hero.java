package game;

public class Hero {
    private String name;
    Hero(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void attackEnemy(){
        System.out.println(getName() +"атака");
    }

}
