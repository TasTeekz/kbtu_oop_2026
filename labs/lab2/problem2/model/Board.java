package labs.lab2.problem2.model;

public class Board {
    public static final int SIZE = 8;

    private final Piece[][] board = new Piece[SIZE][SIZE];

    public static boolean isInside(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }

    public static boolean isInside(Position position) {
        return position != null && isInside(position.getRow(), position.getCol());
    }

    public Piece getPiece(Position pos) {
        if (!isInside(pos)) {
            throw new IllegalArgumentException("position is outside board: " + pos);
        }
        return board[pos.getRow()][pos.getCol()];
    }

    public Piece getPiece(int row, int col) {
        if (!isInside(row, col)) {
            throw new IllegalArgumentException("position is outside board: " + row + "," + col);
        }
        return board[row][col];
    }

    public void setPiece(Position pos, Piece piece) {
        if (!isInside(pos)) {
            throw new IllegalArgumentException("position is outside board: " + pos);
        }
        board[pos.getRow()][pos.getCol()] = piece;
        if (piece != null) {
            piece.setPosition(pos);
        }
    }

    public boolean isPositionOccupied(Position pos) {
        return getPiece(pos) != null;
    }

    public boolean isEmpty(int row, int col) {
        return isInside(row, col) && board[row][col] == null;
    }

    public boolean isEnemyPiece(int row, int col, Color ownColor) {
        if (!isInside(row, col)) {
            return false;
        }
        Piece target = board[row][col];
        return target != null && target.getColor() != ownColor;
    }

    public void movePiece(Position from, Position to) {
        Piece piece = getPiece(from);
        if (piece == null) {
            throw new IllegalArgumentException("no piece at " + from);
        }
        setPiece(to, piece);
        setPiece(from, null);
    }

    public Position findKing(Color color) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                Piece p = board[r][c];
                if (p instanceof King && p.getColor() == color) {
                    return new Position(r, c);
                }
            }
        }
        return null;
    }

    public boolean hasAnyLegalMove(Color color) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                Piece p = board[r][c];
                if (p != null && p.getColor() == color) {
                    if (!p.getLegalMoves(this).isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setupInitialPosition() {
        for (int c = 0; c < SIZE; c++) {
            setPiece(new Position(6, c), new Pawn(Color.WHITE, new Position(6, c)));
            setPiece(new Position(1, c), new Pawn(Color.BLACK, new Position(1, c)));
        }

        setPiece(new Position(7, 0), new Rook(Color.WHITE, new Position(7, 0)));
        setPiece(new Position(7, 7), new Rook(Color.WHITE, new Position(7, 7)));
        setPiece(new Position(0, 0), new Rook(Color.BLACK, new Position(0, 0)));
        setPiece(new Position(0, 7), new Rook(Color.BLACK, new Position(0, 7)));

        setPiece(new Position(7, 1), new Knight(Color.WHITE, new Position(7, 1)));
        setPiece(new Position(7, 6), new Knight(Color.WHITE, new Position(7, 6)));
        setPiece(new Position(0, 1), new Knight(Color.BLACK, new Position(0, 1)));
        setPiece(new Position(0, 6), new Knight(Color.BLACK, new Position(0, 6)));

        setPiece(new Position(7, 2), new Bishop(Color.WHITE, new Position(7, 2)));
        setPiece(new Position(7, 5), new Bishop(Color.WHITE, new Position(7, 5)));
        setPiece(new Position(0, 2), new Bishop(Color.BLACK, new Position(0, 2)));
        setPiece(new Position(0, 5), new Bishop(Color.BLACK, new Position(0, 5)));

        setPiece(new Position(7, 3), new Queen(Color.WHITE, new Position(7, 3)));
        setPiece(new Position(0, 3), new Queen(Color.BLACK, new Position(0, 3)));

        setPiece(new Position(7, 4), new King(Color.WHITE, new Position(7, 4)));
        setPiece(new Position(0, 4), new King(Color.BLACK, new Position(0, 4)));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                Piece piece = board[row][col];
                sb.append(piece == null ? " " : piece);
                sb.append(" ");
            }
            sb.append(" ").append(8 - row).append("\n");
        }
        sb.append("\na b c d e f g h\n");
        return sb.toString();
    }
}
