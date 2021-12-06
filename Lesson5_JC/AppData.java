package Lesson5_JC;

import java.io.Serializable;

public class AppData implements Serializable {
    String[] header;
    int[][] data;

    public AppData(int sizeHeader, int sizeDataRow, int sizeDataCol) {
        header = new String[sizeHeader];
        data = new int[sizeDataRow][sizeDataCol];
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}
