function solution(strArr) {
  strArr = strArr.filter((item) => !item.includes("ad"));

  return strArr;
}
