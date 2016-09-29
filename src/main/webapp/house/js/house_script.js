// The root URL for the RESTful services
var rootURL = "http://localhost:8080/api/rooms/";

$(document).ready(function(){

    $("#submitRoomData").click(function () {
        addRoom();
        return false;
    });

    function addRoom() {
        console.log('addRoom');
        $.ajax({
            type: 'POST',
            contentType: 'application/json',
            url: rootURL,
            dataType: "json",
            data: JSON.stringify({
                id: $("#roomId").val(),
                name: $("#roomName").val(),
            }),
            success: function(data, textStatus, jqXHR){
                $('#myModal').modal('hide');
                window.location.reload();
            }
        });
    }

    $(document).ready(function(){
        $.get(rootURL,function(data){
            var container = $(".room-container");
            var html = container.html("");
            for(var i=0;i<data.length;i++){
                container.append(
                        '<div class="col-sm-4">'+
                        '<div class="list-group">'+
                        '<a href="/house/rooms/room.html?id=">'+
                        '<button type="button" class="list-group-item"><h3>'+data[i].name+'</h3></button>'+
                        '</a>'+
                        '<div class="panel panel-default">'+
                        '<div class="panel-heading">Current '+data[i].name+' settings</div>'+
                        '<div class="panel-body">'+
                        '<div class="progress">'+
                        '<div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="'+data[i].totalSounds+'" aria-valuemin="0" aria-valuemax="'+data[i].totalSounds+'" style="width: '+data[i].totalSounds+'%">'+
                        'Lights'+
                        '</div>'+
                        '</div>'+
                        '<div class="progress">'+
                        '<div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="'+data[i].totalLights+'" aria-valuemin="0" aria-valuemax="'+data[i].totalLights+'" style="width: '+data[i].totalLights+'%">'+
                        'Sounds'+
                        '</div>'+
                        '</div>'+
                        '<div class="progress">'+
                        '<div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="'+data[i].totalTemps+'" aria-valuemin="0" aria-valuemax="'+data[i].totalLights+'" style="width: '+data[i].totalTemps+'%">'+
                        'Temperatures'+
                        '</div>'+
                        '</div>'+
                        '</div>'+
                        '</div>'+
                        '</div>'+
                        '</div>'
                )
                console.log(data[i].name);
                console.log(data[i].id);
            }
        })
    });

    function getRoom(id) {
        $.ajax({
            url: '/api/rooms/' + id + '/',
            dataType: 'json',
            success: function (data) {
                var http = new XMLHttpRequest();
                http.open("/house/rooms/room.html", true);
                http.send();
            }

        });

    }
});