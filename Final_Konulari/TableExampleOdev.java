package tableexampleodev;

import javax.swing.*;

public class TableExampleOdev {

    TableExampleOdev() {
        JFrame frame = new JFrame("Table - Sütun Seçimi");

        String[][] data = {
            {"1", "Ahmet", "50000"},
            {"2", "John", "55000"},
            {"3", "Salih", "70000"}
        };
        String[] columns = {"No", "Name", "Salary"};

        JTable table = new JTable(data, columns);

        // Sadece sütun seçimine izin ver
        table.setCellSelectionEnabled(true);
        table.setRowSelectionAllowed(false);     // Satır seçimini kapat
        table.setColumnSelectionAllowed(true);   // Sütun seçimini aç

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Sütun seçimi yapıldığında seçilen sütundaki veriyi yazdır
        table.getColumnModel().getSelectionModel().addListSelectionListener(e -> {
            int col = table.getSelectedColumn();
            if (col != -1) {
                System.out.println("Seçilen Sütun: " + col + " (" + columns[col] + ")");
                for (int row = 0; row < table.getRowCount(); row++) {
                    System.out.println("Satır " + row + ": " + table.getValueAt(row, col));
                }
            }
        });
    }

    public static void main(String[] args) {
        new TableExampleOdev();
    }
}
