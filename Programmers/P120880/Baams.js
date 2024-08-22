function solution(numlist, n) {
	var answer = [];

	answer = numlist.sort((a, b) => Math.abs(a - n) - Math.abs(b - n) || b - a)
	
	return answer;
}