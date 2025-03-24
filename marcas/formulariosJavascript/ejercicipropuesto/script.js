function cambio(){
    var figura = document.getElementsByName("figura");
    if (figura.options[figura.selectedIndex].value === "Cube"){
        document.getElementsByName("lado").style.display = "flex";
    }
}

window.onload = function(){
    document.onload = cambio;
}