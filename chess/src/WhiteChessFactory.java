class WhiteChessFactory implements ChessFactory {
    public ChessPiece createPawn(){
        return new WhitePawn();
    }

    public ChessPiece createKnight(){
        return new WhiteKnight();
    }
}
