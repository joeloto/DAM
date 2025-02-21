// variable global:
var botonComprobarExiste = false;
var botonPiedraExiste = true;
var botonPapelExiste = true;
var botonTijerasExiste = true;
var botonComprobar;
var respuestaHumano = 0;
var respuestaMaquina = 0;

function cambiarPiedra() {
    document.getElementById("interroganteHumano").src = "https://images.vexels.com/media/users/3/145874/isolated/preview/b55eccb8fb67c9fd017e5df9f47cab3e-roca-de-piedra.png?w=360";
    alert("La máquina está pensando... Dale a JUGAR si esa es tu opción...");
    botonComprobar = document.createElement("input");
    botonComprobar.type = "button";
    botonComprobar.value = "JUGAR";
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
    document.getElementById("interroganteHumano").src = "https://png.pngtree.com/png-clipart/20221008/original/pngtree-pieces-of-paper-png-image_8665656.png";
    alert("La máquina está pensando... ");
    botonComprobar = document.createElement("input");
    botonComprobar.type = "button";
    botonComprobar.value = "JUGAR";
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
    document.getElementById("interroganteHumano").src = "https://png.pngtree.com/png-clipart/20220729/ourmid/pngtree-paper-scissor-illustration-png-image_6090817.png";
    alert("La máquina está pensando... ");
    botonComprobar = document.createElement("input");
    botonComprobar.type = "button";
    botonComprobar.value = "JUGAR";
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

// he cambiado display = "none" y display = "" por visibility = "hidden" y visibility = "visible"

function jugar() {
    respuestaMaquina = Math.floor(Math.random() * 3);
    // 0 = piedra
    // 1 = papel
    // 2 = tijeras

    if (respuestaMaquina == 0) {
        document.getElementById("interroganteMaquina").src = "https://images.vexels.com/media/users/3/145874/isolated/preview/b55eccb8fb67c9fd017e5df9f47cab3e-roca-de-piedra.png?w=360";
    } else if (respuestaMaquina == 1) {
        document.getElementById("interroganteMaquina").src = "https://png.pngtree.com/png-clipart/20221008/original/pngtree-pieces-of-paper-png-image_8665656.png";
    } else {
        document.getElementById("interroganteMaquina").src = "https://png.pngtree.com/png-clipart/20220729/ourmid/pngtree-paper-scissor-illustration-png-image_6090817.png";
    }

    setTimeout(function () { // hago que el mensajito tarde 1 segundo en aparecer
        if (respuestaHumano === respuestaMaquina) {
            alert("EMPATE")
        } else if (respuestaHumano === 0 && respuestaMaquina === 1 || respuestaHumano === 1 && respuestaMaquina === 2 || respuestaHumano === 2 && respuestaMaquina === 0) {
            alert("GANÓ LA MÁQUINA")
        } else {
            alert("GANASTE JUGADOR HUMANO")
        }
    }, 1000);

}



window.onload = function () {
    document.getElementById("piedra").addEventListener("click", cambiarPiedra);
    document.getElementById("papel").addEventListener("click", cambiarPapel);
    document.getElementById("tijeras").addEventListener("click", cambiarTijeras);
    document.getElementById("botonComprobar").addEventListener("click", jugar);
};


// hecho