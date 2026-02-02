package practice2;

public class StarTriangle {
    int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.width; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("[*]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
