package test;

/**
 * **************************************************
 * @author angel
 * @date 2 February 2021
 * @project EcommerceCucumberJava
 * **************************************************
 */

import org.apache.xmlbeans.impl.regex.Match;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import page.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ECommerceCucumberTestCases {

    private String transactionMessage = "Transaction is completed.";
    private String actualTransactionStatus = "Pending";

    @Rule
    public TestName name = new TestName();


    @Test
    public void testSample(){

        String actualTransactionMessage = "Transaction TN1230001 was successfully completed.";

        String subStr = actualTransactionMessage.substring(12, 25);
        System.out.println("SubStr: " + subStr);

        String regEx = "(TN\\d+)";
        Pattern pattern = Pattern.compile(regEx);
        Matcher match = pattern.matcher(actualTransactionMessage);

        while(match.find()){
            System.out.println("matched group: " + match.group(1));
        }


        /*
        String strLowerCase = transactionMessage.toLowerCase();
        System.out.println("Lower " + strLowerCase);

        String strUpperCase = transactionMessage.toUpperCase();
        System.out.println("Upper " + strUpperCase);

        Home.viewHome();
        Product.viewProduct();
        */

    } // end method testSample

    @Test
    public void testSampleOne(){


        /*
        String actualTransactionMessage = "Transaction TN101 was successfully submitted.";
        String actualTransaction2 = "Sample ";
        String[] str = actualTransactionMessage.split("TN");

        System.out.println("Length: " + str.length);
        System.out.println("Not an Array result: " + actualTransaction2.concat(actualTransactionMessage));

        try {
            System.out.println("Split 0: " + str[0]);
            System.out.println("Split 1: " + str[1]);
            System.out.println("Concat: " + str[0].concat(str[1]));
        }catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/

/*
        String expected = "ABC Ltd";
        String actualBusinessName = "    ABC Ltd    ";

        System.out.println("Before trim: " + actualBusinessName);
        try {
            System.out.println("After trim: " + actualBusinessName.trim());
        }catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/
/*
        String actualBusinessName = "ABC Ltd";
        String regEx = "^[a-zA-Z. ]+$";

        try {
            boolean name = actualBusinessName.matches(regEx);
            System.out.println("name - " + name);

            Assert.assertTrue(Pattern.matches(regEx, actualBusinessName));
            System.out.println("Test passed - " + name);
        }catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/
/*
        String expected = null;
        boolean nullValue = (expected != null);
        System.out.println("Null value: " + nullValue);
        try {
            Assert.assertNull(expected);
            System.out.println("Test passed");
        }catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/
        /*
        String expected = "";
        boolean empty = expected.isEmpty();
        try {
            Assert.assertTrue(empty);
            System.out.println("Test passed");
        } catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/
        /*
        String expectedTransactionStatus = "pending";
        try {
            Assert.assertTrue(expectedTransactionStatus.equalsIgnoreCase(actualTransactionStatus));
            System.out.println("Test passed");
        }catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/
/*
        String expectedMessage = "successfully completed";
        boolean actualMessage = transactionMessage.contains(expectedMessage);
        try {
            Assert.assertTrue(actualMessage);
            System.out.println("Test passed");
        }catch (AssertionError e){
            System.out.println("Test failed");
            Assert.fail();
        }
*/
    } // end method testSampleOne()

} // end class ECommerceCucumberTestCases
