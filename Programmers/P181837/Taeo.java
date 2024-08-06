package Programmers.P181837;

public class Taeo {
    public int solution(String[] order) {

        int sum = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                sum += 4500;
            } else if (order[i].contains("latte")) {
                sum += 5000;
            }
        }
        return sum;
    }
}
