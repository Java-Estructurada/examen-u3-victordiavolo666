import java.util.Scanner;
public class solucionU3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int opc=0;
        /*double IBA=opera.cIVA(opc);  MANDAR A LLAMAR A LA FUNCIÓN
        System.out.print(IBA);*/ 
        do {
            System.out.println("===SISTEMA DE AUDITORÍA TECH===");
            System.out.println("1. Auditar facturas del día");
            System.out.println("2. Calcular impuestos (IVA)");
            System.out.println("3. Cerrar turno");
            System.out.print("Selecciona una operación:");
            opc=sc.nextInt();
            
            } while (opc!=3);

        }
}
