package com.huaze.shen;

import java.util.*;

/**
 * @author Huaze Shen
 * @date 2020-03-27
 */
public class RobertMoveRange {
    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int movingCount(int m, int n, int k) {
        int count = 0;
        Queue<Point> queue = new LinkedList<>();
        int[][] visited = new int[m][n];
        queue.offer(new Point(0, 0));
        count += 1;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point == null) {
                break;
            }
            for (Point neighbor: getNeighbors(point)) {
                if (isValid(neighbor, m, n, k, visited)) {
                    queue.offer(neighbor);
                    visited[neighbor.x][neighbor.y] = 1;
                    count += 1;
                }
            }
        }
        return count;
    }

    private List<Point> getNeighbors(Point point) {
        List<Point> neighbors = new ArrayList<>();
        int x = point.x;
        int y = point.y;
        neighbors.add(new Point(x + 1, y));
        neighbors.add(new Point(x, y + 1));
        return neighbors;
    }

    private boolean isValid(Point point, int m, int n, int k, int[][] visited) {
        int x = point.x;
        int y = point.y;
        if (x < 0 || x >= m || y < 0 || y >= n) {
            return false;
        }
        if (visited[x][y] == 1) {
            return false;
        }
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        while (y > 0) {
            sum += y % 10;
            y /= 10;
        }
        return sum <= k;
    }

    public static void main(String[] args) {
        System.out.println(new RobertMoveRange().movingCount(3, 2, 17));
    }
}
