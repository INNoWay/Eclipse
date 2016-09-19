
public class Aeroporto
{
  public static int random()
  {
      return (int)(Math.random()*3);
  } 
   public static Pista escolheP(Aviao v1,Pista p1,Pista p2,Pista p3){
   
   Pista pista;
   pista=null;
   
   if (v1.gets().equals("grande")){
        if (p1.f.tamanho()<=p2.f.tamanho()){
            if (p1.verifila()==false){   
                pista = p1; 
            }          
        }else{
            if (p2.verifila()==false){
                pista=p2;
                }          
        }
   }else {
        if (p3.f.tamanho()<=p1.f.tamanho()&&p3.f.tamanho()<=p2.f.tamanho()){
            if (p3.verifila()==false){    
   
                pista=p3;
                
            }           
            }else if(p2.f.tamanho()<=p1.f.tamanho()){
                if (p2.verifila()==false){    
                    
                    pista=p2;
                }          
                }else if(p1.f.tamanho()<=p2.f.tamanho()){
                    if (p1.verifila()==false){    

                        pista=p1;
                    }   
        }     
   }   
   return pista;
  }
  public static Aviao novoaviao()
  {
    Aviao aviao;
    aviao = new Aviao();
    return aviao;
  } 
  public static void passatenpo(Pista p1,Pista p2,Pista p3){
    p1.passatenpo();
    p2.passatenpo();
    p3.passatenpo();
  }
   public static void main (String[] args)
   { 
   int i,quant,desviados=0;
   String resp;
   Aviao elemen;
   Pista pista;
   Pista p1 = new Pista("grande1");
   Pista p2 = new Pista("grande2");
   Pista p3 = new Pista("media");
   do{
        quant=random();
        
        //quant=2;
        System.out.println("Quantidade de avioes qe chegaram: " + quant);
        for (i=1;i<=quant;++i)
        {
            elemen=novoaviao();

            System.out.println("tamanho do aviao"+i+" qe chegou : " + elemen.gets ());     
            pista=escolheP(elemen,p1,p2,p3);
            if(pista!=null){
                System.out.println("pista escolhida para pouso: " + pista.getch());
                if(pista.verifila()==false){
                    pista.inser(elemen);    
                }                 
            }else{
                    System.out.println("pista cheia!! Aviao desviado");
                    desviados++;
            }
            elemen=null;
        }
        System.out.println("Quantidade de avioes desviados : "+desviados);
        passatenpo(p1,p2,p3);
        System.out.println("Continuar com symulacao s/n : ");
        resp=Input.readString();
   }while (resp.equals("s"));
   System.out.println("fim da symulacao  ");
  }
}

