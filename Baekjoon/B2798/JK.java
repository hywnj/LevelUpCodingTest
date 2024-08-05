import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 브루트포스 알고리즘
 * 모두 데이터를 순회하는 알고리즘으로 암호화 등 에서 사용되나 ( 사실상 그냥 반복문 중첩 )
 * 데이터가 늘어날수록 성능이 매우 안좋아짐
 * */
public class JK {
    public static void main(String[] args) throws IOException {
          //디버깅용 데이터
//        int N = 10;
//        int M = 500;
//        int[] cards = {93, 181, 245, 214, 315, 36, 185, 138, 216, 295};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //조건 input
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        //카드 input
        String[] input2 = br.readLine().split(" ");
        int[] cards = new int[input2.length];

        for(int a = 0; a < input2.length; a++){
            cards[a] = Integer.parseInt(input2[a]);
        }


        //현재 최대값
        int highest = 0;

        //1번루프
        for (int i = 0; i < N; i++) {
            //2번루프
            for (int j = i + 1; j < N; j++) {
                //3번루프( 카드 3개를 더한값으로 최종분기 )
                for (int o = j + 1; o < N; o++) {
                    //디버깅용 콘솔출력
//                        System.out.println("1 : " + cards[i] + ", " + "2 : " + cards[j] + ", " + "3 : " + cards[o] + ",           합 :  " + (cards[i] + cards[j] + cards[o]) + ", 현재 최대값 : " + highest);
                    //3개 카드의 합
                    int sum = cards[i] + cards[j] + cards[o];

                    //카드합이 지정값보다 작거나 같고, 현재 최대값보다 크면 현재 최대값으로 할당
                    if (sum <= M && sum > highest) {
                        highest = sum;
                    }
                }
            }
        }
        //결과출력
        System.out.println(highest);
    }
}
