package labs.lab2.problem2.model;

import java.util.*;

public class Bishop extends Piece {
    private static final int[][] DIAGONAL_DIRECTIONS = {
            { 1, 1 },
            { 1, -1 },
            { -1, 1 },
            { -1, -1 }
    };

    public Bishop(Color color, Position pos) {
        super(color, pos);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (target == null) {
            return false;
        }

        int rowDiff = Math.abs(target.getRow() - pos.getRow());
        int colDiff = Math.abs(target.getCol() - pos.getCol());
        return rowDiff == colDiff && rowDiff != 0;
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        return getSlidingMoves(board, DIAGONAL_DIRECTIONS);
    }

    @Override
    public String toString() {
        return (color == Color.WHITE ? "B" : "b");
    }

}
