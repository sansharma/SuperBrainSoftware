import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sandesh on 7/15/2017.
 */
public class StudentDetail extends JFrame {

    private JPanel panel;
    private ResultSet rs;


    public StudentDetail(){
        panel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        panel.setLayout(borderLayout);
        DBConnect db = new DBConnect();
        rs  = db.fetchStudent();

        String[] columnNames = {"ID",
                "Student Name",
                "Address",
                "Age",
                "Sex",
                "Contact No.",
                "Course"};

        try {
            int row = rs.getRow();
            int column = 8;
            Object[][] data = new Object[row+8][column+1];
            int i=0;
            while(rs.next()){
                data[i][0] = rs.getInt("id");
                data[i][1] = rs.getString("name");
                data[i][2] = rs.getString("address");
                data[i][3] = rs.getString("age");
                data[i][4] = rs.getString("sex");
                data[i][5] = rs.getString("contactno");
                data[i][6] = rs.getString("course");
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
