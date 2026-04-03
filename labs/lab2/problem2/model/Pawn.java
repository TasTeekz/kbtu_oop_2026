package lab2.problem2.model;

import java.util.*;

public class Pawn extends Piece {

    public Pawn(Color color, Position pos) {
        super(color, pos);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (target == null) {
            return false;
        }

        int direction = (color == Color.WHITE) ? -1 : 1;
        int rowDiff = target.getRow() - pos.getRow();
        int colDiff = target.getCol() - pos.getCol();

        if (colDiff == 0 && rowDiff == direction) {
            return true;
        }

        boolean atInitialRow = (color == Color.WHITE && pos.getRow() == 6)
                || (color == Color.BLACK && pos.getRow() == 1);
        if (atInitialRow && colDiff == 0 && rowDiff == 2 * direction) {
            return true;
        }

        return Math.abs(colDiff) == 1 && rowDiff == direction;
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        List<Position> moves = new ArrayList<>();
        int direction = (color == Color.WHITE) ? -1 : 1;
        int row = pos.getRow();
        int col = pos.getCol();

        int oneStepRow = row + direction;
        if (Board.isInside(oneStepRow, col) && board.isEmpty(oneStepRow, col)) {
            moves.add(new Position(oneStepRow, col));

            int twoStepRow = row + 2 * direction;
            boolean atInitialRow = (color == Color.WHITE && row == 6) || (color == Color.BLACK && row == 1);
            if (atInitialRow && board.isEmpty(twoStepRow, col)) {
                moves.add(new Position(twoStepRow, col));
            }
        }

        for (int dc = -1; dc <= 1; dc += 2) {
            int attackCol = col + dc;
            int attackRow = row + direction;
            if (board.isEnemyPiece(attackRow, attackCol, color)) {
                moves.add(new Position(attackRow, attackCol));
            }
        }

        return moves;
    }

    @Override
    public String toString() {
        return (color == Color.WHITE ? "P" : "p");
    }
}
