import java.util.Arrays;
public class JY {
    public String solution(String phone_number) {
               char[] ch_phone_number = phone_number.toCharArray();
        
               for(int i=0; i<ch_phone_number.length-4; i++){
                   ch_phone_number[i]='*';
               }
               String answer = String.valueOf(ch_phone_number);
               return answer;
           }
}
