import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class mainForm {
    private DefaultFormatterFactory dff;
    private JPanel mainPanel;
    private JFormattedTextField formattedTextField1;

    mainForm() {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(700, 700));
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }

    private void createUIComponents() {
// create the formatters, default, display, edit
        NumberFormatter defaultFormatter = new NumberFormatter(new DecimalFormat("##:##"));
        NumberFormatter displayFormatter =
                new NumberFormatter(new DecimalFormat("##:##"));
        NumberFormatter editFormatter = new NumberFormatter(new DecimalFormat("##:##"));
// set their value classes
        defaultFormatter.setValueClass(Double.class);
        displayFormatter.setValueClass(Double.class);
        editFormatter.setValueClass(Double.class);
// create and set the DefaultFormatterFactory
        dff = new DefaultFormatterFactory(defaultFormatter, displayFormatter, editFormatter);
        formattedTextField1 = new JFormattedTextField(defaultFormatter);
        formattedTextField1.setFormatterFactory(dff);
    }
}