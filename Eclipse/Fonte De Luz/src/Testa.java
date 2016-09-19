

/**
 * Write a description of class Testa_FonteDeLuz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testa{

    public static void main (String args[]){
        
    Vela v1;
	Lampada lamp;
	
	v1=new Vela();
	lamp=new Lampada();

	System.out.println("Entre Estado da lampada (ligada) ou (desligada)");
	lamp.estado=Input.readString();

	lamp.Estado();
	
	System.out.println("Entre com tipo da Lampada");
	lamp.tipo=Input.readString();
	
	System.out.println("Entre com a potencia da Lampada");
	lamp.Potencia=Input.readInteger();
	
	
	
	System.out.println("Entre Estado da vela (ligada) ou (desligada)");
	v1.estado=Input.readString();
	
	v1.Estado();
	
	System.out.println("Entre com a altura da Vela");
	v1.Altura=Input.readInteger();
	
	System.out.println("Entre com a circuferencia da Vela");
	v1.circ=Input.readInteger();
	
				
				System.out.println("vela:"+v1.estado);
				System.out.println("Altura da vela:"+v1.Altura);
				System.out.println("Circuferencia da vela:"+v1.circ);
				
				System.out.println("lampada:"+lamp.estado);
				System.out.println("Tipo da Lampada:"+lamp.tipo);
				System.out.println("Potencia da lampada:"+lamp.Potencia);
				
		
	}
}
	
