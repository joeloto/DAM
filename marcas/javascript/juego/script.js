var botonComprobarExiste = false;
var botonPiedraExiste = true;
var botonPapelExiste = true;
var botonTijerasExiste = true;
var botonComprobar;
var respuestaHumano = 0;
var respuestaMaquina = 0;

function cambiarPiedra() {
    document.getElementById("interroganteHumano").src = "piedra.png";
    alert("The machine is thinking... Pulse PLAY if you want to fight...");
    botonComprobar = document.createElement("input");
    botonComprobar.type = "button";
    botonComprobar.value = "PLAY";
    botonComprobar.id = "botonComprobar";
    document.getElementById("piedra").style.visibility = "hidden";

    if (botonComprobarExiste === false) {
        document.getElementById("botones").insertBefore(botonComprobar, divConBotonEnviar.firstChild);
        botonComprobarExiste = true;
        botonComprobar.addEventListener("click", jugar);
    }
    if (botonPapelExiste === false) {
        document.getElementById("papel").style.visibility = "visible";
        botonPapelExiste = true;
    }
    if (botonTijerasExiste === false) {
        document.getElementById("tijeras").style.visibility = "visible";
        botonTijerasExiste = true;
    }

    respuestaHumano = 0;
    botonPiedraExiste = false;
}

function cambiarPapel() {
    document.getElementById("interroganteHumano").src = "papel.png";
    alert("The machine is thinking... Pulse PLAY if you want to fight...");
    botonComprobar = document.createElement("input");
    botonComprobar.type = "button";
    botonComprobar.value = "PLAY";
    botonComprobar.id = "botonComprobar";
    document.getElementById("papel").style.visibility = "hidden";

    if (botonComprobarExiste === false) {
        document.getElementById("botones").insertBefore(botonComprobar, divConBotonEnviar.children[1]);
        botonComprobarExiste = true;
        botonComprobar.addEventListener("click", jugar);
    }
    if (botonPiedraExiste === false) {
        document.getElementById("piedra").style.visibility = "visible";
        botonPiedraExiste = true;
    }
    if (botonTijerasExiste === false) {
        document.getElementById("tijeras").style.visibility = "visible";
        botonTijerasExiste = true;
    }

    respuestaHumano = 1;
    botonPapelExiste = false;
}

function cambiarTijeras() {
    document.getElementById("interroganteHumano").src = "tijeras.png";
    alert("The machine is thinking... Pulse PLAY if you want to fight...");
    botonComprobar = document.createElement("input");
    botonComprobar.type = "button";
    botonComprobar.value = "PLAY";
    botonComprobar.id = "botonComprobar";
    document.getElementById("tijeras").style.visibility = "hidden";

    if (botonComprobarExiste === false) {
        document.getElementById("botones").insertBefore(botonComprobar, divConBotonEnviar.children[1]);
        botonComprobarExiste = true;
        botonComprobar.addEventListener("click", jugar);
    }
    if (botonPiedraExiste === false) {
        document.getElementById("piedra").style.visibility = "visible";
        botonPapelExiste = true;
    }
    if (botonPapelExiste === false) {
        document.getElementById("papel").style.visibility = "visible";
        botonPapelExiste = true;
    }

    respuestaHumano = 2;
    botonTijerasExiste = false;
}

function jugar() {
    respuestaMaquina = Math.floor(Math.random() * 3);

    if (respuestaMaquina == 0) {
        document.getElementById("interroganteMaquina").src = "piedra.png";
    } else if (respuestaMaquina == 1) {
        document.getElementById("interroganteMaquina").src = "papel.png";
    } else {
        document.getElementById("interroganteMaquina").src = "tijeras.png";
    }

    setTimeout(function () {
        if (respuestaHumano === respuestaMaquina) {
            alert("DRAW, YOU ARE ALIVE (FOR NOW)")
        } else if (respuestaHumano === 0 && respuestaMaquina === 1 || respuestaHumano === 1 && respuestaMaquina === 2 || respuestaHumano === 2 && respuestaMaquina === 0) {
            alert("THE MACHINE WON, YOU ARE DEAD")
        } else {
            alert("YOU WON")
        }
    }, 1000);

}

window.onload = function () {
    document.getElementById("piedra").addEventListener("click", cambiarPiedra);
    document.getElementById("papel").addEventListener("click", cambiarPapel);
    document.getElementById("tijeras").addEventListener("click", cambiarTijeras);
    document.getElementById("botonComprobar").addEventListener("click", jugar);
};