function closeNav() {
    var item = document.getElementsByClassName('sidebar-item-text');
    var i;
    document.getElementById("side").style.width = "5%";
    document.getElementById("btnCloseNav").style.display = "none";
    document.getElementById("btnOpenNav").style.display = "inline-block";

    var nav = document.querySelector("#cards");
    nav.style.width = "91%";
    nav.style.left = "2.5cm";

    for (i = 0; i < item.length; i++) {
        item[i].style.display = "none";
    }
}

function openNav() {
    var item = document.getElementsByClassName('sidebar-item-text');
    var i;
    document.getElementById("side").style.width = "238px";
    document.getElementById("btnCloseNav").style.display = "inline-block";
    document.getElementById("btnOpenNav").style.display = "none";
    
    var nav = document.querySelector("#cards");
    nav.style.width = "79%";
    nav.style.left = "7cm";


    for (i = 0; i < item.length; i++) {
        item[i].style.display = "inline-block";
    }
}