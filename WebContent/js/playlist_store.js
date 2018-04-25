function save(item){
	var playListArray = getStoreArray("playlist");
	playListArray.push(item);
	console.log(JSON.stringify(playListArray));
	localStorage.setItem("playlist", JSON.stringify(playListArray));
}

function loadPlayList(){
	var playListArray = getSavedSongs();
	var ul = document.getElementById("playlist");
	if(playListArray != null){
		for(var i = 0; i < playListArray.length; i++){
			var li = document.createElement("li");
			li.innerHTML = playListArray[i];
			ul.appendChild(li);
		}
	}
}

function getSavedSongs(){
	return getStoreArray("playlist");
}

function getStoreArray(key){
	var playListArray = localStorage.getItem(key);
	if(playListArray == null || playListArray == ""){
		playListArray = new Array();
	}else{
		playListArray = JSON.parse(playListArray);
	}
	return playListArray;
}