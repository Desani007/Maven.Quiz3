package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> listOfLabs;

    LabStatus labStatus;



    public Student() {
        listOfLabs= new ArrayList<>();
        this.labStatus=LabStatus.PENDING;
    }

    public Student(List<Lab> labs) {
     this.listOfLabs=labs;

    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
