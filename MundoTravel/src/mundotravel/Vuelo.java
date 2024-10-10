/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundotravel;

/**
 *
 * @author josed
 */
public class Vuelo {
    
    private int Fecha_Salida;
    private int Codigo_Vuelo;
    private int Duracion;
    private float Distancia;


      public Vuelo(int Fecha_Salida, int Codigo_Vuelo, int Duracion, float Distancia) {
        this.Fecha_Salida = Fecha_Salida;
        this.Codigo_Vuelo = Codigo_Vuelo;
        this.Duracion = Duracion;
        this.Distancia = Distancia;
    }
      
      public int SetFecha_Salida(int Fecha_Salida){
        return this.Fecha_Salida = Fecha_Salida;
    }

     public int Fecha_Salida(){
        return Fecha_Salida;
    }
     
    public int SetCodigo_Vuelo(int Codigo_Vuelo){
        return this.Codigo_Vuelo = Codigo_Vuelo;
    }

     public int Codigo_Vuelo(){
        return Codigo_Vuelo;
    }
    
    public int SetDuracion(int Duracion){
        return this.Duracion = Duracion;
    }

     public int Duracion(){
        return Duracion;
    }
    
    public float SetDistancia(float Distancia){
        return this.Distancia = Distancia;
    }

     public float Distancia(){
        return Distancia;
    }
    
     
}