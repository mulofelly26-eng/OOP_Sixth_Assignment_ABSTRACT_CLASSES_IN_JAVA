public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     MUKONO HOSPITAL MEDICAL STAFF MANAGEMENT     ");
        System.out.println("==================================================\n");

        MedicalStaff[] hospitalStaff = {
                new Doctor("DOC-101", "Surgery & Emergency", 45.0, "Cardiothoracic Surgery"),
                new Nurse("NUR-202", "Pediatrics", 40.0, "Night Shift"),
                new Pharmacist("PHM-303", "Pharmacy", 38.5, "LIC-98421"),
                new LabTechnician("LAB-404", "Pathology", 40.0, "Hematology")
        };

        for (MedicalStaff staff : hospitalStaff) {
            staff.displayBaseDetails();
            staff.performDuties();
            System.out.println("--------------------------------------------------");
        }
    }
}
