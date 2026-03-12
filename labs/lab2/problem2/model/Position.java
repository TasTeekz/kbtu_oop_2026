package labs.lab2.problem2.model;

public class Position {
    private static final int NOTATION_LENGTH = 2;

    private final int row;
    private final int col;

    public Position(int row, int col) {
        if (!Board.isInside(row, col)) {
            throw new IllegalArgumentException("invalid chessboard position");
        }
        this.row = row;
        this.col = col;
    }

    public Position(String notation) {
        if (notation == null) {
            throw new IllegalArgumentException("invalid notation");
        }

        String normalized = notation.trim().toLowerCase();
        if (normalized.length() != NOTATION_LENGTH) {
            throw new IllegalArgumentException("invalid notation");
        }

        char file = normalized.charAt(0);
        char rank = normalized.charAt(1);

        if (file < 'a' || file > 'h' || rank < '1' || rank > '8') {
            throw new IllegalArgumentException("invalid notation");
        }

        this.col = file - 'a';
        this.row = Board.SIZE - Character.getNumericValue(rank);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Position))
            return false;
        Position other = (Position) obj;
        return this.row == other.row && this.col == other.col;
    }

    @Override
    public int hashCode() {
        return row * Board.SIZE + col;
    }

    @Override
    public String toString() {
        return "" + (char) ('a' + col) + (Board.SIZE - row);
    }
}
