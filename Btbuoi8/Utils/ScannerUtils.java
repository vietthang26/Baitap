package Utils;

import java.util.Scanner;

public class ScannerUtils {
	public static int readInt(Scanner input, String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(input.nextLine());
			} catch (Exception ex) {
				showError(errorMessage);
			}
		}
	}

	public static float readFloat(Scanner input, String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(input.nextLine());
			} catch (Exception ex) {
				showError(errorMessage);
			}
		}
	}

	public static double readDouble(Scanner input, String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(input.nextLine());
			} catch (Exception ex) {
				showError(errorMessage);
			}
		}
	}
	public static String readString(Scanner input, String erroMessage) {
		while (true) {
			try {
				String a = input.nextLine();
				if (a!=null || !a.isEmpty()) {
					return a;
				}
			} catch (Exception ex) {
				showError(erroMessage);
			}
		}
	}

	public static int readInt(Scanner input, String errorMessage, int min, int max) {
		while (true) {
			try {
				int a = Integer.parseInt(input.nextLine());
				if (a < min || a > max) {
					System.out.printf("Bạn phải nhập 1 số nằm trong khoảng (%d,%d)\n",min,max);
					System.out.println("Mời bạn nhập lại: ");
				} else
					return a;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	public static float readFloat(Scanner input, String errorMessage, float min, float max) {
		while (true) {
			try {
				float a = Float.parseFloat(input.nextLine());
				if (a < min || a > max) {
					System.out.printf("Bạn phải nhập 1 số nằm trong khoảng (%d,%d)\n",min,max);
					System.out.println("Mời bạn nhập lại: ");
				} else
					return a;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	public static double readDouble(Scanner input, String errorMessage, double min, double max) {
		while (true) {
			try {
				double a = Double.parseDouble(input.nextLine());
				if (a < min || a > max) {
					System.out.printf("Bạn phải nhập 1 số nằm trong khoảng (%d,%d)\n",min,max);
					System.out.println("Mời bạn nhập lại: ");
				} else
					return a;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}

	private static void showError(String message) {
		System.out.println("Error: " + message);
		System.out.print("Mời bạn nhập lại: ");
	}
}
