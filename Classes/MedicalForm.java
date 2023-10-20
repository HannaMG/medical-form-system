package Classes;

/**
 * Need to change this to contain only program skeleton
 */
public class MedicalForm {
    private String name;
    private int dob;
    private String address;
    private String condition;
    private int alienNumber;
    private int medicalFormID;
    static private int nextID = 0;

    public MedicalForm(String name, int dob, String address, String condition, int alienNumber, int medicalFormID) {
       this.name = name;
        this.dob = dob;
        this.address = address;
        this.condition = condition;
        this. alienNumber = alienNumber; 
        this.medicalFormID = medicalFormID;
    }

    static public int CreateNewMedicalFormID(String name, int dob, String address, String condition, int alienNumber) {
        MedicalForm form = new MedicalForm(name, dob, address, condition, alienNumber, nextID);

        //Add form to database

        return  nextID++;
    }

    public MedicalForm GetMedicalForm(int medicalFormID) {
        //Validate id 
        return this;
    }

    public boolean ValidateMedicalForm() {
        return true; //Need to change ???
    }

}
