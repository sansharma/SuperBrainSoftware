import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sandesh on 7/15/2017.
 */
public class ViewNormalUser extends JFrame {
    private JPanel panel;
    private ResultSet rs ;


    public ViewNormalUser(){
        panel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        panel.setLayout(borderLayout);
        DBConnect db = new DBConnect();
        rs  = db.fetchCourse();

        String[] columnNames = {"ID",
                "UserName",
                "Password",
                };

        try {
            int row = rs.getRow();
            int column = 5;
            Object[][] data = new Object[row+2][column+1];
            int i=0;
            while(rs.next()){
                data[i][0] = rs.getInt("id");
                data[i][1] = rs.getString("username");
                data[i][2] = rs.getString("password");
                i++;
            }
            JTable table = new JTable(data,columnNames);
            table.setRowHeight(25);
            table.setFont(new Font("Serif",Font.PLAIN, 18));
            table.getTableHeader().setFont(new Font("Serif",Font.BOLD,20));
            panel.add(table.getTableHeader(), BorderLayout.PAGE_START);
            panel.add(table,BorderLayout.CENTER);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 300);
        add(panel);
    }
}
