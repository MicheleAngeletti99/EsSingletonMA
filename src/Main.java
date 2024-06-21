public class Main {
    public static void main(String[] args) {
        // Invoco getInstace() per avere un'istanza di User e stampo i valori di default
        User user1 = User.getInstance();
        user1.stampaDettagli();

        // Invoco getInstance() che mi darà la stessa instanza di prima
        User user2 = User.getInstance();
        // Aggiorno i valori prima di stamparli
        user2.setNome("Michele");
        user2.setEta(24);
        user2.stampaDettagli();
    }
}