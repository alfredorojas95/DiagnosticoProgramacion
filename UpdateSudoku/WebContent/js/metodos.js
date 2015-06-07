//Matriz 9x9
var matriz = new Array(9);// arreglo con 9 espacios
for (var i = 0; i < matriz.length; i++) {
	matriz[i] = new Array(9);// para cada arreglo se agregan 9 espacios más
}
var esNumero;
function validarEntrada(evt, i, j, elemento) {
	esNumero = false;
	var key = (document.all) ? evt.keyCode : evt.which;
	if (key == 8) {
		almacenar(i, j, 0);
	} else if (elemento.value.length >= 1) {// el largo de la entrada no puede
											// ser mayor a 1
		return false;
	} else if (key >= 49 && key <= 57) {// solo números entre 1 y 9
		esNumero = true;
		return true;
	} else {
		return false;
	}
}

function capturarEntrada(i, j, valor) {
	var dato = valor.value
	alert("capturando "+ dato);
	var validarRepetido=estaRepetido(i, j, dato);
	alert("res "+validarRepetido);
	if (validarRepetido==false) {
		alert("no esta repetido "+validarRepetido);
		var validarM=verificarMatrices(i, j, dato);
		alert("res M "+validarM);
		if (validarM==false) {
			almacenar(i, j, dato);
			alert("guardado");
		} 
		}else {
			valor.value = "";
	}
}

function almacenar(indiceI, indiceJ, dato) {
	matriz[indiceI][indiceJ] = dato;
}

function estaRepetido(cor1, cor2, dato) {
	var repetido = false;
	alert("en proceso");
	for (var i = 0; i < matriz.length; i++) {
		if ((matriz[cor1][i] == dato) || (matriz[i][cor2] == dato)) {
			repetido = true;
			alert("si esta repetido");
		}
	}
	return repetido;
}

function verificarMatrices(y, x, num) {
	var inicioFila = 0;
	var inicioColumna = 0;
	if (y <= 2) {inicioFila = 0;}
	if (y >= 3 && y <= 5) {inicioFila = 3;}
	if (y >= 6 && y <= 8) {inicioFila = 6;}
	if (x <= 2) {inicioColumna = 0;}
	if (x >= 3 && x <= 5) {inicioColumna = 3;}
	if (x >= 6 && x <= 8) {inicioColumna = 6;}
	var terminoFila = inicioFila + 3;
	var terminoColumna = inicioColumna + 3;
	for (var i = inicioFila; i < terminoFila; i++) {
		for (var j = inicioColumna; j < terminoColumna; j++) {
			if (matriz[i][j] == num) {
				return true;
			}
		}
	}
	return false;
}
