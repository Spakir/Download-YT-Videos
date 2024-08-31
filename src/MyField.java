

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyField {
    ButtonListener buttonListener = new ButtonListener();
    JFrame jFrame;
    JPanel jPanel = new JPanel();
    JLabel jLabelURL = new JLabel(FieldStrings.LINK_ON_YOUTUBE.toString());
    JLabel jLabelPath = new JLabel(FieldStrings.PATH_TO_DOWNLOAD.toString());
    JTextField textFieldURL = new JTextField(20);
    JTextField textFieldPath = new JTextField(20);
    JButton acceptURL = new JButton(FieldStrings.ACCEPT_URL.toString());
    JButton download = new JButton(FieldStrings.DOWNLOAD.toString());
    JButton acceptPathToDownload = new JButton(FieldStrings.ACCEPT_PATH.toString());

    public MyField(int width, int height) {
        doDefaultSettingsWithFrame(width, height);
        initJPanel(jPanel,jLabelURL,textFieldURL,acceptURL,jLabelPath,textFieldPath,acceptPathToDownload,download);
        acceptURL.addActionListener(this.buttonListener);
        acceptPathToDownload.addActionListener(this.buttonListener);
        download.addActionListener(this.buttonListener);
        jFrame.add(jPanel);
    }

    public void initJPanel(JPanel jPanel, JComponent... jComponents) {
        jPanel.setLayout(new FlowLayout());

        for (JComponent jComponent : jComponents) {
            jPanel.add(jComponent);
        }

    }

    private void doDefaultSettingsWithFrame(int width, int height) {
        this.jFrame = new JFrame();
        this.setSize(this.jFrame, width, height);
        this.jFrame.setVisible(true);
        this.jFrame.setDefaultCloseOperation(3);
    }

    private void setSize(JFrame jFrame, int width, int height) {
        jFrame.setSize(width, height);
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals(download.getActionCommand())) {
                Main.downloadVideo();
            }

            if (command.equals(acceptURL.getActionCommand())) {
                Main.url = textFieldURL.getText();
                textFieldURL.setText("");
                System.out.println(Main.url);
            }

            if (command.equals(acceptPathToDownload.getActionCommand())) {
                Main.path = textFieldPath.getText();
                textFieldPath.setText("");
                System.out.println(Main.path);
            }

        }
    }
}
