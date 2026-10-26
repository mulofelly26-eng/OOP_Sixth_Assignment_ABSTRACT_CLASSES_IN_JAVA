abstract class MedicalStaff {
    protected String employeeId;
    protected String department;
    protected double workingHours;

    public MedicalStaff(String employeeId, String department, double workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void displayBaseDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Department    : " + department);
        System.out.println("Working Hours : " + workingHours + " hrs/week");
    }

    public abstract void performDuties();
}
class Doctor extends MedicalStaff {
    private String specialization;

    public Doctor(String employeeId, String department, double workingHours, String specialization) {
        super(employeeId, department, workingHours);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Role          : Doctor");
        System.out.println("Specialization: " + specialization);
        System.out.println("Duty          : Diagnosing patients, prescribing treatments, and performing medical procedures.");
    }
}