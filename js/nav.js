var Botonlist= document.getElementById("listBoton");
var Boton2=document.getElementById('boton');


function desplegarBoton2 (){
	Botonlist.classList.add('mostrar');
};
function ocultarBoton2 (){
	Botonlist.classList.remove('mostrar');
};

Boton2.addEventListener("mouseover",desplegarBoton2,true);
Boton2.addEventListener("mouseout",ocultarBoton2,true);

/*MenuResponsive*/

var IconoMenuMovil = document.getElementById("botonmenu");

var Nav = document.getElementById("Nav");

var BotonesNav = document.getElementById("ulNav");
var CerrarNav = document.getElementById("botoncerrar");

function desplegarmenu(){
	BotonesNav.classList.add('activarNav');
	IconoMenuMovil.classList.add('none');
	CerrarNav.classList.add('activarNav');
};
IconoMenuMovil.addEventListener("click", desplegarmenu, true);

function cerrarmenu(){
	IconoMenuMovil.classList.remove('none');
	BotonesNav.classList.remove('activarNav');
}
CerrarNav.addEventListener("click", cerrarmenu, true);
