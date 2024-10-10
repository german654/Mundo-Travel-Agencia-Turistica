package mundotravel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cliente {

    private String Nombre;
    private String Apellido;
    private int Dni;
    private int Celular;
    private String Correo;
    
    public Cliente(String nombre, String apellido, String DNI, String celular, String correo){
        
    }
    
    
    public Cliente(String Nombre, String Apellido, int Dni, int Celular, String Correo) {
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.Dni = Dni;
    this.Celular = Celular;
    this.Correo = Correo;
}
     

     public String SetNombre(String name){
         return this.Nombre = name;
     }
     
     public String SetApellido(String lastName){
         return this.Apellido = lastName;
     }
     
     public String getNombre(){
         return Nombre;
     }
     public String getApellido(){
         return Apellido;
     }
     
      public int setDni(int Dni){
         return this.Dni = Dni;
     }
     
     public int getDni(){
         
         return Dni;
     }
     
    public int setCelular(int Celular){
         return this.Celular = Celular;
     }
     
     public int getCelular(){
         
         return Celular;
     }
     
     public String setCorreo(String correo){
         return this.Correo = correo;
     }
     
     public String getCorreo(){
         return Correo;
     }
    
 }





