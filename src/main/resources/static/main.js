$(document).ready(function(){
    $(".toggle").click(function(){
        $(this).parent().parent().find(".wrapper1").fadeToggle();
    });
});

$(function(){
   $(".toggle").click(function () {
      $(this).text(function(i, text){
          return text === "Show" ? "Hide" : "Show";
      })
   });
})
