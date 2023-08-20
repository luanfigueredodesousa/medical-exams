import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
public abstract class exams {
    protected String name;
    protected String typeBlood;
    protected int birthdayYear;

    public exams() {
    }

    public exams(String patientname, String typeBlood, int birthday) {
        this.name = name;
        this.typeBlood = typeBlood;
        this.birthdayYear = birthday;
    }

    public int age() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int age = year - birthdayYear;
        return age;
    }

    public abstract void sortResult(String name, String typeBlood, int birthday, int amountGlucose);
}