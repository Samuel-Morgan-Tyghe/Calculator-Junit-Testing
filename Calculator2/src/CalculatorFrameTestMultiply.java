import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorFrameTestMultiply {

	@Test
	void test() {

		CalculatorFrame test = new CalculatorFrame();
		double rand = (double) (Math.random() * 100);
		double rand2 = (double) (Math.random() * 100);
		double output3 = test.computeAnother(Double.toString(rand) + "*" + Double.toString(rand2));
		double eclipseCalculatorOutput3 = rand * rand2;
		assertEquals(Double.toString(eclipseCalculatorOutput3), (Double.toString(output3)));

	}

}
