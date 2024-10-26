class BlackChessFactory implements ChessFactory {
    public ChessPiece createPawn(){
        return new BlackPawn();
    }

    public ChessPiece createKnight(){
        return new BlackKnight();
    }
}
