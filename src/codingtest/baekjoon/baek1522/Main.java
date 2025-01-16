package codingtest.baekjoon.baek1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Queue<Character> q = new LinkedList<>();
        char c;
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        if (count <= (len + len % 2) / 2) {
            c = 'a';
        } else {
            c = 'b';
            count = len - count;
        }
        int cur = 0;
        for (int i = len - count; i < len; i++) {
            if (str.charAt(i) != c) {
                cur++;
            }
            q.add(str.charAt(i));
        }
        int min = cur;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != c) {
                cur++;
            }
            q.add(str.charAt(i));
            if (q.remove() != c) {
                cur--;
                if (min > cur) {
                    min = cur;
                }
            }
        }
        System.out.println(min);
    }
}
