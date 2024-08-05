package Programmers.P181837;

public class Hyewon {
    public int solution(String[] order) {
        int total = 0;
        for (String menu : order) {
            menu = menu.replaceAll("ice|hot", "");
            if (menu.charAt(0) == 'c') total += 5000;
            else total += 4500;
        }
        return total;
    }
}
