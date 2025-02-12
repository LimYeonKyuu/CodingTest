package codingtest.baekjoon.baek2460;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cur = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cur -= Integer.parseInt(st.nextToken());
            cur += Integer.parseInt(st.nextToken());
            if(cur>result){
                result=cur;
            }
        }
        System.out.println(result);
    }
}
