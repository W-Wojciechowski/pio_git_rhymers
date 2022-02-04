package edu.kis.vh.nursery;

/**
 *
 * Klasa tworzy obiekt defaultCountingOutRhymer w którym tablica z liczbami będzie first in first out
 */
public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

	/**
	 * Metoda nadpisana z klasy rodzimej, implementuje zachowanie first out
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
