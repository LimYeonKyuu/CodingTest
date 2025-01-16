package codingtest.baekjoon.baek9046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if ('a' <= input.charAt(j) && input.charAt(j) <= 'z') {
                    count[input.charAt(j) - 'a']++;
                }
            }
            int max = 0;
            int maxCount = 0;
            for (int j = 1; j < 26; j++) {
                if (count[j] > count[max]) {
                    maxCount = 0;
                    max = j;
                } else if (count[j] == count[max]) {
                    maxCount++;
                }
            }
            if (maxCount > 0) {
                System.out.println("?");
            } else {
                System.out.println((char) ('a' + max));
            }
        }

    }
}