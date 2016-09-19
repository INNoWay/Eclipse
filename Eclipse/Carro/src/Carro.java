
public class Carro {
    private int distancia;
    private String cor;
    private String modelo;
    private int numero;

    public Carro(String corCarro, String modeloCarro, int numCarro) {
        cor = corCarro;
        modelo = modeloCarro;
        numero = numCarro;
    }

    public void andar(int i) {
        distancia += i;
    }

    public void mostrar() {
        StringBuffer chao = new StringBuffer();
        StringBuffer espaco = new StringBuffer();
        for (int i = 0; i < distancia; i++) {
            chao.append(".");
            espaco.append(" ");
        }
        System.out.println(espaco.toString() + "  ###");
        System.out.println(espaco.toString() + "<#######> " + cor + "-" + numero);
        System.out.println(chao.toString() + "  O   O   " + modelo);
    }
}