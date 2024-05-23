import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFunction {
    @Test
    public void testMax1() {
        String path = "src\\tests\\test1.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 4);
    }

    @Test
    public void testMax2() {
        String path = "src\\tests\\test2.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 1);
    }

    @Test
    public void testMax3() {
        String path = "src\\tests\\test3.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 44);
    }

    @Test
    public void testMax4() {
        String path = "src\\tests\\test4.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 100);
    }

    @Test
    public void testMax5() {
        String path = "src\\tests\\test5.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 100);
    }

    @Test
    public void testMax6() {
        String path = "src\\tests\\test6.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 100);
    }

    @Test
    public void testMax7() {
        String path = "src\\tests\\test7.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long max = Main._max(arr);
        Assert.assertEquals(max, 155);
    }

    @Test
    public void testMin1() {
        String path = "src\\tests\\test1.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long min = Main._min(arr);
        Assert.assertEquals(min, 1);
    }

    @Test
    public void testMin2() {
        String path = "src\\tests\\test2.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long min = Main._min(arr);
        Assert.assertEquals(min, 1);
    }

    @Test
    public void testMin3() {
        String path = "src\\tests\\test3.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long min = Main._min(arr);
        Assert.assertEquals(min, -12);
    }

    @Test
    public void testMult1() {
        String path = "src\\tests\\test1.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long mult = Main._mult(arr);
        Assert.assertEquals(mult, 24);
    }

    @Test
    public void testMult2() {
        String path = "src\\tests\\test2.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long mult = Main._mult(arr);
        Assert.assertEquals(mult, 1);
    }

    @Test
    public void testMult3() {
        String path = "src\\tests\\test3.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long mult = Main._mult(arr);
        Assert.assertEquals(mult, 0);
    }

    @Test
    public void testSum1() {
        String path = "src\\tests\\test1.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long sum = Main._sum(arr);
        Assert.assertEquals(sum, 10);
    }

    @Test
    public void testSum2() {
        String path = "src\\tests\\test2.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long sum = Main._sum(arr);
        Assert.assertEquals(sum, 8);
    }

    @Test
    public void testSum3() {
        String path = "src\\tests\\test3.txt";
        ArrayList<Long> arr = Main.readFile(path);
        long sum = Main._sum(arr);
        Assert.assertEquals(sum, 44);
    }
}
