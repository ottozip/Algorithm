import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        sb.append(A + B).append("\n");
        sb.append(A - B).append("\n");
        sb.append(A * B).append("\n");
        sb.append(A / B).append("\n");
        sb.append(A % B);

        System.out.println(sb);
    }
}