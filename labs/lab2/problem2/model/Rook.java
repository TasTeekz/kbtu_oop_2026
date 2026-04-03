package lab2.problem2.model;

import java.util.*;

public class Rook extends Piece {
    private static final int[][] ORTHOGONAL_DIRECTIONS = {
            { 1, 0 },
            { -1, 0 },
            { 0, 1 },
            { 0, -1 }
    };

    public Rook(Color color, Position pos) {
        super(color, pos);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (target == null) {
            return false;
        }

        boolean sameRow = target.getRow() == pos.getRow();
        boolean sameCol = target.getCol() == pos.getCol();
        return (sameRow || sameCol) && !target.equals(pos);
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        return getSlidingMoves(board, ORTHOGONAL_DIRECTIONS);
    }

    @Override
    public String toString() {
        return (color == Color.WHITE ? "R" : "r");
    }
}
