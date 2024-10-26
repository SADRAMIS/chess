class ChessBoard {
    private String[][] board;

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public void display() {
        for (String[] row : board) {
            for (String piece : row) {
                System.out.print(piece + " ");
            }
            System.out.println();
        }
    }
}