package tableexample3;

import javax.swing.*;

public class TableExample3 {

    // Constructor
    TableExample3() {
        // Pencere oluştur
        JFrame frame = new JFrame("Table Example");

        // Tablo verisi ve sütun başlıkları
        String[][] data = {
            {"1", "Ahmet", "50000"},
            {"2", "John", "55000"},
            {"3", "Salih", "70000"}
        };
        String[] columns = {"No", "Name", "Salary"};

        // JTable oluştur
        JTable table = new JTable(data, columns);
        table.setCellSelectionEnabled(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // ScrollPane'e tabloyu ekle ve pencereye yerleştir
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Pencere ayarları
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Lambda ile seçim dinleyicisi (satır ve sütun bilgisi)
        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();
            int col = table.getSelectedColumn();
            if (row != -1 && col != -1) {
                System.out.println("Selected: " + table.getValueAt(row, col));
            }
        });
    }

    // Main metodu
    public static void main(String[] args) {
        new TableExample3();
    }
}

// ödev: tek bir sütunu seçmek istersem nasıl yaparım. 