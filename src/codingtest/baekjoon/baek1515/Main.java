package codingtest.baekjoon.baek1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cur = 0;
        int answer = 0;
        while (answer++ <= 30000) {
            String temp = String.valueOf(answer);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == s.charAt(cur))
                    cur++;
                if (cur == s.length()) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }
}
