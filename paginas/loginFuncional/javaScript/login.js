
var matrizCorreos = ['gato@correo.com' , 'perro@correo.com' ,
 'tomate@correo.com'];

var matrizContraseñas = ['A1234' , 'B1234' , 'C1234'];

var matrizUsuarios = ['gato', 'perro' , 'tomate'];

function validarAcceso(e){
  e.preventDefault();

  var IDValidacion = document.querySelector("#verificacion");
  var IDValidacion2 = document.querySelector("#verificacion2");

  var longitud = matrizCorreos.length;

  for (var i = 0; i < longitud; i++) {
    var vacio = "";

    var CorreoIngresado = document.querySelector("#Correo").value;
    var PassIngresada = document.querySelector("#Contrasena").value;

    if (CorreoIngresado === vacio && PassIngresada === vacio) {
      IDValidacion.textContent = "Llena los campos";
      IDValidacion2.textContent = "";
    }
    if (CorreoIngresado === matrizCorreos[i]) {
      if (CorreoIngresado === matrizCorreos[i] && PassIngresada === matrizContraseñas[i]) {
        IDValidacion.textContent = "bienvenido " + matrizUsuarios[i];
        IDValidacion2.textContent = "";
      }else if (PassIngresada === vacio) {
        IDValidacion.textContent = "";
        IDValidacion2.textContent = "Ingresa tu contraseña";
      }
      else {
        IDValidacion2.textContent = "Contraseña incorrecta";
        IDValidacion.textContent = "";
      }
    }
}

}

var play = document.querySelector("#iSesion");
play.addEventListener("click", validarAcceso);

function registrarse(evento){
  evento.preventDefault();



}
