function solution(s, n) {
  let upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  let lower = "abcdefghijklmnopqrstuvwxyz"; // 26
  var answer = "";

  for (let i = 0; i < s.length; i++) {
    if (s[i] === " ") {
      answer += " ";
      continue;
    }

    let ver = upper.includes(s[i]) ? upper : lower;
    let index = ver.indexOf(s[i]) + n;

    if (index >= ver.length) index -= ver.length;

    answer += ver[index];
  }

  return answer;
}
