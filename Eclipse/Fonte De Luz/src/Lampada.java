

/**
 * Write a description of class Lampada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lampada extends FonteDeLuz
{
   
    public String tipo;
    public int Potencia;
    
    public void setpotencia(int x){
        Potencia=x;
    } 
    public int getpotencia(){
        return (Potencia);
    }
    public void Tipo(String s){
        tipo=s;
    }  
}