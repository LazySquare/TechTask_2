import java.io.*;
import java.util.ArrayList;

public class Main {
    public static long _min(ArrayList<Long> arr) {
        Long curMin = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < curMin) curMin = arr.get(i);
        }
        return curMin;
    }

    public static long _max(ArrayList<Long> arr) {
        Long curMax = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > curMax) curMax = arr.get(i);
        }
        return curMax;
    }

    public static long _sum(ArrayList<Long> arr) {
        Long s = 0L;
        for (Long x : arr) {
            s = Math.addExact(s, x);

        }
        return s;
    }

    public static long _mult(ArrayList<Long> arr) {
        Long s = 1L;
        for (Long x : arr) {
            s = Math.multiplyExact(s, x);
        }
        return s;
    }

    public static ArrayList<Long> readFile(String path) {
        ArrayList<Long> arr = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {

            String s = br.readLine();
            String[] ls = s.split(" ");
            for (String num : ls) {
                arr.add(Long.parseLong(num));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return arr;
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("TestFunction");
        org.junit.runner.JUnitCore.main("TestLoadFunction");
    }
}