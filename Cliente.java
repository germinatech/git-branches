public class Cliente {

    public static int criaDigito(int numConta){
        return (numConta%10 + numConta/10%10)%10;
    }
}
