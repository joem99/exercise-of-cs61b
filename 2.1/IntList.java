public class IntList {
	public int first;
	public IntList rest;
	/** constructor of the Intlist class. */
	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}
	/** size of the list. */
	public int size() {
		if(rest == null) {
			return 1;
		}
		else {
			return 1 + this.rest.size();
		}
	}
	/** return the ith item of the list. */
	public int get(int i) {
		if(i == 0) {
			return first;
		}
		else {
			return rest.get(i-1);
		}
	}
}