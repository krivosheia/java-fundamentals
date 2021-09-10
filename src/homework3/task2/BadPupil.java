package homework3.task2;

public class BadPupil extends Pupil {

    @Override
    public void study(){
        System.out.println("Pupil studies bad");
    }

    @Override
    public void read(){
        System.out.println("Pupil read bad");
    }

    @Override
    public void write() {
        System.out.println("Pupil write bad");
}

    @Override
    public void relax() {
        System.out.println("Pupil relax excellent");
                }
}
