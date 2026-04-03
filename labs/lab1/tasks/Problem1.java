package lab1.tasks;

import lab1.models.Analyzer;
import lab1.models.Data;

public class Problem1 {
    public static void main(String[] args) {
        Data data = new Data();
        Analyzer analyzer = new Analyzer(data);
        analyzer.run();
    }
}