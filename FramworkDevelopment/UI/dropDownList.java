package UI;

import javax.swing.*;

public class dropDownList 

{
    public static void main(String[] args) 
    
    {
        String[] optionsToChoose = {"TC_00_1-NTB Lead Creation", "TC_00_2-NTB Lead Appointment", "TC_003-NTB Docs Collection", "TC_005-NTB Fill Account Details","TC_006-NTB Lead Processing"};

        String getFavFruit = (String) JOptionPane.showInputDialog(
                null,
                "Which testcase do you like to execute",
                "Choose Tescase",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[3]);

        System.out.println("Your chosen fruit: " + getFavFruit);
    }
}