import javax.swing.JOptionPane;

public class Ejercicio {


		int numer;
		int i,neg=0,par=0; // en esta parte declara las variables  y inicializa algunas en 0 de manera global
		
		
		public void entrada() {
			for(i=0;i<5;i++) {
				numer=ingresarDatos("digite numero"+(i+1));//aca manda el mensaje para el metodo ingresarDatos
				if(numer%2==0) {
					par++;
					
		//en este metodo sin retorno crea un for que itere 5 veces para pedir los numeros
		//ademas valida con condicional si el numero es modulo de dos igual a cero si es asi
					//va a añadirse una iteracion a la variable par, que cuenta las veces que dentra en dicha condicion
					//en caso contarrio entraria al otro if que valida si este numero es menor a cero y se añadira una iteracion a la variable neg
				}
				if(numer<0) {
					neg++;
				}
			}
			JOptionPane.showMessageDialog(null, "el numero de numeros pares es: " +par+"\n"
					+"y el numero de numeros negativos es: "+ neg);
			//en esta parte manda un mensaje diciendo la cantidad de pare e impares que hay en las variables par y neg
		}
		
		
		public static int ingresarDatos(String mensaje) {
			String cadena;//se declaran unas variables solo para el metodo
			int valor;
			cadena=JOptionPane.showInputDialog(mensaje);//aqui lanza el mensaje que se envio desde el principio y lo guarda en la variable local 
			valor=Integer.parseInt(cadena);//el la variable valor guarda la cadena como parseint y por ultimo retorna el valor
			return valor;
		}

	}


