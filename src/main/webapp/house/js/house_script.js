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
                //FIXME: add function that adds a new room html-element in index.html, or checks with the "database" and fetches.
                addElement();
            }
        });
    }

    //FIXME: change with a function that fetches data from json on server. New elements disappear on refresh atm..
    function addElement() {
        var large = '<div class="col-sm-4"><div class="list-group"><a href="rooms/1.html"><button type="button" class="list-group-item"><h3>New room!</h3></button></a><div class="panel panel-default"><div class="panel-heading">*insert another sob story here*</div><div class="panel-body"><div class="progress"><div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">Lights</div></div><div class="progress"><div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">Sounds</div></div><div class="progress"><div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width:60%">Temperatures</div></div></div></div></div></div>';
        $(".row").append(large);
        $('#myModal').modal('hide');
        console.log("New and _very_ hardcoded html element added!");
    }

});