function solution(arr, divisor) {
  var answer = [];

  for (let i = 0; i < arr.length; i++) {
    arr[i] % divisor === 0 && answer.push(arr[i]);
  }

  answer.length === 0 && answer.push(-1);

  return answer.sort((a, b) => {
    return a - b;
  });
}
