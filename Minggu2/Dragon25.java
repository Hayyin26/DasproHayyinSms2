package Minggu2;

public class Dragon25 {
    int x, y, width, height;

    void moveLeft() {
        x -= 1;
    }

    void moveRight() {
        x += 1;
    }

    void moveUp() {
        y += 1;
    }

    void moveDown() {
        y -= 1;
    }

    void detectCollision(int x, int y) {
        if ((x < 0 || x >= width) || (y < 0 || y >= height)) {
            System.out.println("GAME OVER!!");

        }
    }
}