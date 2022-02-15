package src;

public class ProdFib {
	protected static long[] productFib(int number) {
		long firstTerm = 0;
		long secondTerm = 1;
		long auxTerm;
		while (firstTerm * secondTerm < number) {
			auxTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = auxTerm;
		}
		if (firstTerm * secondTerm == number) {
			return new long[]{firstTerm, secondTerm, 1};
		}
		return new long[]{firstTerm, secondTerm, 0};
	}
}