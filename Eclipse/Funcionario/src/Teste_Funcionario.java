

public class Teste_Funcionario{
    public static void main (String args[])
    
  {
    
    Funcionario F1;
    F1=new Funcionario();
    
    String resp;
    
    System.out.println("Qual Nome do Funcionario");
    F1.nome=Input.readString();
    System.out.println("Qual Departamento do Funcionario");
    F1.dep=Input.readInteger();
    System.out.println("Qual o salario do Funcionario");
    F1.salario=Input.readFloat();
    System.out.println("Entre com Dia/mes/ano");
    F1.dia=Input.readInteger();
    F1.mes=Input.readInteger();
    F1.ano=Input.readInteger();
    System.out.println("Entre com RG do funcionario");
    F1.RG=Input.readInteger();
    
    System.out.println("Nome:"+F1.nome);
    System.out.println("Departamento:"+F1.dep);
    System.out.println("Salario:"+F1.salario);
    
    System.out.println("O funcionario esta (ativo) ou (inativo) na empresa");
    resp=Input.readString();    
        if (resp.equals("ativo")){
            F1.trabalha();
        }
        else {
            F1.naoTrabalha();   

        }
  }

}

