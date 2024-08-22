function solution(left, right) {
	let result = 0;
	
	for (let i = left; i <= right; i++) {
			// i가 완전제곱수인지 판별
			if (Number.isInteger(Math.sqrt(i))) {
					result -= i; // 약수의 개수가 홀수인 경우 (완전제곱수인 경우)
			} else {
					result += i; // 약수의 개수가 짝수인 경우
			}
	}
	
	return result;
}