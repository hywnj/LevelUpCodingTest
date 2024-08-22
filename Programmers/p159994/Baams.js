function solution(cards1, cards2, goal) {
	// goal를 반복문 돌면서 "i", "want", "to", "drink", "water" 하나씩 item에 담는다
	// cards1[0], cards2[0] 에 item에 들어있는 값이 있으면 shift로 배열에서 빼준다.
	// shift는 배열에서 빠지면서 배열의 길이도 짧아지기 때문에 [0]으로 계속 찾을 수 있다.
	// for문의 길이만큼 돌면서 else문을 안탔으면 for문에서 나가지기 때문에 Yes
	// for문에서 else에 걸리면 return No
	
	for (const item of goal){
			if(cards1[0] == item){
					cards1.shift();
			} else if(cards2[0] == item) {
					cards2.shift();
			} else {
					return "No"
			}
	}
	
	return "Yes"
	
	
}

