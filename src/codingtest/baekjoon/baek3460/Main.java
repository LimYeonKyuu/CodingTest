package codingtest.baekjoon.baek3460;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String n = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            int length = n.length();
            for(int j=0; j<length; j++) {
                if(n.charAt(length-j-1) == '1') {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
