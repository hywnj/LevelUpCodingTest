import java.util.List;
import java.util.stream.Collectors;

public class JK {
    public static void main(String[] args) {
        JK m = new JK();

        String s = m.solution("awoenvaowijrf");

        System.out.println(s);
    }

    public String solution(String s) {
        //정규표현식 - a~k를 l로 replace
        return s.replaceAll("[a-k]", "l");
    }
}
