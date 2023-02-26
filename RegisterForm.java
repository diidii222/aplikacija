import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class RegisterForm extends JDialog {


    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAdress;
    private JTextField tfType;
    private JTextField tfName1;
    private JTextField tfkg;
    private JTextField tfcoment;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel registerPanel;

    public RegisterForm(JFrame parent) {
        super(parent);
        setTitle("Pievienot jaunu dzīvnieku!");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(700, 470));
        setModal(true);
        setLocationRelativeTo(parent);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerUser() {

        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAdress.getText();
        String type = tfType.getText();
        String name1 = tfName1.getText();
        String comment = tfcoment.getText();
        String kg = tfkg.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || type.isEmpty()
                || name1.isEmpty() || comment.isEmpty() || kg.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Aizpildi visus lauciņus!",
                    "Mēģini velreiz!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this,
                    " Paroles nesakrīt!",
                    "Mēģini velreiz!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        //////////////datubaze
    }

    public static void main (String[] args) {
            RegisterForm myForms = new RegisterForm(null);
        }

   }


