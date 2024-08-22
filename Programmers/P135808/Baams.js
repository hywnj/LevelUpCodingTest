function solution(k, m, score) {
	var answer = 0;

	score.sort((a, b ) => b - a);
	console.log(score)
	
	let boxCount = Math.floor(score.length / m)
	console.log(m)

	for(let i = 1; i <= boxCount; i++){
			answer += score[m * i - 1] * m;
	}
	// 한 상자에 들어간 제일 낮은 점수의 사과가 해당 박스의 고정 단가가 된다
	// 그래서 박스의 마지막 단가를 구해서 * 한 박스의 갯수를 
	// 반복하면서 answer에 더해준다.
	return answer;
}