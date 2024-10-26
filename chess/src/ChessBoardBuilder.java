class ChessBoardBuilder {
    private String[][] board;

    public ChessBoardBuilder() {
        board = new String[8][8];

    }

    public ChessBoardBuilder placePiece(int x, int y, String piece) {
        board[x][y] = piece;
        return this;
    }

    public ChessBoard build() {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setBoard(board);
        return chessBoard;
    }
}