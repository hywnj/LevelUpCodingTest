

public class SJ {
	boolean main(String s) {
		s = s.toLowerCase();  // 입력받은 문자열 s를 모두 소문자로 변환하여 s에 다시 저장
		int count = 0;
		
		for (int i =0; i < s.length(); i++) {
			
			if (s.charAt(i) == 'p')
				count++;
			else if (s.charAt(i) == 'y')
				count--;
		}
		return count == 0;
	}

}
