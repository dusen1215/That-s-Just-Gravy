function theGather(){

    var jolly = document.getElementById("thevid");
    if (window.getComputedStyle(jolly, null).getPropertyValue("display") === "none") {
      jolly.style.display = "block";
    } 
    else {
        jolly.style.display = "none";
    }
 
}