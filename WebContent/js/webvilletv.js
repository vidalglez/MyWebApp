var position = 0;
var playlist;
var video;

window.onload = function(){
	playlist = ["../video/reata.mp4", "../video/reataRed.mp4", "../video/reataBest.mp4"];
	video = document.getElementById("video");
	video.addEventListener("ended", nextVideo, false);
	
	video.src = playlist[position];
	video.load();
	video.play();
}

function nextVideo(){
	position++;
	if(position >= playlist.length){
		position = 0;
	}
	
	video.src = playlist[position];
	video.load();
	video.play();
}