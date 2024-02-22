package Minggu2;

public class DragonMain25 {
    public static void main(String[] args) {
        Dragon25 dg1 = new Dragon25();
        dg1.x = 3;
        dg1.y = 5;
        dg1.width = 10;
        dg1.height = 10;

        dg1.moveRight();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.moveRight();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.moveRight();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.moveLeft();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.moveLeft();
        dg1.detectCollision(dg1.x, dg1.y);
        for (int i = 1; i <= 10;) {
            dg1.moveUp();
            i++;
        }
        dg1.detectCollision(dg1.x, dg1.y);
    }
}
