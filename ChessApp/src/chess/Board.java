package chess;

import java.util.ArrayList;

import pieces.Piece;
import util.StringUtil;

public class Board {

    private ArrayList<ArrayList<Piece>> board = new ArrayList<ArrayList<Piece>>();



    public int pieceCount;

    public Board() {

    }

    public void initialize() {

        addRoyalRank("WHITE");
        addWhitePawnRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addBlackPawnRank();
        addRoyalRank("BLACK");

    }

    private void addRoyalRank(Piece.Colour colour) {
        if (colour.toString() == "WHITE")
        {
            Piece.whiteCount += 8;
        } else
        {
            Piece.blackCount += 8;
        }
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createPiece(Piece.Type.ROOK, colour));
        rank.add(Piece.createPiece(Piece.Type.KNIGHT, colour));
        rank.add(Piece.createPiece(Piece.Type.BISHOP, colour));
        rank.add(Piece.createPiece(Piece.Type.QUEEN, colour));
        rank.add(Piece.createPiece(Piece.Type.KING, colour));
        rank.add(Piece.createPiece(Piece.Type.BISHOP, colour));
        rank.add(Piece.createPiece(Piece.Type.KNIGHT, colour));
        rank.add(Piece.createPiece(Piece.Type.ROOK, colour));
        board.add(rank);
    }

    private void addWhitePawnRank() {
        Piece.whiteCount += 8;
        addRank("WHITE", "P");
    }

    private void addBlackPawnRank() {
        Piece.blackCount += 8;
        addRank("BLACK", "P");
    }

    private void addBlankRank() {
        Piece blank = Piece.createPiece("", ".");
        ArrayList<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(blank);
        }
        board.add(rank);
    }

    private void addRank(String colour, String name) {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createPiece(colour, name));
        }
        board.add(rank);
    }

    @Override
    public String toString() {
        StringBuilder rankString = new StringBuilder();
        for (ArrayList<Piece> rank : board) {
            for (Piece pawn : rank)
                rankString.append(pawn.toString());
                rankString.append(StringUtil.appendNewLine(""));
        }
        return rankString.toString();
    }

    public int pieceCount() {
        return pieceCount;
    }

}