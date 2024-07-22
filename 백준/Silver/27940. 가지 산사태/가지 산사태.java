import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        read();
        int m = read(), k = read();

        int sum = 0;
        for (int i = 0; i < m; i++) {
            read();
            sum += read();

            if (sum > k) {
                sb.append(i + 1).append(" 1");
                break;
            }
        }

        bw.write(sb.length() > 0 ? sb.toString() : "-1");
        bw.flush();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }

}