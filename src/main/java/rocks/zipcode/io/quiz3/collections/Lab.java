package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    Student student;
    LabStatus labStatus;
    String labName;
    List<Lab> listOfLabs;

    public Lab() {
        student= new Student();
        this.listOfLabs= new ArrayList<>();
        labStatus=LabStatus.PENDING;
    }

    public Lab(String labName) {
        this.labName=labName;
        student= new Student();
        labStatus=LabStatus.PENDING;


    }

    public String getName() {
         return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus =labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}

