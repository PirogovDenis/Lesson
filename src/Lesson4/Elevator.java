package Lesson4;

public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
        System.out.println("Лифт стоит на этаже: " + currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        while (currentFloor > minFloor) {
            currentFloor--;
        }
    }

    public void moveUp() {
        while (currentFloor < maxFloor) {
            currentFloor++;
        }
    }

    public int move(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            while (currentFloor != floor) {
                if (currentFloor < floor) {
                    moveUp();
                } else {
                    moveDown();
                }
                System.out.println("Текущий этаж: " + currentFloor);
            }
        } else {
            System.out.println("Ошибка: неверно указан этаж");
        }
        return floor;
    }
}
