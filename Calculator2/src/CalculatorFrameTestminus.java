import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorFrameTestminus {

	@Test
	void test() {

		CalculatorFrame test = new CalculatorFrame();
		double rand = (double) (Math.random() * 100);
		double rand2 = (double) (Math.random() * 100);
		double output2 = test.computeAnother(Double.toString(rand) + "-" + Double.toString(rand2));
		double eclipseCalculatorOutput2 = rand - rand2;
		assertEquals(Double.toString(eclipseCalculatorOutput2), (Double.toString(output2)));

	}

}
