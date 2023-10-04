public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Usando double e diferenciando numeros usando a convencao Americana ".";
        // 2.500 = (2.5) // 2500 = 2500;
        double salarioMinimo = 2500.33; 

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        // usando "Final" a palavra nao podera ser alterada;
        // essa variavel sera do tipo constante, use sempre CAIXA ALTA para variaveis constante;
        final double VALOR_DE_PI = 3.14; 
    }
}
