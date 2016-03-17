/*
 * []
 * [TA's advise]
 * 1.下次作業請準時交.
 * 2.getWidth(),getHeight()與本身method提供的意義不同, 這部分扣2分.　
 * */
class RectangleTester {

	double height, width, y, x;

	//RectangleTester(){this(-1,-1,-1,-1);}//加上這一行可以讓你程式更完整(實踐物件初始化)
	
	RectangleTester(double rh, double rw, double rx, double ry) {
		this.height = rh;
		this.width = rw;
		this.x = rx;
		this.y = ry;
	}// 建構式

	//取得寬, 怎麼變成了計算函式呢?
	public double getWidth() {
		double area;
		area = this.height * this.width;
		return area;
	}// 面積函式

	public double getHeight() {
		double peri;
		peri = (this.height + this.width) * 2;
		return peri;
	}// 周長函式

	public String toString() {
		return "x=" + (int) this.x + ",y=" + (int) this.y + ",width=" + (int) this.width + ",height="
				+ (int) this.height;
	}// 輸出各項數值

}// 作業必須的類別

// 主程式
public class homework1 {

	public static void main(String[] args) {

		RectangleTester r1 = new RectangleTester(18, 57, 15, 25);
		// 第一個矩形
		RectangleTester r2 = new RectangleTester(47, 60, 0, 12);
		// 第二個矩形

		// 輸出
		System.out.println(r1.toString());
		System.out.println("Area=" + r1.getWidth());
		System.out.println("Perimeter=" + r1.getHeight());
		System.out.println();
		System.out.println(r2.toString());
		System.out.println("Area=" + r2.getWidth());
		System.out.println("Perimeter=" + r2.getHeight());
		System.out.println();
		System.out.println("End of Output!");
	}

}
