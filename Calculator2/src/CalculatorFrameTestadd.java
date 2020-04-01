import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorFrameTestadd {

	@Test
	void test() {
//      Create 2 numbers to add
		CalculatorFrame test = new CalculatorFrame();
		double rand = (double) (Math.random() * 100);
		double rand2 = (double) (Math.random() * 100);
		double output = test.computeAnother(Double.toString(rand) + "+" + Double.toString(rand2));

		double eclipseCalculatorOutput = rand + rand2;

//		Double to string 
		assertEquals(Double.toString(eclipseCalculatorOutput), (Double.toString(output)));

	}

}
