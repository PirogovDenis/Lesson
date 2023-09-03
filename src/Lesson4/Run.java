package Lesson4;

class Run {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1, 9);
        elevator.moveDown();
        elevator.moveUp();
        elevator.move(9);
    }
}