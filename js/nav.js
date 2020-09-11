var Botonlist= document.getElementById("listBoton");
var Boton2=document.getElementById('boton');


function desplegarBoton2 (){
	Botonlist.classList.add('desplegue');
};
function ocultarBoton2 (){
	Botonlist.classList.remove('desplegue');
};

Boton2.addEventListener("mouseover",desplegarBoton2,true);
Boton2.addEventListener("mouseout",ocultarBoton2,true);

/*MenuResponsive*/

var IconoMenuMovil = document.getElementById("botonmenu");
var Logo = document.getElementById("Logo");
var Nav = document.getElementById("Nav");
var BotonesNav = document.getElementById("ulNav");
var CerrarNav = document.getElementById("botoncerrar");

function desplegarmenu(){
	Nav.classList.add('desplegue');
	Logo.classList.add('ocultar');
	CerrarNav.classList.add('desplegue');
};

function cerrarmenu(){
	Nav.classList.remove('desplegue');
	Logo.classList.remove('ocultar');
	CerrarNav.classList.remove('desplegue');
};

IconoMenuMovil.addEventListener("click", desplegarmenu, true);
CerrarNav.addEventListener("click", cerrarmenu, true);
