public class JK {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int result = dice.solution(5, 3, 3);

        System.out.println(result);
    }

    public int solution(int a, int b, int c) {
        int n = 0;

        if(a!=b && b!=c && a!=c){
            n = 1;
        }else if(a != b || b != c){
            n = 2;
        }else {
            n = 3;
        }
        return result(a, b, c, n);
    }

    //메서드형태로 구현. 성능보다 재사용성을 높이기위함
    public int result(int a, int b, int c, int n){
        int r = 1; //곱해주기때문에 0이 아닌 1로 초기화
        int rTmp; // 각 단계별 제곱의 합을 담을 변수
        int aTmp;
        int bTmp;
        int cTmp;

        for(int i=1; i<=n; i++){
            //매번 변수초기화
            rTmp = 0;
            aTmp = 1;
            bTmp = 1;
            cTmp = 1;
            for(int j=0; j<i; j++) { // 변수의 제곱 컨트롤 루프
                aTmp *= a;
                bTmp *= b;
                cTmp *= c;
            }
            //제곱이 끝나면 단계별 변수에 합한 뒤 출력변수에 곱함
            rTmp = aTmp + bTmp + cTmp; // ex) (a*a + b*b + c*c)
            r *= rTmp; //(a + b + c) * (a*a + b*b + c*c)
        }

        return r;
    }
}
