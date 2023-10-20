
package lab2p1_halmarordonez;
import java.util.Scanner;

public class Lab2P1_HalmarOrdonez {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion, resp;
        char cont;
        cont = 's';
        resp = 0;
        while (cont == 's' || cont == 'S'){
            System.out.println("Seleccione un ejercicio.");
            System.out.println("1. Dibujando triangulos.");
            System.out.println("2. Area de figuras.");
            System.out.println("3. Evaluando numeros.");
            System.out.println("4. Salir del programa.");
            System.out.print("Ingrese su opcion: ");
            opcion = read.nextInt();

            if (opcion == 1){
                int sidea, sideb, sidec;
                System.out.println("Ingrese 3 numeros enteros positivos:");
                System.out.print("Ingrese el primer numero: ");
                sidea = read.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                sideb = read.nextInt();
                System.out.print("Ingrese el tercer numero: ");
                sidec = read.nextInt();

                if (sidea+sideb>sidec && sidea+sidec>sideb && sideb+sidec>sidea){
                    System.out.println("Las longitudes ingresadas forman un triangulo.");

                }else if(sidea<0 || sideb<0 || sidec<0){
                    System.out.println("Las longiudes no pueden ser negativas.");
                }
                else{
                    System.out.println("Las longitudes ingresadas no forman un triangulo.");
                }
            }
            if(opcion == 2){
                int fig, rad;
                double rec, tri, cir;
                char cont2;
                cont2='s';
                while (cont2 == 's' || cont2 == 'S'){
                    System.out.println("Ingrese la figura a la que desea calcularle el area:");
                    System.out.println("1. Rectangulo");
                    System.out.println("2. Triangulo");
                    System.out.println("3. Circulo");
                    System.out.print("Ingrese su opcion: ");
                    fig = read.nextInt();

                    if(fig == 1){
                        int bas, alt;
                        System.out.print("Ingrese la base del rectangulo: ");
                        bas = read.nextInt();
                        System.out.print("Ingrese la alturea del rectangulo: ");
                        alt = read.nextInt();
                        
                        rec = bas*alt;
                        System.out.println("El area del rectangulo es: " + rec);
                    }
                    if(fig == 2){
                        int bas, alt;
                        System.out.print("Ingrese la base del triangulo: ");
                        bas = read.nextInt();
                        System.out.print("Ingrese la altura deel triangulo: ");
                        alt =  read.nextInt();
                        
                        tri = 0.5*(bas*alt);
                        System.out.println("El area del triangulo es: " + tri);
                    }
                    if(fig == 3){
                        System.out.print("Ingrese el radio del circulo: ");
                        rad = read.nextInt();
                        
                        cir = (rad*rad)*Math.PI;
                        System.out.println("El area del circulo es: " + cir);
                    }
                    else if(fig > 3 || fig < 1) {
                        System.out.println("Opcion no valida.");
                    }
                    System.out.print("Desea calcular el area de otra figura(s/n)?: ");
                    cont2 = read.next().charAt(0);
                }
            }
            if (opcion == 3){
                int  prim, imp, ctdr, ctdr2;
                double num,res1, res2;
                ctdr=0;
                ctdr2=1;
                
                System.out.println("Ingrese un numero entero: ");
                num = read.nextInt();
                while(ctdr2<=num){
                    if(num%ctdr2 == 0){
                        ctdr++;
                    }
                    ctdr2++;
                }
                    
                    
                    if(num%2 == 0 && ctdr == 2){
                        System.out.println("El numero ingresado es par y primo");
                    }
                    else if(num%2 == 0){
                        System.out.println("El numero ingresado es par");
                    }
                    else if(num%2 != 0 && ctdr == 2){
                        System.out.println("El numero es impar y primo");
                    }
                    else if(num%2 != 0){
                        System.out.println("El numero es impar");
                    } 
                }
            if (opcion == 4){
                System.out.println("Saliendo del programa...");
                cont = 'n';
                resp = 1;
            }
            else if(opcion > 4 || opcion < 1){
                System.out.println("Opcion invalida.");
            }
            if(resp == 0){
                System.out.print("Desea regresar al menu inicial(s/n)?: ");
                cont = read.next().charAt(0);
            
            }
        }
    }    
}    

    
