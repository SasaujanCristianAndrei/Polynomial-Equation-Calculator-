package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JTextField polinomDoi;
    private JTextField polinomUnu;
    private JTextField rezultatFinal;

    private JButton inmultireBtn;
    private JButton adunareBtn;
    private JButton scadereBtn;
    private JButton impartireBtn;
    private JButton derivareBtn;
    private JButton integrareBtn;

    private JLabel titluLabel;
    private JLabel labelRezultatFinal;
    private JLabel lblPrimulPolinom;
    private JLabel lblAlDoileaPolinom;

    public MainView()
    {

        this.getContentPane().setBackground(SystemColor.scrollbar);
        this.getContentPane().setLayout(null);

        titluLabel = new JLabel("CALCULATOR POLINOAME");
        titluLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titluLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        titluLabel.setBounds(359, 10, 234, 34);
        this.getContentPane().add(titluLabel);

        polinomDoi = new JTextField();
        polinomDoi.setColumns(10);
        polinomDoi.setBounds(559, 98, 417, 34);
        this.getContentPane().add(polinomDoi);

        polinomUnu = new JTextField();
        polinomUnu.setColumns(10);
        polinomUnu.setBounds(10, 98, 417, 34);
        this.getContentPane().add(polinomUnu);

        adunareBtn = new JButton("ADUNARE");
        adunareBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        adunareBtn.setBounds(116, 142, 149, 48);
        this.getContentPane().add(adunareBtn);

        scadereBtn = new JButton("SCADERE");
        scadereBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        scadereBtn.setBounds(707, 142, 149, 48);
        this.getContentPane().add(scadereBtn);

        inmultireBtn = new JButton("INMULTIRE");
        inmultireBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        inmultireBtn.setBounds(116, 248, 149, 48);
        this.getContentPane().add(inmultireBtn);

        impartireBtn = new JButton("IMPARTIRE");
        impartireBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        impartireBtn.setBounds(707, 248, 149, 48);
        this.getContentPane().add(impartireBtn);

        derivareBtn = new JButton("DERIVARE");
        derivareBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        derivareBtn.setBounds(116, 352, 149, 48);
        this.getContentPane().add(derivareBtn);

        integrareBtn = new JButton("INTEGRARE");
        integrareBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        integrareBtn.setBounds(707, 352, 149, 48);
        this.getContentPane().add(integrareBtn);

        rezultatFinal = new JTextField();
        rezultatFinal.setEditable(false);
        rezultatFinal.setBounds(156, 473, 676, 39);
        this.getContentPane().add(rezultatFinal);
        rezultatFinal.setColumns(10);

        labelRezultatFinal = new JLabel("REZULTAT FINAL");
        labelRezultatFinal.setHorizontalAlignment(SwingConstants.CENTER);
        labelRezultatFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelRezultatFinal.setBounds(359, 429, 234, 34);
        this.getContentPane().add(labelRezultatFinal);

        lblPrimulPolinom = new JLabel("PRIMUL POLINOM");
        lblPrimulPolinom.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrimulPolinom.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPrimulPolinom.setBounds(83, 65, 234, 34);
        this.getContentPane().add(lblPrimulPolinom);

        lblAlDoileaPolinom = new JLabel("AL DOILEA POLINOM");
        lblAlDoileaPolinom.setHorizontalAlignment(SwingConstants.CENTER);
        lblAlDoileaPolinom.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAlDoileaPolinom.setBounds(657, 65, 234, 34);
        this.getContentPane().add(lblAlDoileaPolinom);
        this.setBackground(SystemColor.scrollbar);
        this.setBounds(100, 100, 1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public void addAdunareListener(ActionListener action)
    {
        adunareBtn.addActionListener(action);
    }
    public void addScadereListener(ActionListener action)
    {
        scadereBtn.addActionListener(action);
    }
    public void addInmultireListener(ActionListener action)
    {
        inmultireBtn.addActionListener(action);
    }
    public void addImpartireListener(ActionListener action)
    {
        impartireBtn.addActionListener(action);
    }
    public void addDerivareListener(ActionListener action)
    {
        derivareBtn.addActionListener(action);
    }
    public void addIntegrareListener(ActionListener action)
    {
        integrareBtn.addActionListener(action);
    }

    public String getPolinomDoi() {
        return polinomDoi.getText();
    }

    public void setPolinomDoi(String polinomDoi) {
        this.polinomDoi.setText(polinomDoi);
    }

    public String getPolinomUnu() {
        return polinomUnu.getText();
    }

    public void setPolinomUnu(String polinomUnu) {
        this.polinomUnu.setText(polinomUnu);
    }

    public String getRezultatFinal() {
        return rezultatFinal.getText();
    }

    public JButton getAdunareBtn() {
        return adunareBtn;
    }

    public JButton getInmultireBtn() {
        return inmultireBtn;
    }

    public JButton getScadereBtn() {
        return scadereBtn;
    }

    public JButton getImpartireBtn() {
        return impartireBtn;
    }

    public JButton getDerivareBtn() {
        return derivareBtn;
    }

    public JButton getIntegrareBtn() {
        return integrareBtn;
    }

    public void setRezultatFinal(String rezultatFinal) {
        if(rezultatFinal.isEmpty())
        {
            this.rezultatFinal.setText("0");
        }
        else
        {
            this.rezultatFinal.setText(rezultatFinal);
        }

    }

    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(this,message);
    }
}
