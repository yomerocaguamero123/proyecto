import java.util.Scanner; Holaaa los tqm
public class CalculadoraCientifica{
	public static void main (String [] arguments){
			Scanner Teclado = new Scanner(System.in);
      
			int operacion;
			//HOLA SOY MELANY //
            //declara variables //
            Double a;
            Double b;
            Double suma1;
            Double resta2;
            Double multiplicacion3;
            Double division4;
            Double raiz5;
            Double potencia6;
            boolean salir=false; 
            Complejo c1,c2,resultado;
            double real, imag;
            Matriz ma,mb,mr,m1,m2,m3;
            int fila1, col1,fila2,col2;
             //ciclo, repetir hasta salir//
           
            while(!salir){

       // imprime el texto en este caso nuestro menu de opciones//
            System.out.println("=============BIENVENIDO A LA CALCULADORA CIENTIFICA==============");
            System.out.println("Elige la operacion a realizar:");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicacion");
			System.out.println("4 - Division");
			System.out.println("5 - Raiz cuadrada");
			System.out.println("6 - Elevar a la n-esima potencia");
			System.out.println("7- Suma de numeros complejos");
            System.out.println("8 - Resta de numeros complejos");
            System.out.println("9 - Multiplicacion de complejos");
            System.out.println("10 - Division de complejos");
            System.out.println("11 - Suma de matrices nxm");
            System.out.println("12 - Resta de matrices nxm");
            System.out.println("13 - Multiplicacion de matrices nxm");
            System.out.println("14 - Suma de matrices 2x2");
            System.out.println("15 - Resta de matrices 2x2");
            System.out.println("16 - Multiplicacion de matrices 2x2");
            System.out.println("17 - Salir");
          	System.out.println("Ingrese el numero la operacion que quiere realizar:");
            //declara la variable y lee los datos introducidos//
			operacion=Teclado.nextInt();
    
             //recibe un caso, lo busca y en caso de encontrarlo lo evalua//
            switch (operacion) {
            case 1:
            	System.out.println("Ingrese el valor del primer sumando:");
            	a=Teclado.nextDouble(); //lee datos double introducidos//
            	System.out.println("Ingrese el valor del segundo sumando:");
            	b=Teclado.nextDouble();
            	suma1 = a+b; //operacion a realizar//
            	System.out.println(+a+" + "+b+" = "+suma1); //imprime texto y resultado de la operacion//
            	break;

            case 2:
            	System.out.println("Ingrese el valor del minuendo:");
            	a=Teclado.nextDouble();
            	System.out.println("Ingrese el valor del sustraendo:");
            	b=Teclado.nextDouble();
            	resta2=a-b;
            	System.out.println(+a+" - " +b+ " = " +resta2);
            	break;
            case 3:
           		System.out.println("Ingrese el valor del multiplicando:");
           		a=Teclado.nextDouble();
            	System.out.println("Ingrese el valor del multiplicador:");
            	b=Teclado.nextDouble();
            	multiplicacion3=a*b;
            	System.out.println( "(" +a+ ")("+b+") = "+multiplicacion3);
            	break;
            case 4:

            	System.out.println("Ingrese el valor del dividendo:");
            	a=Teclado.nextDouble();
				System.out.println("Ingrese el valor del divisor");
				b=Teclado.nextDouble();
				if (b==0){
					System.out.println("Error,el divisor no puede ser igual a 0.");
				}
				else {
					division4=a/b;
					System.out.println(+a+ " / "+b+ " = " +division4);
				}
				break;
            case 5:
            	System.out.println("Ingrese el radicando:");
            	a=Teclado.nextDouble();
            	if (a< 0){
            		System.out.println("Error, el radicando no puede ser menor que 0.");
            	}
            	else {
            	raiz5=Math.sqrt(a);
            	System.out.println("La raiz cuadrada de:" +a+ " = " +raiz5);
            	}
            	break;

            case 6:
            	System.out.println("Ingrese el valor de la base:");
            	a=Teclado.nextDouble();
            	System.out.println("Ingrese el valor del exponente:");
            	b=Teclado.nextDouble();
            	potencia6=Math.pow(a,b);
            	System.out.println(+a+ " elevado a la "+b+ " es igual a : " +potencia6);
            	break;
 
            
                
                case 7:  // suma de 2 numeros complejos

                    System.out.print("Inserte el primer numero real: ");       
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el primer numero imaginario: "); // Pide al usuario los numeros que vamos a realizar la operacion//
                    imag= Teclado.nextDouble(); 
                    c1 = new Complejo (real, imag);    
                    System.out.print("Inserte el segundo numero real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el segundo numero imaginario: ");
                    imag = Teclado.nextDouble();                    
                    c2 = new Complejo (real,imag);                                    
                    resultado = c1.suma(c2);
                    if (resultado.getImaginario()==0.0)
                        System.out.println("("+c1+")+("+c2+") = " +resultado.getReal());
                    else if (resultado.getReal()==0.0)
                        System.out.println(c1+"+"+c2+" = " + resultado.getImaginario() +"i");
                    else 
                      System.out.println(c1+"+"+c2+"="+resultado);
                   

                    break;
                case 8: // Resta//
                    System.out.print("Inserte el primer real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el primer imaginario: ");
                    imag = Teclado.nextDouble();    
                    c1 = new Complejo (real, imag);    
                    System.out.print("Inserte el segundo real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el segundo imaginario: ");
                    imag = Teclado.nextDouble();
                    c2 = new Complejo (real, imag);
                    resultado = c1.resta(c2);  
                    if (resultado.getImaginario()==0.0)
                        System.out.println(c1+"-"+c2+" = " +resultado.getReal());
                    else if (resultado.getReal()==0.0)
                        System.out.println(c1+"-"+c2+" = " + resultado.getImaginario() +"i");
                    else 
                      System.out.println(c1+"-"+c2+"="+resultado);
                    break;
                case 9: // Multiplicacion//
                    System.out.print("Inserte el primer real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el primer imaginario: ");
                    imag = Teclado.nextDouble();    
                    c1 = new Complejo (real, imag);    
                    System.out.print("Inserte el segundo real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el segundo imaginario: ");
                    imag = Teclado.nextDouble();
                    c2 = new Complejo (real, imag);
                    resultado = c1.resta(c2);
                    resultado = c1.multiplica(c2);
                      if (resultado.getImaginario()==0.0)
                        System.out.println(c1+""+c2+" = " +resultado.getReal());
                    else if (resultado.getReal()==0.0)
                        System.out.println(c1+""+c2+" = " + resultado.getImaginario() +"i");
                    else 
                      System.out.println(c1+""+c2+"="+resultado);
                    break;
                case 10: // Division//
                    System.out.print("Inserte el primer real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el primer imaginario: ");
                    imag = Teclado.nextDouble();    
                    c1 = new Complejo (real, imag);    
                    System.out.print("Inserte el segundo real: ");
                    real = Teclado.nextDouble();
                    System.out.print("Inserte el segundo imaginario: ");
                    imag = Teclado.nextDouble();
                    c2 = new Complejo (real, imag);
                    resultado = c1.resta(c2);
                    resultado = c1.divide(c2);
                    if (c2.getReal()==0.0 && c2.getImaginario()==0.0)// En caso de que nuestro complejo 2 que es nuestro divisor sea 0 arroja un mensaje de error//
                    System.out.println("Indeterminado, no se puede dividir entre 0");            
                    else  if (resultado.getImaginario()==0.0)
                        System.out.println(c1+"/"+c2+" = " +resultado.getReal());
                    else if (resultado.getReal()==0.0)
                        System.out.println(c1+"/"+c2+" = " + resultado.getImaginario() +"i");
                    else 
                      System.out.println(c1+"/"+c2+"="+resultado);
                    break;

       
       
                    case 11:  // suma de 2 matrices
               System.out.println("Introduzca el numero de filas de la primera matriz ");
					fila1 = Teclado.nextInt();					
					System.out.println("Introduzca el numero de columnas de la primera matriz ");
				 	col1 = Teclado.nextInt();		
				 	System.out.println("Introduzca los datos de la matriz 1");
				 	m1=new Matriz(fila1,col1);
				 	System.out.println(""+m1);
				  	System.out.println("Introduzca el numero de filas de la segunda matriz ");
				   	fila2 = Teclado.nextInt();		
				  	System.out.println("Introduzca el numero de columnas de la segunda matriz ");
				 	col2 = Teclado.nextInt();		
				 	System.out.println("Introduzca los datos de la matriz 2");
				 	m2=new Matriz(fila2,col2);
				 	System.out.println(""+m2);
                    m3=m1.suma(m2);
                    System.out.println("Resultado de suma: ");
                    System.out.println(""+m3);

                    break;
                case 12:
                    System.out.println("Introduzca el numero de filas de la primera matriz");
                    fila1 = Teclado.nextInt();		
                    System.out.println("Introduzca el numero de columnas de la primera matriz ");
                    col1 = Teclado.nextInt();		
                    System.out.println("Introduzca los datos de la matriz 1");
                    m1=new Matriz(fila1,col1);
                    System.out.println(""+m1);
                    System.out.println("Introduzca el numero de filas de la segunda matriz ");
                    fila2 = Teclado.nextInt();		
                    System.out.println("Introduzca el numero de columnas de la segunda matriz ");
                    col2 = Teclado.nextInt();		
                    System.out.println("Introduzca los datos de la matriz 2");
                    m2=new Matriz(fila2,col2);
                    System.out.println(""+m2);
                    m3=m1.resta(m2);
                    System.out.println("Resultado de resta: ");
                    System.out.println(""+m3);
                    break;
                case 13:
                    System.out.println("Introduzca el numero de filas de la primera matriz");
                    fila1 = Teclado.nextInt();		
                    System.out.println("Introduzca el numero de columnas de la primera matriz ");
                    col1 = Teclado.nextInt();		
                    System.out.println("Introduzca los datos de la matriz 1");
                    m1=new Matriz(fila1,col1);
                    System.out.println(""+m1);
                    System.out.println("Introduzca el numero de filas de la segunda matriz ");
                    fila2 = Teclado.nextInt();		
                    System.out.println("Introduzca el numero de columnas de la segunda matriz ");
                    col2 = Teclado.nextInt();		
                    System.out.println("Introduzca los datos de la matriz 2");
                    m2=new Matriz(fila2,col2);
                    System.out.println(""+m2);
                    m3=m1.multiplicacion(m2);
                    System.out.println("Resultado de multiplicacion: ");
                    System.out.println(""+m3);
                    break;

                case 14:
                    
                    System.out.println("Introduzca los datos de la matriz 1");
                    ma=new Matriz(2,2);
                    System.out.println(""+ma);
                    System.out.println("Introduzca los datos de la matriz 2");
                    mb=new Matriz(2,2);
                    System.out.println(""+mb);
                    mr=ma.suma(mb);
                    System.out.println("Resultado de suma: ");
                    System.out.println(""+mr);
                    break;
                 case 15:
                    
                    System.out.println("Introduzca los datos de la matriz 1");
                    ma=new Matriz(2,2);
                    System.out.println(""+ma);
                    System.out.println("Introduzca los datos de la matriz 2");
                    mb=new Matriz(2,2);
                    System.out.println(""+mb);
                    mr=ma.resta(mb);
                    System.out.println("Resultado de resta: ");
                    System.out.println(""+mr);
                    break;
                 case 16:
                    
                    System.out.println("Introduzca los datos de la matriz 1");
                    ma=new Matriz(2,2);
                    System.out.println(""+ma);
                    System.out.println("Introduzca los datos de la matriz 2");
                    mb=new Matriz(2,2);
                    System.out.println(""+mb);
                    mr=ma.multiplicacion(mb);
                    System.out.println("Resultado de multiplicacion: ");
                    System.out.println(""+mr);

                    break;
                case 17:
                    salir=true;
                    System.out.println("Fin del programa, adios.");
                    break;
                    default:
                        break;


// termino de los casos//
                       



                



            }
        }   	

	}		
}
