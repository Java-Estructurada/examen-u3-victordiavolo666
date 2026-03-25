import java.util.Scanner;
public class solucionU3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int opc=0;
        /*double IBA=opera.cIVA(opc); EJEMPLO PARA MANDAR A LLAMAR A LA FUNCIÓN
        System.out.print(IBA);*/ 
        do {
            System.out.println("===SISTEMA DE AUDITORÍA TECH===");
            System.out.println("1. Auditar facturas del día");
            System.out.println("2. Calcular impuestos (IVA)");
            System.out.println("3. Cerrar turno");
            System.out.print("Selecciona una operación:");
            opc=sc.nextInt();
            if(opc==1){ 
                System.out.print("¿Cuántas facturas se emitieron hoy?:");
                int c=sc.nextInt();
                
                }

            }
            if(opc==2){
                System.out.print("Ingrese el precio bruto del componente:");
                double comp=sc.nextDouble();
                double IBA=opera.cIVA(comp);
                System.out.println(">>Precio neto procesado con 16% de IVA:"+ IBA);
            } if(opc==3){
                System.out.println(">>Turno cerrado exitosamente. Sistema apagado");
            } 
            } while (opc!=3);

        }
}