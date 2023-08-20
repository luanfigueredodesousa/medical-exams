import javax.swing.*;

public class Glycemia extends exams {
    private double amountGlucose;
    private String result;

    public Glycemia() {
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
        amountGlucose = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de glicose: "));
    }

    public void registerExam() {
        if (amountGlucose < 100) {
            this.result = "Normoglicemia";
        } else if (amountGlucose >= 100 && amountGlucose < 126) {
            this.result = "Pré-diabetes";
        } else {
            this.result = "Diabetes";
        }
    }
    public void showResult() {
        String message = "Nome: " + this.name + "\nResultado: " + amountGlucose + "\nClassificação: " + this.result;
        JOptionPane.showMessageDialog(null, message);
    }
}