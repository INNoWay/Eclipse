
public class Teste_Conta {
	public static void main (String args[]){
		String resp,n1;
		int s;
		double valor;
	
		Conta c1,c2;
		c1=new Conta("10");
		c2=new Conta("12");
			
		System.out.println("deseja fazer operacao no banco (1)sim ou (2)nao");
		s=Input.readInteger();
	
		while (s==1){
			System.out.println("Digite o Numero da conta (10) ou (12)");
			n1=Input.readString();
	
			if (n1.equals("10")){
				System.out.println("Qual operacao deseja (depositar) ou (sacar)");
				resp=Input.readString();
	
				if (resp.equals("depositar")){
					System.out.println("entre com valor a ser depositado");
					valor=(double)Input.readFloat();
					c1.depositar(valor);
					System.out.println("Saldo :"+c1.getsaldo());
				}
				if (resp.equals("sacar")){
					System.out.println("entre com valor a ser sacado");
					valor=(double)Input.readFloat();
					c1.sacar(valor);
					System.out.println("Valor sacado:"+c1.getsaldo());
				}
			}
			else if (n1.equals("12")){
				System.out.println("Qual operacao deseja (depositar) ou (sacar)");
				resp=Input.readString();
	
				if (resp.equals("depositar")){
					System.out.println("entre com valor a ser depositado");
					valor=(double)Input.readFloat();
					c2.depositar(valor);
					System.out.println("Saldo :"+c2.getsaldo());
				}
				if (resp.equals("sacar")){
					System.out.println("entre com valor a ser sacado");
					valor=(double)Input.readFloat();
					c2.sacar(valor);
					System.out.println("Valor sacado:"+c2.getsaldo());
				}
			}
		 
			System.out.println("Deseja continuar (1)sim ou (2)Nao");
			s=Input.readInteger();	
		}
		System.out.println("Saldo total"+c1.getsaldo());
	}
}
	
