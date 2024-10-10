package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Paquete {

  
    
    public int Codigo_Paquete;
    public int Nombre_Producto;
    public int Precio;
    public int Valoracion;
    
    
    public Paquete(){
        
    }
    
    
     public Paquete(int Codigo_Paquete, int Nombre_Producto, int Precio, int Valoracion) {
        this.Codigo_Paquete = Codigo_Paquete;
        this.Nombre_Producto = Nombre_Producto;
        this.Precio = Precio;
        this.Valoracion = Valoracion;
    }
     
    public int SetCodigo_Paquete(int Codigo_Paquete){
        return this.Codigo_Paquete = Codigo_Paquete;
    }

     public int Codigo_Paquete(){
        return Codigo_Paquete;
    }
    
    public int SetNombre_Producto(int Nombre_Producto){
        return this.Nombre_Producto = Nombre_Producto;
    }

     public int Nombre_Producto(){
        return Nombre_Producto;
    }
    
    public int SetPrecio(int Precio){
        return this.Precio = Precio;
    }

     public int Precio(){
        return Precio;
    }
    
    public int Valoracion(int Valoracion){
        return this.Valoracion = Valoracion;
    }

     public int Valoracion(){
        return Valoracion;
    }
     
     
//    public String TarifaDada(String paquete){
//        
//        switch (paquete) {
//           case "Hogar":
//               System.out.println("Datos Dados" + Hogar);
//                //break;
//            case "Comida":
//                System.out.println("Tu comida: " + Comida);
//                break;
//            case "Transporte":
//                System.out.println("Datos Dados: " + Transporte);
//                break;
//            default:
//                 System.out.println("No exite ese Paquete");
//                //break;
//       }
//        
//    
//        return paquete;
//    }

    
     
    
    
}
