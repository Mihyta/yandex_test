import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String A = r.readLine();
        String B = r.readLine();
        String[] lineA = A.split("");
        String[] lineB = B.split("");
        String[] lineResult = new String[lineB.length];
        String[] lineResultFinish = new String[lineB.length];

        for (int i = 0; i < lineA.length; i++) {
            for (int j = 0; j < lineB.length; j++) {
                if (lineA[j].equals(lineB[i])) {
                    lineResult[j] = "S";
                }
                if (lineA[j].equals(lineB[i]) && i == j) {
                    lineResult[j] = "P";
                }
                else if (!Objects.equals(lineA[j], lineB[i])) {
                    lineResult[j] = "I";
                }
            }
            for (int j = 0; j < lineA.length; j++) {
                if (lineResult[j].equals("P")){
                    lineResultFinish[i] = "P";
                    break;
                }
                else if (lineResult[j].equals("S")) {
                    lineResultFinish[i] = "S";
                    break;
                }
                else {
                    lineResultFinish[i] = "I";
                }
            }
        }
        Arrays.stream(lineResultFinish).forEach(System.out::print);
    }
}

