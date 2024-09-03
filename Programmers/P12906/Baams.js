function solution(arr) {
  let answer = arr.filter((item, idx) => {
    //
    console.log(arr[idx]);
    console.log(arr[idx + 1]);

    // 같지 않은것들 리턴
    return item !== arr[idx + 1];
  });

  return answer;
}
