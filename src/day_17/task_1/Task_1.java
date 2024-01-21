package day_17.task_1;

public class Task_1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = new ChessPiece[8];
        chessPieces[0] = ChessPiece.PAWN_WHITE;
        chessPieces[1] = ChessPiece.PAWN_WHITE;
        chessPieces[2] = ChessPiece.PAWN_WHITE;
        chessPieces[3] = ChessPiece.PAWN_WHITE;

        chessPieces[4] = ChessPiece.ROOT_BLACK;
        chessPieces[5] = ChessPiece.ROOT_BLACK;
        chessPieces[6] = ChessPiece.ROOT_BLACK;
        chessPieces[7] = ChessPiece.ROOT_BLACK;

        for (ChessPiece c:chessPieces
             ) {
            System.out.println(c.getName());
        }
    }
}
