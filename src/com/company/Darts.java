package com.company;

public class Darts {
    private final int[] radiuses = {1, 5, 10};
    private final int[] bonuses = {10, 5, 1};


    private boolean isInCircle(int x, int y, int radius) {
        return x * x + y * y <= radius * radius;
    }

    public int calcBonuses(int x, int y) {
        int bonus = 0;
        for (int i = 0; i < radiuses.length; i++) {
            if (isInCircle(x, y, radiuses[i])) {
                bonus = bonuses[i];
                break;
            }
        }
        return bonus;
    }
}
