abstract class AbstractChessPiece implements ChessPiece {
    protected String color;

    public AbstractChessPiece(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
