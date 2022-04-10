public class App {
    public static void main(String[] args) throws Exception {
        int[] linha ={ 112,33244,44,566,658,987};
        int[] coluna ={12,3432,44,654,75,455};
        for ( int contador = 0; contador < linha.length + coluna.length ; contador++){
        System.out.println(linha[contador] + " "+ coluna[contador]);
        }
    }
}
