
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.TextField;
import javax.swing.JButton;

    public class BankAccount extends JPanel implements ActionListener{

        JButton Deposit = new JButton("Deposit");
        JButton Withdraw = new JButton("Withdraw");
        JButton exit = new JButton("Exit");
        TextField t1, t2, output;
        Label DepositAccount, WithdrawAccount, balanceAmount;
        double AcctBalance=0.0;
        public BankAccount(JFrame frame) {

            DepositAccount = new Label(" Deposit :");  // Deposit label LOCATION
            DepositAccount.setBounds(50, 100, 100, 50);
            frame.add(DepositAccount);

            t1 = new TextField("");  // Deposit text box (INPUT) LOCATION
            t1.setBounds(150, 110, 100, 50);
            frame.add(t1);

            WithdrawAccount = new Label(" Withdraw :");  // Withdraw label LOCATION
            WithdrawAccount.setBounds(50, 180, 100, 50);
            frame.add(WithdrawAccount);

            t2 = new TextField("");  // Withdraw text box (INPUT) LOCATION
            t2.setBounds(150, 180, 100, 50);
            frame.add(t2);

            Deposit.addActionListener(this);  // Deposit button LOCATION
            Deposit.setBounds(150,250, 150,30);
            frame. add(Deposit);

            Withdraw.addActionListener(this);  // Withdraw button LOCATION
            Withdraw.setBounds(300,250, 150,30);
            frame.add(Withdraw);

// BALANCE - Creates Label, sets Boundaries, and adds to frame

            balanceAmount = new Label(" Balance :"); //Balance label LOCATION
            balanceAmount.setBounds(300, 180, 100, 50);
            frame.add(balanceAmount);

            output = new TextField("");  //Balance text box (OUTPUT) LOCATION
            output.setBounds(400, 180, 100, 50);
            frame.add(output);

            exit.addActionListener(this); //Exit button LOCATION
            exit.setBounds(450,250, 150,30); ;
            frame.add(exit);
        }

        public static void main(String[] args) {

            JFrame frame = new JFrame(); //PANEL PARAMETERS
            frame.getContentPane().add(new BankAccount(frame));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 500);
            frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent v) { //gives action to buttons

            if (v.getActionCommand().equals("Deposit")) {
                System.out.println("Funds Deposited");
                String balanceAmount = t1.getText();
                double DepositAmount = Double.parseDouble(balanceAmount);
                AcctBalance=AcctBalance+DepositAmount;
                output.setText(String.valueOf(AcctBalance));
                t1.setText("Success");
//Creates output when Deposit is made and updates account balance

            } else if (v.getActionCommand().equals("Withdraw")) {
                System.out.println("Funds Withdrawn");
                String balanceAmount = t2.getText();
                double WithdrawAmount = Double.parseDouble(balanceAmount);
                AcctBalance=AcctBalance-WithdrawAmount;
                output.setText(String.valueOf(AcctBalance));
                t2.setText("Success");
//Creates output when Withdraw is made and updates account balance

            }else if(v.getActionCommand().equals("Exit")){
                System.out.println("Have a Good Day");
                System.exit(0);
//Creates output when Exit is chosen and terminates program
            }
        }
    }

