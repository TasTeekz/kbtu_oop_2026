package lab2.problem2.model;

import java.util.*;

public class Queen extends Piece {
    private static final int[][] ALL_DIRECTIONS = {
            { 1, 0 },
            { -1, 0 },
            { 0, 1 },
            { 0, -1 },
            { 1, 1 },
            { 1, -1 },
            { -1, 1 },
            { -1, -1 }
    };

    public Queen(Color color, Position pos) {
        super(color, pos);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (target == null) {
            return false;
        }

        int rowDiff = Math.abs(target.getRow() - pos.getRow());
        int colDiff = Math.abs(target.getCol() - pos.getCol());

        boolean diagonal = rowDiff == colDiff && rowDiff != 0;
        boolean orthogonal = (target.getRow() == pos.getRow() || target.getCol() == pos.getCol())
                && !target.equals(pos);
        return diagonal || orthogonal;
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        return getSlidingMoves(board, ALL_DIRECTIONS);
    }

    @Override
    public String toString() {
        return (color == Color.WHITE ? "Q" : "q");
    }

}
