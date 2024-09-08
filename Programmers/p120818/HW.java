package Programmers.p120818;

public class HW {
    public int solution(int price) {
        return price >= 500000 ? (int) (price * 0.8)
                : price >= 300000 ? (int) (price * 0.9)
                        : price >= 100000 ? (int) (price * 0.95)
                                : price;
    }
}
