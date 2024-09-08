function solution(s) {
  var answer = "";
  let txt = s.split(" ");

  for (let i = 0; i < txt.length; i++) {
    for (let j = 0; j < txt[i].length; j++) {
      if (j % 2 === 0) {
        answer += txt[i][j].toUpperCase();
      } else {
        answer += txt[i][j].toLowerCase();
      }
    }

    if (i < txt.length - 1) {
      answer += " ";
    }
  }

  return answer;
}
