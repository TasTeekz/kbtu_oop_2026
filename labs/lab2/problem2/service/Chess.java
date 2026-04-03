package lab2.problem2.service;

import java.util.Scanner;

import lab2.problem2.model.*;

public class Chess {
    private final Board board;
    private final Player whitePlayer;
    private final Player blackPlayer;
    private Color currentTurn;

    public Chess(String whiteName, String blackName) {
        board = new Board();
        board.setupInitialPosition();
        whitePlayer = new Player(whiteName, Color.WHITE);
        blackPlayer = new Player(blackName, Color.BLACK);
        currentTurn = Color.WHITE;
    }

    public void play() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                Color winner = getWinner();

                if (winner != null) {
                    System.out.println("winner: " + winner);
                    return;
                }

                printTurnInfo();
                Position[] move = readMove(scanner);
                if (move == null) {
                    continue;
                }

                if (tryApplyMove(move[0], move[1])) {
                    switchTurn();
                }
            }
        }
    }

    private void printTurnInfo() {
        System.out.println(board);
        String currentPlayer = (currentTurn == Color.WHITE) ? whitePlayer.getName() : blackPlayer.getName();
        System.out.println(currentPlayer + "'s turn:");
        System.out.print("enter move (e2 e4): ");
    }

    private Position[] readMove(Scanner scanner) {
        String line = scanner.nextLine();
        String[] parts = line.trim().split("\\s+");

        if (parts.length != 2) {
            System.out.println("invalid input");
            return null;
        }

        try {
            return new Position[] { new Position(parts[0]), new Position(parts[1]) };
        } catch (IllegalArgumentException e) {
            System.out.println("invalid positions");
            return null;
        }
    }

    private boolean tryApplyMove(Position from, Position to) {
        Piece piece = board.getPiece(from);
        if (piece == null || piece.getColor() != currentTurn) {
            System.out.println("invalid piece");
            return false;
        }

        if (!piece.isLegalMove(to) || !piece.getLegalMoves(board).contains(to)) {
            System.out.println("illegal move");
            return false;
        }

        board.movePiece(from, to);
        return true;
    }

    private void switchTurn() {
        currentTurn = (currentTurn == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    public Color getWinner() {

        boolean whiteHasKing = board.findKing(Color.WHITE) != null;
        boolean blackHasKing = board.findKing(Color.BLACK) != null;

        if (!whiteHasKing)
            return Color.BLACK;
        if (!blackHasKing)
            return Color.WHITE;

        if (!board.hasAnyLegalMove(Color.WHITE))
            return Color.BLACK;
        if (!board.hasAnyLegalMove(Color.BLACK))
            return Color.WHITE;

        return null;
    }
}
