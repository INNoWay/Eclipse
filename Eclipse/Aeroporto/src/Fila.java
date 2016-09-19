
public class Fila
{
    
    private Aviao[] vet;
    private int inicio, //inicio da fila, local de remocao
                fim,    //fim da fila, local de insercao
                tam,    //tamanho total da fila
                nelem;  //numero de elementos armazenados no momento 

    public Fila(int n)
    {
       inicio = 0;
       fim = 0;
       tam = n;
       nelem = 0;
       vet = new Aviao[n];
    }
    public boolean insere(Aviao y)
    {
      if (nelem == tam)
        return false; //fila cheia!!
      else {
        vet[fim] = y;
        fim = (fim + 1)%tam;
        ++nelem;
        return true;
      }
    }
    
    public Aviao get(int i)
    {
        return vet[i];  
    }
    public Aviao remove()
    {
      Aviao item;
      
      if (nelem == 0)
        return null; //Fila vazia, retorna -1!!
      else {
        item = vet[inicio];
        inicio = (inicio + 1)%tam;
        --nelem;
        return item;      
      }
    }
    public int tamanho()
    {
      return nelem;      
    }
}
