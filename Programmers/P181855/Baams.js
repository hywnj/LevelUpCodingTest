function solution(strArr) {
	var answer = 0;
	let obj = {};
	
	for(let i = 0; i < strArr.length; i++){
			if(!obj[strArr[i].length]){
					obj[strArr[i].length] = 1        
			} else {
					obj[strArr[i].length] += 1
			}
	}
	
	for(key in obj) {
			if(obj[key] > answer){
					answer = obj[key]
			}
	}
	
	return answer;
}