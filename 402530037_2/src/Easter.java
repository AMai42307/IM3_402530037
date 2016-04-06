
public class Easter {

	static String calculateEaster(int year) {
		int month, day;
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		double k = Math.floor(year / 100);
		double p = Math.floor((13 + 8 * k) / 25);
		double q = Math.floor(k / 4);

		// 這邊將他轉型成int, 有沒有可能會造成計算的一些偏差呢?
		int m = (int) (15 - p + k - q) % 30;
		int n = (int) (4 + k - q) % 7;

		int d = (19 * a + m) % 30;
		int e = (2 * b + 4 * c + 6 * d + n) % 7;
		
		if ((d + e - 9) <= 0) {
			month = 3;
			day = 22 + d + e;
		} else {
			month = 4;

			if ((d == 29) && (e == 6) && (d + e - 9 == 26)) {
				day = 19;
			}

			else if ((d == 28) && (e == 6) && (11 * m + 11) % 30 < 19) {
				day = 18;
			} else {
				day = d + e - 9;
			}

		}

		return "In " + year + ", Easter Sunday is: month= " + month + " and day= " + day;
	}
}
