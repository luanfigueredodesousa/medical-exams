import javax.swing.*;

public class Cholesterol extends exams {
    private double amountLDL;
    private double amountHDL;
    private char risk;
    private String result;

    public Cholesterol() {
        super("", "", 0);
        collect();
    }
    private void collect() {
        name = JOptionPane.showInputDialog("Nome: ");
        typeBlood = JOptionPane.showInputDialog("Digite o tipo do sangue: ");
        birthdayYear = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        amountHDL = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de LDL: "));
        amountLDL = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de HDL: "));
        risk = JOptionPane.showInputDialog("B - baixo, M - medio e A - alto").charAt(0);
    }
    @Override
    public void sortResult(String name, String typeBlood, int birthday, int amountGlucose) {
            if (risk == 'B') {
                System.out.println("Colesterol LDL: " + amountLDL + " (abaixo de 100 mg/dL)");
                System.out.println("Colesterol HDL: " + amountHDL + " (HDL - BOM)");
            } else if (risk == 'M') {
                System.out.println("Colesterol LDL: " + amountLDL + " (abaixo de 70 mg/dL)");
                System.out.println("Colesterol HDL: " + amountHDL + " (HDL - BOM)");
            } else if (risk == 'A') {
                System.out.println("Colesterol LDL: " + amountLDL + " (abaixo de 50 mg/dL)");
                System.out.println("Colesterol HDL: " + amountHDL + " (HDL - BOM)");
            }
        }

    public void registerExam() {
        String ldlClassification;
        if (risk == 'B') {
            ldlClassification = (amountLDL < 100) ? "Bom" : "Ruim";
        } else if (risk == 'M') {
            ldlClassification = (amountLDL < 70) ? "Bom" : "Ruim";
        } else {
            ldlClassification = (amountLDL < 50) ? "Bom" : "Ruim";
        }

        String hdlClassification;
        if (age() <= 19) {
            hdlClassification = (amountHDL > 45) ? "Bom" : "Ruim";
        } else {
            hdlClassification = (amountHDL > 40) ? "Bom" : "Ruim";
        }

        this.result = "Colesterol LDL: " + amountLDL + " (" + ldlClassification + ")\n"
                + "Colesterol HDL: " + amountHDL + " (" + hdlClassification + ")";
    }
    public void showResult() {
        String message = "Nome: " + this.name + "\n" + this.result;
        JOptionPane.showMessageDialog(null, message);
    }
}