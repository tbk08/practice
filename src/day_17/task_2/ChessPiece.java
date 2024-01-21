package day_17.task_2;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"), BISHOP_WHITE(3.5, "♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOT_BLACK(5, "♜"), BISHOP_BLACK(3.5, "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1,"_");
    private final double counter;
    private final String name;

    ChessPiece(double counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public double getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}
