$(document).ready(function(){
    $("#progress-sound-1").ready(function() {
        $.getJSON('app/rooms/1/sounds/1', function(result) {
            $("#progress-sound-1").attr("aria-valuenow", result.volume).css("width", (result.volume*2));
        });
    });

    $("#progress-sound-2").ready(function() {
        $.getJSON('app/rooms/1/sounds/2', function(result) {
            $("#progress-sound-2").attr("aria-valuenow", result.volume).css("width", (result.volume*2));
        });
    });

    $("#progress-sound-3").ready(function() {
        $.getJSON('app/rooms/1/sounds/3', function(result) {
            $("#progress-sound-3").attr("aria-valuenow", result.volume).css("width", (result.volume*2));
        });
    });

    $(".glyphicon").click(function(){
        var icons = $(".glyphicon");
        for(var i = 0; i<icons.length;i++){
            var currVol = 0;
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
                        currVol = ($("#progress-sound-1").attr("aria-valuenow"));
                        $("#progress-sound-1").attr("aria-valuenow", ((currVol*1)-10)).css("width", "-=20");
                        $.ajax({
                            url: 'app/rooms/1/sounds/1',
                            type: 'PUT',
                            data: currVol,
                            contentType: 'application/json; charset=utf-8',
                            dataType: 'json',
                            success: function(result) {
                                console.log("Device edited!");
                                console.log("New volume: " + currVol);
                            }
                        });
                        break;
                    case 7:
                        currVol = $("#progress-sound-1").attr("aria-valuenow");
                        $("#progress-sound-1").attr("aria-valuenow", ((currVol*1)+10)).css("width", "+=20");
                        $.ajax({
                            url: 'app/rooms/1/sounds/1',
                            type: 'PUT',
                            data: currVol,
                            contentType: 'application/json; charset=utf-8',
                            dataType: 'json',
                            success: function(result) {
                                console.log("Device edited!");
                                console.log("New volume: " + currVol);
                            }
                        });
                        break;
                    case 8:
                        var currVol = $("#progress-sound-2").attr("aria-valuenow");
                        $("#progress-sound-2").attr("aria-valuenow", ((currVol*1)-10)).css("width", "-=20");
                        $.ajax({
                            url: 'app/rooms/1/sounds/2',
                            type: 'PUT',
                            data: currVol,
                            contentType: 'application/json; charset=utf-8',
                            dataType: 'json',
                            success: function(result) {
                                console.log("Device edited!");
                                console.log("New volume: " + currVol);
                            }
                        });
                        break;
                    case 9:
                        currVol = $("#progress-sound-2").attr("aria-valuenow");
                        $("#progress-sound-2").attr("aria-valuenow", ((currVol*1)+10)).css("width", "+=20");
                        $.ajax({
                            url: 'app/rooms/1/sounds/2',
                            type: 'PUT',
                            data: currVol,
                            contentType: 'application/json; charset=utf-8',
                            dataType: 'json',
                            success: function(result) {
                                console.log("Device edited!");
                                console.log("New volume: " + currVol);
                            }
                        });
                        break;
                    case 10:
                        currVol = $("#progress-sound-3").attr("aria-valuenow");
                        $("#progress-sound-3").attr("aria-valuenow", ((currVol*1)-10)).css("width", "-=20");
                        $.ajax({
                            url: 'app/rooms/1/sounds/3',
                            type: 'PUT',
                            data: currVol,
                            contentType: 'application/json; charset=utf-8',
                            dataType: 'json',
                            success: function(result) {
                                console.log("Device edited!");
                                console.log("New volume: " + currVol);
                            }
                        });
                        break;
                    case 11:
                        currVol = $("#progress-sound-3").attr("aria-valuenow");
                        $("#progress-sound-3").attr("aria-valuenow", ((currVol*1)+10)).css("width", "+=20");
                        $.ajax({
                            url: 'app/rooms/1/sounds/3',
                            type: 'PUT',
                            data: currVol,
                            contentType: 'application/json; charset=utf-8',
                            dataType: 'json',
                            success: function(result) {
                                console.log("Device edited!");
                                console.log("New volume: " + currVol);
                            }
                        });
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


    $("#addSoundDevice").click(function () {
        $.ajax({
            url: 'app/rooms/1/sounds',
            type: 'POST',
            data: JSON.stringify({
                id: $("#newId").val(),
                volume: $("#newVolume").val(),
            }),
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            success: function(result) {
                console.log("Device added!");
                window.location.reload();
            }
        });
    });

    $("#removeSoundDevice").click(function () {
        $.ajax({
            url: 'app/rooms/1/sounds/' + $("#deleteId").val(),
            type: 'DELETE',
            success: function(result) {
                console.log("Device deleted!");
                window.location.reload();
            }
        });
    });

    $("#toggleSounds").click(function(){
        if($("#toggleSounds").is(':checked')) {
            $("#progress-sound-1").css("background-color", "#5cb85c");
            $("#progress-sound-2").css("background-color", "#5cb85c");
            $("#progress-sound-3").css("background-color", "#5cb85c");
        } else {
            $("#progress-sound-1").css("background-color", "grey");
            $("#progress-sound-2").css("background-color", "grey");
            $("#progress-sound-3").css("background-color", "grey");
        }
    });


    $("#toggleLights").click(function(){
        if($("#toggleLights").is(':checked')) {
            $("#progress-light-1").css("background-color", "#f0ad4e");
            $("#progress-light-2").css("background-color", "#f0ad4e");
            $("#progress-light-3").css("background-color", "#f0ad4e");
        } else {
            $("#progress-light-1").css("background-color", "grey");
            $("#progress-light-2").css("background-color", "grey");
            $("#progress-light-3").css("background-color", "grey");
        }
    });

    $("#toggleTemps").click(function(){
        if($("#toggleTemps").is(':checked')) {
            $("#progress-temp-1").css("background-color", "#d9534f");
            $("#progress-temp-2").css("background-color", "#d9534f");
            $("#progress-temp-3").css("background-color", "#d9534f");
        } else {
            $("#progress-temp-1").css("background-color", "grey");
            $("#progress-temp-2").css("background-color", "grey");
            $("#progress-temp-3").css("background-color", "grey");
        }
    });
});