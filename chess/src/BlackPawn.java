class BlackPawn extends AbstractChessPiece {
    public BlackPawn(){
        super("Black");
    }

    public void move(){
        System.out.println("The black pawn moves forward one square.");
    }

    public void promote(){
        System.out.println("The black pawn is promoted to a queen!");
    }

}
