import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorFrameTestDivide {

	@Test
	void test() {

		CalculatorFrame test = new CalculatorFrame();
		double rand = (double) (Math.random() * 100);
		double rand2 = (double) (Math.random() * 100);
		double output4 = test.computeAnother(Double.toString(rand) + "/" + Double.toString(rand2));
		double eclipseCalculatorOutput4 = rand / rand2;
		assertEquals(Double.toString(eclipseCalculatorOutput4), (Double.toString(output4)));

	}

}
