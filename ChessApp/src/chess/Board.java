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

        addBlackRoyalRank();
        addBlackPawnRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addBlankRank();
        addWhitePawnRank();
        addWhiteRoyalRank();

    }

    private void addBlackRoyalRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createBlackRook());
        rank.add(Piece.createBlackKnight());
        rank.add(Piece.createBlackBishop());
        rank.add(Piece.createBlackQueen());
        rank.add(Piece.createBlackKing());
        rank.add(Piece.createBlackBishop());
        rank.add(Piece.createBlackKnight());
        rank.add(Piece.createBlackRook());
        board.add(rank);
    }

    private void addWhiteRoyalRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createWhiteRook());
        rank.add(Piece.createWhiteKnight());
        rank.add(Piece.createWhiteBishop());
        rank.add(Piece.createWhiteQueen());
        rank.add(Piece.createWhiteKing());
        rank.add(Piece.createWhiteBishop());
        rank.add(Piece.createWhiteKnight());
        rank.add(Piece.createWhiteRook());
        board.add(rank);
    }

    private void addBlackPawnRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        rank.add(Piece.createBlackPawn());
        board.add(rank);
    }

    private void addWhitePawnRank() {
        ArrayList<Piece> rank = new ArrayList<Piece>();
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        rank.add(Piece.createWhitePawn());
        board.add(rank);
    }

    private void addBlankRank() {
        Piece blankPiece = Piece.noPiece;
        ArrayList<Piece> rank = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            rank.add(blankPiece);
        }
        board.add(rank);
    }

    @Override
    public String toString() {
        StringBuilder rankString = new StringBuilder();
        for (ArrayList<Piece> rank : board) {
            for (Piece pawn : rank)
                rankString.append(pawn.getRepresentation());
            rankString.append(StringUtil.appendNewLine(""));
        }
        return rankString.toString();
    }

    public int numberOfPieces(char representation, Piece.Colour colour) {
        int count = 0;
        for (ArrayList<Piece> rank : board) {
            for (Piece piece : rank) {
                if (piece.getRepresentation() == representation) {
                    count++;
                }
            }
        }
        return count;
    }
}