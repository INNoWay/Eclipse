
public class Conta{
public double depositar,sacar;
private double saldo;
 String numero;

	public void depositar(double valor){
	saldo=saldo+valor;
	}
	public void sacar(double valor){
	saldo=saldo-valor;
	}
	public double getsaldo(){
	return (saldo);
	}
	public Conta (String n){
	numero=n; 
	}
	
} 
