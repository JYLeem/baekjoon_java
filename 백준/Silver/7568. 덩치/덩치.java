import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [][]arr = new int[N][2];

        for (int i = 0; i < N; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < N; ++j){
            int rank = 1;

            for (int k = 0; k < N; ++k){
                if (j == k) continue;
                if (arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]) rank++;
            }
            sb.append(rank).append(" ");

        }
        System.out.println(sb);
    }
}
