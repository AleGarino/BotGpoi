public class BotRunnable extends Bot implements Runnable{

    public synchronized CartaProprietà  CompraProprietà(){return this.getNumCarte().get(1);}
    private boolean volere = true;
    public synchronized void VendiProprietà(CartaProprietà cp1){}
    //public static int n_a_caso = 0;

    public BotRunnable(){}
    @Override
    public void run() {
       /* n_a_caso = n_a_caso + 20;
        System.out.println("funge" + n_a_caso);
        */
        while(volere == true){

        }
    }
}
