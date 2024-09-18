function solution(number, limit, power) {
  let result = 0;
  for (let i = 1; i <= number; i++) {
    let count = 0;

    for (let j = 1; j * j <= i; j++) {
      if (i % j === 0) {
        count++;
        if (j * j < i) count++;
      }

      if (count > limit) {
        count = power;
        break;
      }
    }

    result += count;
  }
  return result;
}
