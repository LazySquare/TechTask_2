import org.junit.Test;

import java.util.ArrayList;

public class TestLoadFunction {
    @Test(timeout = 10000)
    public void loadMax() {
        for (int i = 0; i < 100000; i++) {
            String path = "src\\tests\\test1.txt";
            ArrayList<Long> arr = Main.readFile(path);
            long max = Main._max(arr);
        }
    }

    @Test(timeout = 10000)
    public void loadMin() {
        for (int i = 0; i < 100000; i++) {
            String path = "src\\tests\\test1.txt";
            ArrayList<Long> arr = Main.readFile(path);
            long min = Main._min(arr);
        }
    }

    @Test(timeout = 10000)
    public void loadSum() {
        for (int i = 0; i < 100000; i++) {
            String path = "src\\tests\\test1.txt";
            ArrayList<Long> arr = Main.readFile(path);
            long sum = Main._sum(arr);
        }
    }

    @Test(timeout = 10000)
    public void loadMult() {
        for (int i = 0; i < 100000; i++) {
            String path = "src\\tests\\test1.txt";
            ArrayList<Long> arr = Main.readFile(path);
            long mult = Main._mult(arr);
        }
    }
}
