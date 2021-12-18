package logica;

import java.util.Arrays;
import java.util.List;

public class LogicaCalculadora {
	List<String> _operadores = Arrays.asList("+","-","*","/");
	String _valorA;
	String _valorB;
	String _operador;
	String _resultado;
	public LogicaCalculadora() {
		this._valorA="";
		this._valorB="";
		this._operador="";
		this._resultado="";
	}
	
	public Float resolver() {
		Float a = Float.parseFloat(_valorA);
		Float b = Float.parseFloat(_valorB);
		switch (this._operador) {
		case "+": {
			return a+b;
		}
		case "-": {
			return a-b;
		}
		case "*": {
			return a*b;
		}
		case "/": {
			if(b!=0) return a/b;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + _operador);
		}
	}
	
	
	
	public void agregarValor(String valor) {
		
		switch (valor) {
		case "=":
			try{
				if(sePuedeResolver())_resultado = resolver().toString();
			}catch (Exception e) {
				_resultado ="error";
			}
			
			break;
		case "Borrar":
			borrar();
			break;
		case "C":
			reiniciar();
			break;

		default:
			if(_operadores.contains(valor)) {
				asignarOperador(valor);
			}
			
			else {
				asignarNumero(valor);
			}
			
			break;
		}
	}

	private boolean sePuedeResolver() {
		return _valorA!=""&&_operador!=""&&_valorB!="";
	}

	private void asignarNumero(String valor) {
		if(_resultado!="" || _resultado=="error") reiniciar();
		if(_operador=="")this._valorA +=valor;
		else {
			this._valorB+=valor;
		}
	}

	private void asignarOperador(String valor) {
		if(_resultado!="error") {
			//valor a negativo
			if(valor=="-"&&_valorA=="") _valorA+="-";
			//valor b negativo
			else if (valor=="-"&&_valorB==""&&_operador!="") _valorB+="-";
			//se asigna operador
			else{
				if(_resultado!="") {
					String temp = _resultado;
					reiniciar();
					_valorA = temp;
				}
				
				this._operador = valor;
			}
		}
	}
	
	private void reiniciar() {
		_valorA="";
		_valorB="";
		_operador="";
		_resultado="";
	}

	public String get_valorA() {
		return _valorA;
	}
	public String get_valorB() {
		return _valorB;
	}
	public String get_resultado() {
		return _resultado;
	}
	public String get_operador() {
		return _operador;
	}

	private void borrar() {
		if(_valorB.length()>0) _valorB = _valorB.substring(0,_valorB.length()-1);
		else if (_operador!="") _operador="" ;
		else if(_valorA.length()>0) _valorA = _valorA.substring(0,_valorA.length()-1);
		
	}
}
