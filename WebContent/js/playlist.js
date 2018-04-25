window.onload = init;

function init(){
	var button = document.getElementById("addButton");
	button.onclick = handleButtonClick;
	loadPlayList();
}

function handleButtonClick(eventObj){
	var txt = document.getElementById("songTextInput");
	var ul = document.getElementById("playlist");
	var li = document.createElement("li");
	console.log(txt.value);
	var songName = txt.value
	li.innerHTML = songName;
	ul.appendChild(li);
	txt.value = "";
	txt.focus();
	save(songName);
}