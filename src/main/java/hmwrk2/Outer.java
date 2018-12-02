package hmwrk2;

public class Outer {

    Outer() {
    }

    public void doMath() {
        new Outer() {
        };
    }

    int a = 10;

    class Local {
    }

    public static void main(String[] args) {
        new Outer() {
        };
        class LocalMethod {
        }
    }
}
