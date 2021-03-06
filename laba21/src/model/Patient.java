package model;

public class Patient {
    String fullName;


    Date birthDate;
    Date appointDate;

    String doctorName;
    String conclusion;

    public Patient() {}

    public Patient(String fullName,  Date birthDate, Date appointDate,
                   String doctorName, String conclusion) {

        this.fullName = fullName;


        this.birthDate = birthDate;
        this.appointDate = appointDate;

        this.doctorName = doctorName;
        this.conclusion = conclusion;
    }

    public String getFullName() { return fullName; }


    public Date getBirthDate() { return birthDate; }
    public Date getAppointDate() { return appointDate; }

    public String getDoctorName() { return doctorName; }
    public String getConclusion() { return conclusion; }

    public void setFullName(String fullName) { this.fullName = fullName; }


    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
    public void setAppointDate(Date appointDate) { this.appointDate = appointDate; }

    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public void setConclusion(String conclusion) { this.conclusion = conclusion; }

    public Object[] toObject() { return new Object[]{fullName,  birthDate, appointDate, doctorName, conclusion}; }
}
