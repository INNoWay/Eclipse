

public class Corrida {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];
        carros[0] = new Carro("Vermelho", "FIAT", 22);
        carros[1] = new Carro("Azul", "FORD", 13);
        carros[2] = new Carro("Amarelo", "CHEVROLET", 54);
        carros[3] = new Carro("Prata", "RENAULT", 67);
        carros[4] = new Carro("Preto", "VOLKSWAGEN", 99);
        
        int turnos = 20;
        
        for (int i = 0; i < turnos; i++) {
            for (int j = 0; j < carros.length; j++) {
                carros[j].andar((int) (Math.random() * 5));
            }
        }

        for (int j = 0; j < carros.length; j++) {
            carros[j].mostrar();
        }
    }
}
