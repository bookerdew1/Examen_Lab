package examen_lab_jarol_rodriguez;

import java.util.Scanner;


public class Examen_Lab_Jarol_Rodriguez {
    
    public static void main(String[] args) {
       Scanner info = new Scanner(System.in);
       
       int option;
       
       do{
            System.out.println("Menu");
            System.out.println("1. Piramede");
            System.out.println("2. Numero Mayor");
            System.out.println("3. Servicios Canales");
            System.out.println("4. Contador Vocal");
            System.out.println("5. Salir");
            System.out.println("Seleccione una Option: ");
            option = info.nextInt();
           
            switch (option){
                 case 1:
                    Piramide();
                    break;
                case 2:
                    Numero_Mayor();
                    break;
                case 3:
                    Servicio_Canales();
                    break;
                case 4:
                    ContadordeVocales();
                    break;
                case 5:
                    System.out.println("HASTA LUEGO");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                
            }
            }while(option !=5);
            
            info.close();
                
            
       }
       
        public static void Piramide() {
        int start = 1;
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                sum += start;
                start += 2;
            }
            System.out.println("= " + sum);
            sum = 0;
        }
         }
        public static void Numero_Mayor() {
            
            Scanner info = new Scanner(System.in);
             int numero, mayor = Integer.MIN_VALUE, suma = 0, contador = 0;
        String respuesta;

        do {
            System.out.print("Ingresa un número entero: ");
            numero = info.nextInt();
            suma += numero;
            contador++;

            if (numero > mayor) {
                mayor = numero;
            }

            System.out.print("¿Deseas ingresar otro número? (si/no): ");
            respuesta = info.next();

        } while (respuesta.equalsIgnoreCase("si"));

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El número mayor ingresado es: " + mayor);
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }
        }
        
        public static void Servicio_Canales() {
            Scanner info = new Scanner(System.in);
            int canalesNormales = 0;
            int HDcanales = 0;
            String OtrosCanales;
            
            System.out.println("Ingrese el nombre del cliente: ");
            String NombreCliente = info.nextLine();
            
            do{
                System.out.println("Ingrese el tipo de canal HD/NORMAL: ");
                String channelType = info.next().toUpperCase();
            if (channelType.equals("HD")) {
                HDcanales++;
            } else if (channelType.equals("NORMAL")) {
                canalesNormales++;
            }
            System.out.print("¿Desea ingresar otro canal? (SI/NO): ");
            OtrosCanales = info.next().toUpperCase();
        } while (OtrosCanales.equals("SI"));
        
        System.out.print("Ingrese el tipo de caja digital (LIGHTBOX/HDBOX/DVRBOX): ");
        String boxType = info.next().toUpperCase();
        
        int subtotal = (canalesNormales * 20) + (HDcanales * 30);
        switch (boxType) {
            case "LIGHTBOX":
                subtotal += 50;
                break;
            case "HDBOX":
                subtotal += 100;
                break;
            case "DVRBOX":
                subtotal += 150;
                break;
            default:
                System.out.println("Tipo de caja no reconocido. Se asignará costo de caja a 0.");
        }
        
        double tax = subtotal * 0.15;
        double total = subtotal + tax;
        
        System.out.println("\nDETALLE DEL SERVICIO");
        System.out.println("Cliente: " + NombreCliente);
        System.out.println("Canales NORMALES: " + canalesNormales);
        System.out.println("Canales HD: " + HDcanales);
        System.out.println("Subtotal a pagar: Lps. " + subtotal);
        System.out.println("Impuesto : Lps. " + tax);
        System.out.println("Total a pagar: Lps. " + total);
    }
            public static void ContadordeVocales() {
        Scanner info = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String input = info.nextLine();
        int vocal = 0;


            }
        }

       
    
            
            
            
            
            
        

        

    

