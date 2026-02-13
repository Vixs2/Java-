
const contenido = document.getElementById("contenido");

let nombre = "Santiago";
let edad = 14;

let edades = [12, 45, 32, 87, 75];

console.log(edades);

agregarContenido(`<h2> ${nombre}<h2>
<h3>Edad: ${edad}</h3>`);

for(let i = 0; i < edades.length; i++){
    agregarContenido(`<p>La edad es de: ${edades[i]}</p>`);
}

function agregarContenido(nuevoContenido){
    contenido.innerHTML += nuevoContenido;
}


