import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class webbrowser {
    private JPanel panel1;
    private JEditorPane page;
    private JTextField url;
    private JButton okButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("WebBrowser");
        frame.setContentPane(new webbrowser().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public webbrowser() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL resource = new URL(url.getText());
                    //System.out.println(resource.toString());
                    page.setPage(resource);
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}
