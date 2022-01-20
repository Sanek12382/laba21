package view;

import javax.swing.*;
import java.awt.*;


public class OptionsView {
    private JFrame optionsWindow;


    private JSpinner rowsSpiner;
    

    private JButton inputButton;
    
    public OptionsView(){
        optionsWindow=new JFrame();
       constructUI();

    }

    private void constructUI() {
        GridLayout layoutUI = new GridLayout(0, 1);
        layoutUI.setVgap(5);

        Font mainFont = new Font("Times Roman", Font.PLAIN,23);
        JPanel panelUI = new JPanel(layoutUI);
        rowsSpiner = new JSpinner(new SpinnerNumberModel());
        rowsSpiner.setEditor(new JSpinner.NumberEditor(rowsSpiner));

        JPanel rowsSpinnerPanel=new JPanel(new GridLayout(1, 2));
        rowsSpinnerPanel.add(new JLabel("Число рядов в таблице:"));
        rowsSpinnerPanel.add(rowsSpiner);
        panelUI.add(rowsSpinnerPanel);

        inputButton=new JButton("Принять");
        panelUI.add(inputButton);

        optionsWindow.add(panelUI);
    }

    public JFrame getFrame() { return optionsWindow; }

    public JButton getInputButton() { return inputButton; }

    public JSpinner getRowsSpiner() { return rowsSpiner; }


}
