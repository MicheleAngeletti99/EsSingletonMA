public class User {
    // Unica istanza della classe
    private static User instance = null;

    // I campi che voglio poter modificare
    private String nome;
    private Integer eta;

    // Costruttore invisibile
    private User() {
    }

    public static User getInstance() {
        // Crea l'oggetto solo se NON esiste:
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome + "\tEtà: " + eta);
    }
}
