

/**
 * Write a description of class FonteDeLuz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FonteDeLuz
{
    public boolean ligado=false;
    public String estado;
    
    public void Ligado(){
        estado="desligado";
    }
    public void Estado(){
        if (estado.equals("ligada")){
	ligado=true;
	}
}
    public void  Ligada(){
     if (estado.equals("ligada")){
     ligado=true;
    }
    else{
        ligado=false;
    }
  }
}
