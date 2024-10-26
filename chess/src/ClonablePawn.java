class ClonablePawn extends PrototypeChessPiece {
    private String color;

    public ClonablePawn(String color) {
        this.color = color;
    }

    @Override
    public ClonablePawn clone() throws CloneNotSupportedException {
        return (ClonablePawn) super.clone();
    }

    @Override
    public String toString() {
        return "ClonablePawn{" +
                "color='" + color + '\'' +
                '}';
    }
}