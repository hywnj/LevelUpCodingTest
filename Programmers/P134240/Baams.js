function solution(food) {
  var answer = [];
  let arr = [];

  for (let i = 1; i < food.length; i++) {
    arr.push(Math.floor(food[i] / 2));
  }

  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr[i]; j++) {
      answer.push(i + 1);
    }
  }

  return (answer + 0 + answer.reverse()).replaceAll(",", "");
}
