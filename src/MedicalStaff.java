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
// Doctor class inherits properties and methods from MedicalStaff
class Doctor extends MedicalStaff {
    // Stores the doctor's area of medical specialization
    private String specialization;

    // Constructor initializes employee details and specialization
    public Doctor(String employeeId, String department, double workingHours, String specialization) {
        // Calls the parent class constructor to initialize common attributes
        super(employeeId, department, workingHours);

        // Assigns the specialization to the Doctor object
        this.specialization = specialization;
    }

    // Overrides the abstract method from the MedicalStaff class
    @Override
    public void performDuties() {
        // Displays the doctor's role
        System.out.println("Role          : Doctor");

        // Displays the doctor's specialization
        System.out.println("Specialization: " + specialization);

        // Displays the main duties performed by a doctor
        System.out.println("Duty          : Diagnosing patients, prescribing treatments, and performing medical procedures.");
    }
}
class Nurse extends MedicalStaff {
    private String shiftSchedule;

    public Nurse(String employeeId, String department, double workingHours, String shiftSchedule) {
        super(employeeId, department, workingHours);
        this.shiftSchedule = shiftSchedule;
    }
    @Override
    public void performDuties() {
        System.out.println("Role          : Nurse");
        System.out.println("Shift Schedule: " + shiftSchedule);
        System.out.println("Duty          : Monitoring patient vitals, administering medications, and providing bedside care.");
    }
}
class Pharmacist extends MedicalStaff {
    private String licenseNumber;

    public Pharmacist(String employeeId, String department, double workingHours, String licenseNumber) {
        super(employeeId, department, workingHours);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void performDuties() {
        System.out.println("Role          : Pharmacist");
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Duty          : Dispensing prescribed medications, checking for drug interactions, and managing pharmacy inventory.");
    }
}
class LabTechnician extends MedicalStaff {
    private String laboratorySection;

    public LabTechnician(String employeeId, String department, double workingHours, String laboratorySection) {
        super(employeeId, department, workingHours);
        this.laboratorySection = laboratorySection;
    }

    @Override
    public void performDuties() {
        System.out.println("Role          : Lab Technician");
        System.out.println("Lab Section   : " + laboratorySection);
        System.out.println("Duty          : Collecting biological specimens, running diagnostic laboratory tests, and recording test results.");
    }
}