package org.winiol;

public class TriangleCheck {
    public boolean isTriangle(int a, int b, int c) {

        if (a + b >= c) {
            if (a + c >= b) {
                if (b + c >= a) {
                    return true;
                }
            }
        }
        return false;
    }
}
