
public class Funcionario {
public String nome;
public int dep;
public float salario;
public int dia;
public int mes;
public int ano;
public int RG;
public boolean ativo;
	public void trabalha(){
		ativo=true;
		}
	public void naoTrabalha(){
		ativo=false;
		}
	public void nome(String s){
		nome=s;
		}
	public void esta_trabalhando(){
		if (ativo){
			System.out.println("continua trabalhando");
			}
		else{
			System.out.println("Nao esta mais trabalhando");
		}
	}
}
