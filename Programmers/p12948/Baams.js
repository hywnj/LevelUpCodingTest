function solution(phone_number) {

	let fistNum = phone_number.substring(phone_number.length - 4, 0).replaceAll(/./g, "*");
	let lastNum = phone_number.substring(phone_number.length - 4);

	console.log(fistNum + lastNum)
	return fistNum + lastNum;
}