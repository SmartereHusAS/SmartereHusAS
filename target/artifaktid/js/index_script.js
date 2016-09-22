/**
 * Created by Evdal on 22.09.2016.
 */
$(document).ready(function() {
    $.getJSON('app/rooms/1/sounds/all/', function(result) {
            var numb = result.toString();
            $("#progress12").attr("aria-valuenow", numb).css("width", (numb * 2));

    });
});
$(document).ready(function() {
    $.getJSON('app/rooms/2/sounds/all/', function(result) {
        var numb = result.toString();
        $("#progress22").attr("aria-valuenow", numb).css("width", (numb * 2));

    });
});
$(document).ready(function() {
    $.getJSON('app/rooms/3/sounds/all/', function(result) {
        var numb = result.toString();
        $("#progress32").attr("aria-valuenow", numb).css("width", (numb * 2));
    });

});
$(document).ready(function() {
    $.getJSON('app/rooms/1/temps/all/', function(result) {
        var numb = result.toString();
        $("#progress12").attr("aria-valuenow", numb).css("width", (numb * 2));

    });
});
$(document).ready(function() {
    $.getJSON('app/rooms/2/temps/all/', function(result) {
        var numb = result.toString();
        $("#progress22").attr("aria-valuenow", numb).css("width", (numb * 2));

    });
});
$(document).ready(function() {
    $.getJSON('app/rooms/3/temps/all/', function(result) {
        var numb = result.toString();
        $("#progress32").attr("aria-valuenow", numb).css("width", (numb * 2));
    });

});