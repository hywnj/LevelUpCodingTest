function solution(s) {
  const result = Math.floor(s.length / 2);

  if (s.length % 2 === 0) {
    return s[result - 1] + s[result];
  } else {
    return s[result];
  }
}
