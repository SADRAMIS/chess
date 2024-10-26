class GameManager {
    private static GameManager instance;

    private GameManager() { }

    public static synchronized GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Game started!");
    }

    public void endGame() {
        System.out.println("Game ended!");
    }
}
