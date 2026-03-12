package labs.lab2.problem2.model;

import java.util.*;

public class King extends Piece {

    public King(Color color, Position pos) {
        super(color, pos);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (target == null) {
            return false;
        }

        int rowDiff = Math.abs(target.getRow() - pos.getRow());
        int colDiff = Math.abs(target.getCol() - pos.getCol());
        return (rowDiff <= 1 && colDiff <= 1) && !(rowDiff == 0 && colDiff == 0);
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        List<Position> moves = new ArrayList<>();
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) {
                    continue;
                }

                addMoveIfPossible(board, moves, pos.getRow() + dr, pos.getCol() + dc);
            }
        }
        return moves;
    }

    @Override
    public String toString() {
        return (color == Color.WHITE ? "K" : "k");
    }
}
