import java.awt.FlowLayout;
import javax.swing.*;

/**
 * Exercise (Chapter 4: GUIs with Swing) — matching a layout.
 *
 * Press ▶ on {@code main} to open the window. Right now every component is
 * crammed into a single row. Rearrange the components in {@link #buildForm()} —
 * using nested panels and layout managers (see 4.2) — so the window matches the
 * target screenshot in the notes: the two labelled text fields stacked
 * vertically, with the "Submit" and "Cancel" buttons centred in a row beneath
 * them.
 *
 * There is no automated test for this exercise: you check it by running it and
 * comparing with the picture. See "4.5 Testing UI code" for why UI layout is
 * usually verified by eye rather than by a test.
 *
 * Relevant reading: 4.1 Creating and showing a window, 4.2 Java Swing visual
 * components.
 */
public class RegistrationForm {

  /**
   * Builds the form panel. Change the layout here — the components you need are
   * all present, but they are arranged in a single row rather than stacked.
   *
   * @return the form's root panel
   */
  public static JPanel buildForm() {
    JPanel panel = new JPanel(new FlowLayout());
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JPanel firstNamePanel = new JPanel(new FlowLayout());
    firstNamePanel.add(new JLabel("First name:"));
    firstNamePanel.add(new JTextField(12));
    panel.add(firstNamePanel);

    JPanel lastNamePanel = new JPanel(new FlowLayout());
    lastNamePanel.add(new JLabel("Last name:"));
    lastNamePanel.add(new JTextField(12));
    panel.add(lastNamePanel);

    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.add(new JButton("Submit"));
    buttonPanel.add(new JButton("Cancel"));
    panel.add(buttonPanel);
    return panel;
  }

  /** Shows the form in a window so you can compare it with the target picture. */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(
        () -> {
          JFrame frame = new JFrame("Registration");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setContentPane(buildForm());
          frame.pack();
          frame.setVisible(true);
        });
  }
}
