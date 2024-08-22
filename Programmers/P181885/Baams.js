function solution(todo_list, finished) {
	var answer = [];true
	
	for(let i = 0; i < todo_list.length; i++){
			finished[i] || answer.push(todo_list[i])
	}
	
	return answer;
}