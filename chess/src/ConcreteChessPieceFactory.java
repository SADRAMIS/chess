class ConcreteChessPieceFactory extends ChessPieceFactory {
    @Override
    ChessPiece createPiece(String type) {
        switch (type.toLowerCase()) {
            case "pawn":
                return new Pawn();
            case "knight":
                return new Knight();
            default:
                throw new IllegalArgumentException("Unknown body type");
        }
    }
}