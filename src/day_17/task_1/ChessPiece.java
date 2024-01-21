package day_17.task_1;

public enum ChessPiece {
    KING_WHITE(100, "Король (белый)"), QUEEN_WHITE(9, "Ферзь (белый)"), ROOK_WHITE(5, "Ладья (белая)"), BISHOP_WHITE(3.5, "Слон (белый)"), KNIGHT_WHITE(3, "Конь (белый)"), PAWN_WHITE(1, "Пешка (белая)"),
    KING_BLACK(100, "Король (черный)"), QUEEN_BLACK(9, "Ферзь (черный)"), ROOT_BLACK(5, "Ладья (черная)"), BISHOP_BLACK(3.5, "Слон (черный)"), KNIGHT_BLACK(3, "Конь (черный)"), PAWN_BLACK(1, "Пешка (черная)");
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
