$(document).ready(function(){
    $("#addKunde").click(function () {
        $.ajax({
            url: 'app/kunder/',
            type: 'POST',
            data: JSON.stringify({
                id: $("#newId").val(),
                name: $("#newName").val(),
            }),
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            success: function (result) {
                console.log("User added!");
            }
        });
    });

    $("#deleteKunde").click(function () {
        $.ajax({
            url: 'app/kunder/' + $("#deleteId").val(),
            type: 'DELETE',
            success: function(result) {
                console.log("User deleted!");
            }
        });
    });

});