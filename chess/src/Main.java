public class Main {
    public static void main(String[] args) {
        GameManager gameManager = GameManager.getInstance();

        gameManager.startGame();

        ChessFactory whiteFactory = new WhiteChessFactory();

        ChessPiece whitePawn = whiteFactory.createPawn();
        whitePawn.move();
        ((WhitePawn) whitePawn).promote();
        ChessPiece whiteKnight = whiteFactory.createKnight();
        whiteKnight.move();
        ((WhiteKnight) whiteKnight).specialMove();


        ChessFactory blackFactory = new BlackChessFactory();

        ChessPiece blackPawn = blackFactory.createPawn();
        blackPawn.move();
        ((BlackPawn) blackPawn).promote();

        ChessPiece blackKnight = blackFactory.createKnight();
        blackKnight.move();
        ((BlackKnight) blackKnight).specialMove();

        gameManager.endGame();
    }
}
