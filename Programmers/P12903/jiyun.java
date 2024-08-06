package Programmers.P12903;

import java.util.Scanner;

public class jiyun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();

        String result = solution(s,len);
        System.out.println(result);
    }

    public static String solution(String s, int len){
        String sol_res="";
        if(len%2==0){
            sol_res += s.charAt(len/2-1);
            sol_res += s.charAt(len/2);

        }
        else{
            sol_res += s.charAt(len/2);
        }
        return sol_res;
    }
}
