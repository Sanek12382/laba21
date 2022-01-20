package view;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class RemovalView {
    private JFrame removalWindow;

    private JTextField fullNameField;
    private JTextField doctorNameField;
    private JTextField conclusionField;

    private JSpinner birthDateField;
    private JSpinner lastVisitDateField;

    private JButton removalButton;
    private JLabel removalInfo;

    public RemovalView() {
        removalWindow = new JFrame();
        constructUI();
    }

    private void constructUI() {
        GridLayout layoutUI = new GridLayout(0, 1);
        Font mainFont = new Font("Times Roman", Font.PLAIN,23);
        JPanel panelUI = new JPanel(layoutUI);

        fullNameField = new JTextField();
        fullNameField.setFont(mainFont);

        doctorNameField = new JTextField();
        doctorNameField.setFont(mainFont);

        conclusionField=new JTextField();
        conclusionField.setFont(mainFont);

        SimpleDateFormat model = new SimpleDateFormat("dd/MM/yyyy");
        birthDateField = new JSpinner(new SpinnerDateModel());
        birthDateField.setFont(mainFont);
        birthDateField.setEditor(new JSpinner.DateEditor(birthDateField, model.toPattern()));

        birthDateField = new JSpinner(new SpinnerDateModel());
        birthDateField.setFont(mainFont);
        birthDateField.setEditor(new JSpinner.DateEditor(birthDateField, model.toPattern()));

        lastVisitDateField = new JSpinner(new SpinnerDateModel());
        lastVisitDateField.setFont(mainFont);
        lastVisitDateField.setEditor(new JSpinner.DateEditor(lastVisitDateField, model.toPattern()));

        lastVisitDateField = new JSpinner(new SpinnerDateModel());
        lastVisitDateField.setFont(mainFont);
        lastVisitDateField.setEditor(new JSpinner.DateEditor(lastVisitDateField, model.toPattern()));

        JPanel fullNamePanel = new JPanel(new GridLayout(1, 2));
        fullNamePanel.add(new JLabel("Имя: "));
        fullNamePanel.add(fullNameField);
        panelUI.add(fullNamePanel);

        JPanel doctorNamePanel = new JPanel(new GridLayout(1, 2));
        doctorNamePanel.add(new JLabel("Фио врача: "));
        doctorNamePanel.add(doctorNameField);
        panelUI.add(doctorNamePanel);

        JPanel conclusionPanel = new JPanel(new GridLayout(1, 2));
        conclusionPanel.add(new JLabel("Заключение: "));
        conclusionPanel.add(conclusionField);
        panelUI.add(conclusionPanel);

        JPanel birthDatePanel = new JPanel(new GridLayout(1, 2));
        birthDatePanel.add(new JLabel("Дата рождения: "));
        birthDatePanel.add(birthDateField);
        panelUI.add(birthDatePanel);

        JPanel lastVisitPanel = new JPanel(new GridLayout(1, 2));
        birthDatePanel.add(new JLabel("Дата приёма: "));
        birthDatePanel.add(lastVisitDateField);
        panelUI.add(lastVisitPanel);

        removalButton = new JButton("Удалить");
        panelUI.add(removalButton);

        removalInfo = new JLabel("");
        removalInfo.setFont(new Font("Times Roman", Font.PLAIN,30));

        removalWindow.add(panelUI, BorderLayout.NORTH);
        removalWindow.add(removalInfo, BorderLayout.CENTER);
    }

    public JFrame getFrame() { return removalWindow; }

    public JButton getRemovalButton() { return removalButton; }

    public JTextField getFullNameField() { return fullNameField; }

    public JTextField getDoctorNameField() { return doctorNameField; }

    public JSpinner getBirthDateField() { return birthDateField; }

    public JLabel getRemovalInfo() { return removalInfo; }

    public JSpinner getLastVisitDateField() { return lastVisitDateField; }

    public JTextField getConclusionField() { return conclusionField; }

}

