import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
import javax.swing.*;
 
public class Main extends JFrame {
 
    public static String TEST_TEXT = "Test text";
 
    private JLabel label_odn;
    private JLabel label_dv;
    public TestFrame() {
        super("Form");
        createGUI();
    }
 
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
 
        label = new JLabel(getText());
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.add(label, BorderLayout.CENTER);
 
        JPanel boxesPanel = new JPanel();
 
        boxesPanel.add(citeBox);
 
        boxesPanel.add(StrikeBox);
 
        boxesPanel.add(ttBox);
        boxesPanel.add(button);
        panel.add(boxesPanel, BorderLayout.SOUTH);
        button.addActionListener(e -> updateText());
        setPreferredSize(new Dimension(500, 500));
        getContentPane().add(panel);
    }
 
    public void updateText() {
        label.setText(getText());
    }
 
    private String getText() {
        String text = checkcite(TEST_TEXT);
        text = checkStrike(text);
        text = checktt(text);
        return "<html>" + text + "</html>";
    }
 
    private String checkcite(String string) {
        if (citeBox.isSelected()) {
            return "<cite>" + string + "</cite>";
        }
        return string;
    }
 
    private String checkStrike(String string) {
        if (StrikeBox.isSelected()) {
            return "<strike>" + string + "</strike>";
        }
        return string;
    }
 
      private String checktt(String string) {
        if (ttBox.isSelected()) {
            return "<tt>" + string + "</tt>";
        }
        return string;
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
