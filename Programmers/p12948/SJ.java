

public class SJ {
	public String main(String phone_number) {
		String answer = phone_number.replaceAll(".(?=.{4})", "*");
		return answer;
	}
}

//---------------------------------------------------------------------------------------------

//public class p12948 {
//public String main(String phone_number) {
//	String answer = "";
//	
//	for(int i = 0; i < phone_number.length(); i ++) {
//		if ( i < phone_number.length() - 4) {
//			answer += "*";
//		} else {
//			answer += phone_number.charAt(i);
//		}
//	}
//	return answer;
//}
//}