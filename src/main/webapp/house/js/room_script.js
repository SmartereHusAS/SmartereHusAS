// The root URL for the RESTful services
var rootURL = "http://localhost:8080/api/rooms/";

$(document).ready(function(){

    $(document).ready(function(){
        $.get(rootURL + findUrlId(),function(data) {
            var container = $("#roomName");
            var html = container.html("");
            container.append(
                '<h1>Smartere Hus AS</h1>'+
                '<h2>'+data.name+'</h2>'
            );
        })
    });

    $(document).ready(function(){
        $.get(rootURL + findUrlId(),function(data) {
            var container = $(".progressSound");
            var html = container.html("");
            for(var i=0;i<data.sounds.length;i++) {
                container.append(
                     '<span type="button" class="glyphicon glyphicon-triangle-left"></span>'+
                     '<span type="button" class="glyphicon glyphicon-triangle-right"></span>'+
                     '<div  class="progress">'+
                     '<div id="progress-sound-'+i+'" class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="'+data.sounds[i].volume+'" aria-valuemin="0" aria-valuemax="100" style="width: '+data.sounds[i].volume+'%">'+
                     ''+data.sounds[i].desc+''+
                     '</div>'+
                     '</div>'
                );
            }
        })
    });

    $(document).ready(function(){
        $.get(rootURL + findUrlId(),function(data) {
            var container = $(".progressLight");
            var html = container.html("");
            for(var i=0;i<data.lights.length;i++) {
                container.append(
                    '<span type="button" class="glyphicon glyphicon-triangle-left"></span>'+
                    '<span type="button" class="glyphicon glyphicon-triangle-right"></span>'+
                    '<div  class="progress">'+
                    '<div id="progress-light-'+i+'" class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="'+data.lights[i].wattage+'" aria-valuemin="0" aria-valuemax="100" style="width: '+data.lights[i].wattage+'%">'+
                    ''+data.lights[i].desc+''+
                    '</div>'+
                    '</div>'
                );
            }
        })
    });

    $(document).ready(function(){
        $.get(rootURL + findUrlId(),function(data) {
            var container = $(".progressTemp");
            var html = container.html("");
            for(var i=0;i<data.temps.length;i++) {
                container.append(
                    '<span type="button" class="glyphicon glyphicon-triangle-left"></span>'+
                    '<span type="button" class="glyphicon glyphicon-triangle-right"></span>'+
                    '<div  class="progress">'+
                    '<div id="progress-temp-'+i+'" class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="'+data.temps[i].temp+'" aria-valuemin="0" aria-valuemax="100" style="width: '+data.temps[i].temp+'%">'+
                    ''+data.temps[i].desc+''+
                    '</div>'+
                    '</div>'
                );
            }
        })
    });



    function findUrlId() {
        var url = window.location.href;
        var res = url.split("?");
        return res[1];
    }


    //FIXME: change all under here with slider functions that updates on the fly with the server(?)
    $("#progress-sound-0").ready(function() {
        $.getJSON(rootURL + findUrlId() + '/sounds/1', function(result) {
            if(result != null) {
                $("#progress-sound-1").attr("aria-valuenow", result.volume).css("width", (result.volume*2));
            }
        });
    });

    $("#progress-sound-1").ready(function() {
        $.getJSON(rootURL + findUrlId() + '/sounds/2', function(result) {
            if(result != null) {
                $("#progress-sound-2").attr("aria-valuenow", result.volume).css("width", (result.volume*2));
            }        });
    });

    $("#progress-sound-2").ready(function() {
        $.getJSON(rootURL + findUrlId() + '/sounds/3', function(result) {
            if(result != null) {
                $("#progress-sound-3").attr("aria-valuenow", result.volume).css("width", (result.volume*2));
            }        });
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

                    //FIXME: make it possible to fetch both roomId and soundDeviceId from the url(?)
                    case 6:
                        currVol = ($("#progress-sound-1").attr("aria-valuenow"));
                        $("#progress-sound-1").attr("aria-valuenow", ((currVol*1)-10)).css("width", "-=20");
                        $.ajax({
                            url: rootURL + '1/sounds/1',
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
                    //FIXME: make it possible to fetch both roomId and soundDeviceId from the url(?)
                    case 7:
                        currVol = $("#progress-sound-1").attr("aria-valuenow");
                        $("#progress-sound-1").attr("aria-valuenow", ((currVol*1)+10)).css("width", "+=20");
                        $.ajax({
                            url: rootURL + '1/sounds/1',
                            type: 'PUT',
                            data: JSON.stringify({
                                id: 1,
                                volume: currVol,
                            }),
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
                            url: rootURL + '1/sounds/2',
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
                            url: rootURL + '1/sounds/2',
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
                            url: rootURL + '1/sounds/3',
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
                            url: rootURL + '1/sounds/3',
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

    //FIXME: buggy when adding after you have deleted a unit. Probably something with id overwrite eachother.
    $("#addSoundUnit").click(function () {
        $.get(rootURL + findUrlId(),function(data) {
            $.ajax({
                type: 'POST',
                contentType: 'application/json',
                url: rootURL + findUrlId() + '/sounds',
                dataType: "json",
                data: JSON.stringify({
                    id: (data.sounds.length + 1),
                    volume: 50,
                    desc: $("#soundUnitDesc").val(),
                }),
                success: function () {
                    console.log('Unit added!');
                    console.log("NEW ID WHEN ADDING: " + (data.sounds.length + 1));
                    window.location.reload();
                }
            });

        });
    });

    $("#addLightUnit").click(function () {
        $.get(rootURL + findUrlId(),function(data) {
            $.ajax({
                type: 'POST',
                contentType: 'application/json',
                url: rootURL + findUrlId() + '/lights',
                dataType: "json",
                data: JSON.stringify({
                    id: (data.lights.length + 1),
                    wattage: 50,
                    desc: $("#lightUnitDesc").val(),
                }),
                success: function () {
                    console.log('Unit added!');
                    window.location.reload();
                }
            });
        });
    });

    $("#addTempUnit").click(function () {
        $.get(rootURL + findUrlId(),function(data) {
            $.ajax({
                type: 'POST',
                contentType: 'application/json',
                url: rootURL + findUrlId() + '/temps',
                dataType: "json",
                data: JSON.stringify({
                    id: (data.temps.length + 1),
                    temp: 50,
                    desc: $("#tempUnitDesc").val(),
                }),
                success: function () {
                    console.log('Unit added!');
                    window.location.reload();
                }
            });
        });
    });


    $("#removeSoundUnit").click(function () {
        $.ajax({
            url: rootURL + findUrlId() + '/sounds/' + $("#delSoundId").val(),
            type: 'DELETE',
            success: function() {
                console.log("Unit deleted!");
                window.location.reload();
            }
        });
    });

    $("#removeLightUnit").click(function () {
        $.ajax({
            url: rootURL + findUrlId() + '/lights/' + $("#delLightId").val(),
            type: 'DELETE',
            success: function(result) {
                console.log("Unit deleted!");
                window.location.reload();
            }
        });
    });

    $("#removeTempUnit").click(function () {
        $.ajax({
            url: rootURL + findUrlId() + '/temps/' + $("#delTempId").val(),
            type: 'DELETE',
            success: function(result) {
                console.log("Unit deleted!");
                window.location.reload();
            }
        });
    });



    //FIXME: they work, but do nothing but set background color to grey.
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