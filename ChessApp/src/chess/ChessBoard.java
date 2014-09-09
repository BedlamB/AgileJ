package chess;

import pieces.Pawn;

import java.util.ArrayList;

public class ChessBoard {

    private ArrayList<Pawn> board = new ArrayList<Pawn>();

    public ChessBoard() {
    }

    public int getSize() {
        return board.size();
    }

    public void add(Pawn pawn) {
        board.add(pawn);
    }

    public Pawn getPawn(int i) {
        return board.get(i);
    }
}
