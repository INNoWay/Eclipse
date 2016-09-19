
public class Pista
{
    private String tamanho;
   
    public Fila f ;
    public int pouso;
    //public Aviao p;
    public Pista(String t)
    {
        pouso=0;
        tamanho=t; 
        f = new Fila(2);  
    }
    public String getch(){
        return tamanho;
    }
    public void set (String tam){
        tamanho=tam;
    }
    public boolean verifila() {
        boolean cheia = false; 
        if (f.tamanho() < 2){
           cheia = false;
        }else{ cheia = true;
            }
        return cheia;    
    }
    public void inser(Aviao elemen){
        if(f.insere(elemen)){
        System.out.println("Inserção com sucesso! Num. elementos armazenados: " + f.tamanho());
        }
       else
       System.out.println("Fila cheia!"); 
    }
    public void remove(){
      { 
        Aviao elemen;  
        elemen = f.remove();   
        if(elemen == null)
            System.out.println("Fila vazia!! Num. elementos armazenados: " + f.tamanho());
        else{
            System.out.println("Elemento removido: " + elemen + " Num. elementos armazenados: " + f.tamanho());
        }     
      }
    }  
    public void passatenpo(){
        if (pouso == 2){ 
            System.out.println("aviao da pista "+tamanho+" pousado");
            if (f.tamanho()>0){
                remove();   
                pouso=0;     
            }
        }    
        if (f.tamanho()>0){
           pouso++;
        }
    }       
}

