package practices.practice2.models;

public class StarTriangle {
    private int width;
    private String symbol;

    public StarTriangle(int width, String symbol) {
        this(width);
        this.symbol = symbol;
    }

    public StarTriangle(int width) {
        this.width = width;
        this.symbol = "[*]";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.width; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(symbol);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
