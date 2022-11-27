public class Elevator {
    private final int minFloor;
    private final int maxFloor;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    private void moveDown() {
        currentFloor -= 1;
    }

    private void moveUp() {
        currentFloor += 1;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("���������� ����� �� ���������� :((");
            return;
        }

        if (floor > currentFloor) {
            while (currentFloor < floor) {
                moveUp();
                System.out.println(currentFloor + " ����");
            }
        } else if (floor < currentFloor) {
            while (currentFloor > floor) {
                moveDown();
                System.out.println(currentFloor + " ����");
            }
        } else {
            System.out.println("�� ��� �� " + floor + " �����!");
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
