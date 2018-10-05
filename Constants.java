package examples;

public class Constants {

	public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
	public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
	public static final float NaN = 0.0f / 0.0f;

	public static void main(String[] args) {
		System.out.println(POSITIVE_INFINITY);
		System.out.println(NEGATIVE_INFINITY);
		System.out.println(NaN);

	}

}
