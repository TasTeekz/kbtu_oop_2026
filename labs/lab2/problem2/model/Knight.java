package labs.lab2.problem2.model;

import java.util.*;

public class Knight extends Piece {
    private static final int[][] OFFSETS = {
            { 2, 1 },
            { 1, 2 },
            { -1, 2 },
            { -2, 1 },
            { -2, -1 },
            { -1, -2 },
            { 1, -2 },
            { 2, -1 }
    };

    public Knight(Color color, Position pos) {
        super(color, pos);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (target == null) {
            return false;
        }

        int rowDiff = Math.abs(target.getRow() - pos.getRow());
        int colDiff = Math.abs(target.getCol() - pos.getCol());
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        List<Position> moves = new ArrayList<>();
        for (int[] offset : OFFSETS) {
            addMoveIfPossible(board, moves, pos.getRow() + offset[0], pos.getCol() + offset[1]);
        }
        return moves;
    }

    @Override
    public String toString() {
        return (color == Color.WHITE ? "N" : "n");
    }

}
