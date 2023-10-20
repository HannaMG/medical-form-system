package Tests;

/**
 * Imports
 */
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import Classes.Workflow;
import Classes.MedicalForm;;

/**
 * Used to test Workflow.java
 */
public class WorkflowTest {
    @Test
    void getNextCompleteTest() {
        //assertEquals(greeting.getMessage(), "Hello world!");
        //assertThat(greeting.getMessage(), is("Hello World!")); 
        MedicalForm form = (); 
        Workflow.insertComplete(form);
    }

    @Test
    void getNextSavedTest() {

    }

    @Test
    void isSavedEmptyTest() {

    }

    @Test
    void isCompleteEmptyTest() {

    }

    @Test
    void insertCompleteTest() {

    }

    @Test
    void insertSavedTest() {

    }

    @Test
    void getNextStepsMessageTest() {

    }

    @Test
    void insertNextStepsTest() {

    }
}
