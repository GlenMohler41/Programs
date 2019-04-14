import static org.junit.Assert.*;
import java.lang.reflect.Method;  

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarFactsTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	public File generateGivenInputFile() throws IOException {
		final String INPUT_FILENAME = "input.txt";
		File inputFile = folder.newFile(INPUT_FILENAME);
		PrintWriter write = new PrintWriter(inputFile);
		write.print("Honda Civic	450	20.1	17000	17.5	\n" + 
				"Ford Pinto	350	12.5	8000	2.3	\n" + 
				"Mercedes A220	400	20.5	75000	19.6	\n" + 
				"Toyota Sienna	300	17.5	36000	12.2	\n" + 
				"Kia Sorento	320	15.9	23000	13.4	\n" + 
				"Hyundai Santa Fe	330	13.6	25000	14.0	\n" + 
				"Audi R8	380	16.9	66000	19.4	\n" + 
				"Acura MDX	340	15.3	46000	18.5	");
		write.close();
		return inputFile;
	}

	@Test
	public void testCalcMileageRating() {
		int miles = 340;
		double size = 15.3;
		double result = CarFacts.calcMileageRating(miles, size);
		assertEquals("We", 22.22, result,.01);
	}
	
	@Test
	public void testCalcOverallValue() {
		double mileageRating = 22.22;
		double price = 46000.00;
		double drivability = 18.5;
		double result = CarFacts.calcOverallValue(mileageRating, price, drivability);
		assertEquals("We", 18412.40, result,.01);
	}
	
	@Test
	public void testdisplayData() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		StringWriter stringWriter = new StringWriter();
		PrintWriter out = new PrintWriter(stringWriter);
		// Invoke method
		String makeModel = "Acura MDX";
		double mileageRating = 22.22;
		double overallValue = 18412.40;
		CarFacts.displayData(makeModel, mileageRating, overallValue, out);
		out.close();
		// Check results
		
		String actual, expected;
		actual = stringWriter.toString();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "AcuraMDX22.22mpgValue:18412.40";
		assertEquals("Output is incorrect. we", expected, actual);
		
	
	}

}
