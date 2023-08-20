public class Principal {
    public static void main(String[] args) {
        Glycemia glycemia = new Glycemia();
        glycemia.registerExam();
        glycemia.showResult();

        Cholesterol cholesterol = new Cholesterol();
        cholesterol.registerExam();
        cholesterol.showResult();

        Triglyceride triglicerideos = new Triglyceride();
        triglicerideos.registerExam();
        triglicerideos.showResult();
    }
}