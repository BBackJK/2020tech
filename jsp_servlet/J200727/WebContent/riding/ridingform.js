function deleteCheck() {
	ok = confirm("삭제하시겠습니까?");
	
	if (ok) {
		document.ridingform.menu.value='delete';
		document.ridingform.submit();
	} else {
		return;
	}
}


function insertCheck() {
	
	const money = parseInt(document.ridingform.money.value);
	
	if (document.ridingform.bossChallenger.value=="") {
		alert("이름을 입력해주세요.");
		document.ridingform.bossChallenger.focus();
		return;
	}
	
	if (document.ridingform.todo.value=="") {
		alert("할일을 입력해주세요.");
		document.ridingform.todo.focus();
		return;
	}
	
	if (document.ridingform.maxPerson.value < 1) {
		alert("모집 최대 인원은 최소 현재 인원(기본 1)보다 같거나 많아야 합니다. 다시입력해주세요.");
		document.ridingform.todo.focus();
		return;
	}
	
	if (document.ridingform.money.value=="") {
		alert("회비를 입력해주세요.");
		document.ridingform.money.focus();
		return;
	}
	
	document.ridingform.menu.value="insert";
	document.ridingform.submit();
}


function updateCheck() {
	if (document.ridingform.bossChallenger.value=="") {
		alert("이름을 입력해주세요.");
		document.ridingform.bossChallenger.focus();
		return;
	}
	
	if (document.ridingform.todo.value=="") {
		alert("할일을 입력해주세요.");
		document.ridingform.todo.focus();
		return;
	}
	
	if (document.ridingform.maxPerson.value < document.ridingform.curPerson.value) {
		alert("모집 최대 인원은 최소 현재 인원(기본 1)보다 많아야 합니다.<br>다시입력해주세요.");
		document.ridingform.todo.focus();
		return;
	}
	
	if (document.ridingform.money.value=="") {
		alert("회비를 입력해주세요.");
		document.ridingform.money.focus();
		return;
	}
	
	document.ridingform.menu.value="update";
	document.ridingform.submit();
}