$(document).ready(function(){
    $(".glyphicon").click(function(){
        var icons = $(".glyphicon");
        for(var i = 0; i<icons.length;i++){
            if(icons[i] == this){
                var left = false;
                if(i % 2 == 0){
                    left = true
                }
                switch (i){
                    case 0:
                        $("#progress-light-1").css("width", "-=20");
                        break;
                    case 1:
                        $("#progress-light-1").css("width", "+=20");
                        break;
                    case 2:
                        $("#progress-light-2").css("width", "-=20");
                        break;
                    case 3:
                        $("#progress-light-2").css("width", "+=20");
                        break;
                    case 4:
                        $("#progress-light-3").css("width", "-=20");
                        break;
                    case 5:
                        $("#progress-light-3").css("width", "+=20");
                        break;

                    case 6:
                        $("#progress-sound-1").css("width", "-=20");
                        break;
                    case 7:
                        $("#progress-sound-1").css("width", "+=20");
                        break;
                    case 8:
                        $("#progress-sound-2").css("width", "-=20");
                        break;
                    case 9:
                        $("#progress-sound-2").css("width", "+=20");
                        break;
                    case 10:
                        $("#progress-sound-3").css("width", "-=20");
                        break;
                    case 11:
                        $("#progress-sound-3").css("width", "+=20");
                        break;

                    case 12:
                        $("#progress-temp-1").css("width", "-=20");
                        break;
                    case 13:
                        $("#progress-temp-1").css("width", "+=20");
                        break;
                    case 14:
                        $("#progress-temp-2").css("width", "-=20");
                        break;
                    case 15:
                        $("#progress-temp-2").css("width", "+=20");
                        break;
                    case 16:
                        $("#progress-temp-3").css("width", "-=20");
                        break;
                    case 17:
                        $("#progress-temp-3").css("width", "+=20");
                        break;
                }
                break;
            }
        }
    });

    $("#buttonLights").click(function(){

    });

    $("#buttonSounds").click(function(){

    });

    $("#sliderTemps").click(function(){
        $("#progress-temp-1").css("background-color", "grey");
        $("#progress-temp-2").css("background-color", "grey");
        $("#progress-temp-3").css("background-color", "grey");
    });
});