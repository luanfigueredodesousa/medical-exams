import javax.swing.*;

public class Triglyceride extends exams {
    private double triglyceride;
    private String result;

    public Triglyceride() {
        super("", "", 0);
        collect();
    }

    @Override
    public void sortResult(String name, String typeBlood, int birthday, int amountGlucose) {

    }

    private void collect() {
        name = JOptionPane.showInputDialog("Nome: ");
        typeBlood = JOptionPane.showInputDialog("Digite o tipo do sangue: ");
        birthdayYear = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        triglyceride = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de triglicerídeos: "));
    }

    public void registerExam() {
        String triglyceridesClassification;
        if (age() <= 9) {
            triglyceridesClassification = (triglyceride < 75) ? "Bom" : "Ruim";
        } else if (age() <= 19) {
            triglyceridesClassification = (triglyceride < 90) ? "Bom" : "Ruim";
        } else {
            triglyceridesClassification = (triglyceride < 150) ? "Bom" : "Ruim";
        }

        this.result = "Triglicerídeos: " + triglyceride + " (" + triglyceridesClassification + ")";
    }
    public void showResult() {
        String message = "Nome: " + this.name + "\n" + this.result;
        JOptionPane.showMessageDialog(null, message);
    }
}