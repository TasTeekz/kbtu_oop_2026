package labs.lab2.problem2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected Color color;
    protected Position pos;

    public Piece(Color color, Position pos) {
        this.color = color;
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return pos;
    }

    public void setPosition(Position pos) {
        this.pos = pos;
    }

    public abstract boolean isLegalMove(Position target);

    public abstract List<Position> getLegalMoves(Board board);

    protected void addMoveIfPossible(Board board, List<Position> moves, int row, int col) {
        if (!Board.isInside(row, col)) {
            return;
        }

        Piece target = board.getPiece(row, col);
        if (target == null || target.getColor() != color) {
            moves.add(new Position(row, col));
        }
    }

    protected List<Position> getSlidingMoves(Board board, int[][] directions) {
        List<Position> moves = new ArrayList<>();

        for (int[] direction : directions) {
            int row = pos.getRow();
            int col = pos.getCol();

            while (true) {
                row += direction[0];
                col += direction[1];

                if (!Board.isInside(row, col)) {
                    break;
                }

                Piece target = board.getPiece(row, col);
                if (target == null) {
                    moves.add(new Position(row, col));
                    continue;
                }

                if (target.getColor() != color) {
                    moves.add(new Position(row, col));
                }
                break;
            }
        }

        return moves;
    }

    @Override
    public abstract String toString();
}
