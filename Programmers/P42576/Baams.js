function solution(participant, completion) {
  // 둘다 오름차순으로 정렬한다.
  participant.sort();
  completion.sort();

  // filter를 사용해서
  // participant 마라톤에 참여한 선수들 배열에서
  // completion 완주한 선수를 비교해서 없는 값을 리턴
  const answer = participant.filter((item, index) => {
    return item !== completion[index];
  })[0];

  return answer;
}
