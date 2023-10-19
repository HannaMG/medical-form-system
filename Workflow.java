/**
 * Imports
 */
import java.util.ArrayList;
import java.util.Queue;

/**
 * Workflow stores and gives Data Entry and Approver the next available medical form ID to work on.
 * Database passes medical form IDs to the Workflow.
 * Can also be used by approver to retrieve next steps message.
 */
public class Workflow {
    Queue<Integer> completeQueue; //Stores completed medical form IDs
    Queue<Integer> savedQueue; //Stores saved medical form IDs
    ArrayList<String[]> nextStepsList; //Stores medical conditions and next steps messages available
    boolean savedEmpty; //Indicates whether the savedQueue is empty or not
    boolean completeEmpty; //Indicates whether the completeQueue is empty or not

    /**
     * Returns the next completed medical form ID available in the completeQueue.
     * @return next completed medical form ID 
     */
    int getNextComplete() {
        return 0;
    }

    /**
     * Returns the next saved medical form ID available in the savedQueue.
     * @return next saved medical form ID
     */
    int getNextSaved() {
        return 0;
    }

    /**
     * Checks if savedQueue is empty.
     * @return true if savedQueue is empty, false otherwise
     */
    boolean isSavedEmpty() {
        return false;
    }

    /**
     * Checks if completeQueue is empty.
     * @return true if completeQueue is empty, false otherwise
     */
    boolean isCompleteEmpty() {
        return false;
    }

    /**
     * Inserts complete medical form ID to completeQueue.
     * @param form completed medical form whose ID will be inserted
     * @return true if insert is successful, false otherwise
     */
    boolean insertComplete(MedicalForm form) {
        return false;
    }

    /**
     * Inserts saved medical form ID to savedQueue.
     * @param form saved medical form whose ID will be inserted
     * @return true if insert is successful, false otherwise
     */
    boolean insertSaved(MedicalForm form) {
        return false;
    }

    /**
     * Returns corresponding next steps message based on inputted medical condition.
     * @param condition medical condition 
     * @return corresponding next steps message or empty String if none is available for that medical condition
     */
    String getNextStepsMessage(String condition) {
        return "";
    }

    /**
     * Inserts a new medical condition along with its corresponding next steps message to nextStepsList.
     * @param condition medical condition
     * @param message corresponding next steps message
     * @return true if insert is successful, false otherwise
     */
    boolean insertNextSteps(String condition, String message) {
        return false;
    }
}
