class WhiteKnight extends AbstractChessPiece {
    public WhiteKnight(){
        super("White");
    }

    public void move(){
        System.out.println("The White Knight moves in an L shape.");
    }
    public void specialMove(){
        System.out.println("The white knight can jump over other pieces.");
    }
}
