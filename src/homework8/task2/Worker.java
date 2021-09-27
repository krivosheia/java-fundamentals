package homework8.task2;

import java.time.Year;

public class Worker {
    private String surnameAndInitials;
    private String position;
    private int yearBeginningWork;
    public static final int CURRENT_YEAR = Year.now().getValue();

    private Worker(){
    }

    public static Worker valueOf(String surnameAndInitials, String position, int yearBeginningWork)
            throws IllegalArgumentException {

        Worker worker = new Worker();
        worker.setSurnameAndInitials(surnameAndInitials);
        worker.setPosition(position);
        worker.setYearBeginningWork(yearBeginningWork);
        worker.validate();

        return worker;
    }

    public void setSurnameAndInitials(String surnameAndInitials) {
        this.surnameAndInitials = surnameAndInitials;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setYearBeginningWork(int yearBeginningWork) {
        this.yearBeginningWork = yearBeginningWork;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public String getPosition() {
        return position;
    }

    public int getYearBeginningWork() {
        return yearBeginningWork;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surnameAndInitials='" + surnameAndInitials + '\'' +
                ", position='" + position + '\'' +
                ", yearBeginningWork=" + yearBeginningWork +
                '}';
    }

    private void validate() {
        if (yearBeginningWork < 1900 || yearBeginningWork > CURRENT_YEAR){
            throw new IllegalArgumentException("Год должен быть в пределах от 1900 до текущего");
        }
    }
}
