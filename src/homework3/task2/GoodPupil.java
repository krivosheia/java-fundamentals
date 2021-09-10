package homework3.task2;

public class GoodPupil extends Pupil {

    @Override
    public void study(){
        System.out.println("Pupil studies good");
    }

    @Override
    public void read(){
        System.out.println("Pupil read good");
    }

    @Override
    public void write() {
        System.out.println("Pupil write good");
    }

    @Override
    public void relax() {
        System.out.println("Pupil relax bad");
    }
}
