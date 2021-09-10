package homework3.task2;

import java.util.Arrays;

public class ClassRoom {
    private Pupil[] arrPupils;

    public ClassRoom(Pupil[] arrPupils){
        this.arrPupils = arrPupils;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "arrPupils=" + Arrays.toString(arrPupils) +
                '}';
    }

    public Pupil[] getArrPupils() {
        return arrPupils;
    }
}
