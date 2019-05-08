package com.mashibing.snake;

import java.awt.*;

public class Node {
    int row, col;


    Node prev, next;

    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void paint(Graphics g) {
        int x = Yard.x + col*Yard.NodeSize;
        int y = Yard.y + row * Yard.NodeSize;

        Color c = g.getColor();
        g.setColor(Color.BLACK);
        g.fillRect(x, y, Yard.NodeSize, Yard.NodeSize);

        g.setColor(c);
    }
}
