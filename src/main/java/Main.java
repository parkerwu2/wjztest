import java.util.*;

class Pair {
    public int number;
    public int times;
    public Pair(int number, int times) {
        this.number = number;
        this.times = times;
    }
}

public class Main  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int cols = in.nextInt();


            if (cols == 0) {
                break;
            } else {
                List<Pair> l = new ArrayList<Pair>();
                int sumtimes = 0;
                int number = in.nextInt();
                int times = in.nextInt();
                sumtimes += times;





                while (number != 0 && times != 0) {
                    l.add(new Pair(number, times));
                    number = in.nextInt();
                    times = in.nextInt();
                    sumtimes += times;
                }
                int rows = sumtimes / cols;
                int[][] matrix = new int[rows][cols];
                int[][] result = new int[rows][cols];
                for (Pair p : l) {

                }
            }
        }

    }
}
