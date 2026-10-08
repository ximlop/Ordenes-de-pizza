package view;
import enums.Base;
import enums.Salsa;
import enums.Toppings;
import java.util.Scanner;



public class Vista {
    Scanner sc = new Scanner(System.in);

    public Base ElegirBase(){
        System.out.println("Seleccione el tamaño de la masa:");
        System.out.println("1. Mediana");
        System.out.println("2. Grande");
        System.out.println("3. Clasica");
        System.out.println("4. Borde de queso");
        int opcionBase = sc.nextInt();
        
        switch (opcionBase) {
            case 1:
                return Base.MEDIANA;
            case 2:
                return Base.GRANDE;
            case 3:
                return Base.CLASICA;
            case 4:
                return Base.BORDE_QUESO; 
            default:
                System.out.println("Opción inválida. Su pizza será de tamaño Clasica por defecto.");
                return Base.CLASICA; 
        }
    }

    public Salsa ElegirSalsa(){

        System.out.println("Seleccione la salsa:");
        System.out.println("1. Normal");
        System.out.println("2. Picante");
        System.out.println("3. Oriental");
        int opcionSalsa = sc.nextInt();

        switch(opcionSalsa){
            case 1:
                return Salsa.NORMAL;
           case 2:
                return Salsa.PICANTE;
           case 3:
                return Salsa.ORIENTAL;
            default:
               System.out.println("Opción inválida. Su pizza será con salsa normal");
               return Salsa.NORMAL;
        }
        
        
    }

    public Toppings[] ElegirToppings(){
        int cantidad;

        do { 
            System.out.println("Seleccione la cantidad de ingredientes (1 o 2) ");
            cantidad = sc.nextInt();

            if (cantidad<1 || cantidad >2){
                System.out.println("Solo puede elegir 1 o 2 ingredientes");
            }

        } while (cantidad<1 || cantidad>2);

        Toppings[] toppings = new Toppings[cantidad];

        for (int i = 0; i < toppings.length; i++){
            System.out.println("Seleccione el ingrediente " + (i + 1));
            System.out.println("1. Jamon");
            System.out.println("2. Peperoni");
            System.out.println("3. Chile pimiento");
            System.out.println("4. Piña");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    toppings[i] = Toppings.JAMON;
                    break;
                case 2:
                    toppings[i] = Toppings.PEPERONI;
                    break;
                case 3:
                    toppings[i] = Toppings.CHILE_PIMIENTO;
                    break;
                case 4:
                    toppings[i] = Toppings.PINIA;
                    break;
                default:
                    System.out.println("Opción inválida. Se usará jamón.");
                    toppings[i] = Toppings.JAMON;
                    break;
            }
        }
        return toppings;

    }

    public void mostrarResultadoOrden(boolean aceptada) {
    if (aceptada) {
        System.out.println("Orden aceptada.");
    } else {
        System.out.println("Orden rechazada: la cocina alcanzó el límite de pedidos pendientes.");
    }
}
        
        
        
     
}
