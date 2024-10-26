class BlackKnight extends AbstractChessPiece {
    public BlackKnight(){
        super("Black");
    }

    public void move(){
        System.out.println("The Black Knight moves in an L shape.");
    }

    public void specialMove(){
        System.out.println("The Black Knight can jump over other pieces.");
    }
}
