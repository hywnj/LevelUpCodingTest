/**
 * match는 찾는 문자열이 있으면 문자열을 배열에 담아서 반환하고 없다면 null을 반환하기 때문에
 * || 단축 평가로 (setLowerCase.match(/p/g)이 값이 true이면 배열로 반환하고
 * 없다면 [] 빈 배열을 반환한다.
 */

function solution(s){
	let setLowerCase = s.toLowerCase();
	const pCount = (setLowerCase.match(/p/g) || []).length;
	const yCount = (setLowerCase.match(/y/g) || []).length;
	console.log(setLowerCase.match(/p/g))

	return yCount === pCount;
	
//     s = s.split("")
//     let pCount = 0;
//     let yCount = 0;
	
//     for (item of s){
//         if(item === "y" || item === "Y"){
//             yCount += 1;
//         } else if(item === "p" || item === "P"){
//             pCount += 1;
//         }
//     }
	
//     return yCount === pCount ? true : false;
}