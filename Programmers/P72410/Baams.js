function solution(new_id) {
	var answer = '';
	
	answer = new_id.toLowerCase().replace(/[^a-z0-9-_.]/g, "");
	
	answer = answer.replace(/\.{2,}/g, ".");
	
	answer = answer.replace(/^\.|\.$/g, "");
	
	if (answer === "") {
			answer = answer.replace(/^$/g, "a");
	}
	
	answer = answer.substring(0, 15).replace(/\.$/, "");
	
	if(answer.length <= 2){
			for(let i = answer.length; i < 3; i++){
					answer += answer[i - 1]
			}
	}
	
	return answer;
}