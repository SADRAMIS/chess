class WhitePawn extends AbstractChessPiece {
    public WhitePawn(){
        super("White");
    }
    public void move(){
        System.out.println("The white pawn moves forward one square.");
    }

    public void promote(){
        System.out.println("The white pawn is promoted to a queen!");
    }

}
