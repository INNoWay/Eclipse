
public class Aviao
{
 private String tamanho;
 
 public Aviao(){
    int n;
    n=(int)(Math.random()*3);
       switch (n) {
       case 0: tamanho="peqeno";
       break;
       case 1: tamanho="medio";
       break;
       case 2: tamanho="grande";
       break;
    }
    }
 public String gets (){
     return tamanho;
    }
}

