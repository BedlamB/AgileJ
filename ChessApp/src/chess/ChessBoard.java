package chess;

import java.util.ArrayList;

import pieces.Pawn;
import util.StringUtil;

public class ChessBoard {

    private ArrayList<ArrayList<Pawn>> board = new ArrayList<ArrayList<Pawn>>();



    public int pieceCount;

    public ChessBoard() {
        initialize();
    }

    private void initialize() {

        addBlankRank();
        addWhitePawnRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addBlackPawnRank();
        addBlankRank();

    }

    private void addWhitePawnRank() {
        pieceCount += 8;
        addRank(Pawn.WHITE, Pawn.WHITE_REPRESENTATION);
    }

    private void addBlackPawnRank() {
        pieceCount += 8;
        addRank(Pawn.BLACK, Pawn.BLACK_REPRESENTATION);
    }

    private void addBlankRank() {
        Pawn blank = new Pawn("", ".");
        ArrayList<Pawn> rank = new ArrayList<Pawn>();
        for (int i = 0; i < 8; i++) {
            rank.add(blank);
        }
        board.add(rank);
    }

    private void addRank(String colour, String representation) {
        ArrayList<Pawn> rank = new ArrayList<Pawn>();
        for (int i = 0; i < 8; i++) {
            rank.add(new Pawn(colour, representation));
        }
        board.add(rank);
    }

    @Override
    public String toString() {
        StringBuilder rankString = new StringBuilder();
        for (ArrayList<Pawn> rank : board) {
            for (Pawn pawn : rank)
                rankString.append(pawn.toString());
                rankString.append(StringUtil.appendNewLine(""));
        }
        return rankString.toString();
    }

    public int pieceCount() {
        return pieceCount;
    }

}