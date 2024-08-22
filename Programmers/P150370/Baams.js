const getExpiredDate = (dateString, month) => {
	let [year, mon, day] = dateString.split(".").map((v) => Number(v));
	mon += month;
	day -= 1;
	
	if(day === 0) {
			day = 28;
			mon -= 1;
	}
	if(mon > 12) {
			const month12Count = Math.floor(mon / 12);
			mon = mon - 12 * month12Count;
			year += month12Count;
	}
	if(mon === 0) {
			mon += 12;
			year -= 1;
	}
	
	return [year, mon, day];
}

function solution(today, terms, privacies) {
	var answer = [];
	// 개인정보 수집 일자랑 약관 종류가 들어있는 privacies를 배열을 돌면서 하나씩 꺼내준다
	// 그다음 구조분해할당으로 data, term에 각각 넣어준다.
	// ex) data = 2019.01.01, term = D 이 된다

	privacies.forEach((privacy, index) => {
			const [date, term] = privacy.split(" ")
			// terms를 돌면서 terms안에 있는 알파벳과 
			// 위에서 구조분해할당해준 term랑 같은 알파벳이면 termPerlod에 담아준다
			
			const termPerlod = Number(terms.find((innerterm) => {
					return (innerterm[0] === term)
			}).split(" ")[1])
			
			const [eYear, eMon, eDay] = getExpiredDate(date, termPerlod);
			const [year, mon, day] = today.split(".").map(v => Number(v));
			let expired = false;
			if(year > eYear) {
					expired = true;
			}
			if(year === eYear && mon > eMon) {
					expired = true;
			}
			if(year === eYear && mon === eMon && day > eDay) {
					expired = true;
			}
			if(expired){
					answer.push(index + 1)
			}
	})
	
	return answer;
}