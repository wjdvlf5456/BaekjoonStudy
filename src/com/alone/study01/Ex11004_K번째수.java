import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Ex11004_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> aList = new ArrayList<Integer>();

        // 2번째 줄
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            aList.add(Integer.parseInt(st.nextToken()));
        };

        Collections.sort(aList);

        int answer = aList.get(k-1);

        System.out.println(answer);

        br.close();
    }
}