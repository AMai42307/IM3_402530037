/*
 * []
 * [TA's advise]
 * 1.�U���@�~�зǮɥ�.
 * 2.getWidth(),getHeight()�P����method���Ѫ��N�q���P, �o������2��.�@
 * */
class RectangleTester {

	double height, width, y, x;

	//RectangleTester(){this(-1,-1,-1,-1);}//�[�W�o�@��i�H���A�{���󧹾�(�����l��)
	
	RectangleTester(double rh, double rw, double rx, double ry) {
		this.height = rh;
		this.width = rw;
		this.x = rx;
		this.y = ry;
	}// �غc��

	//���o�e, ����ܦ��F�p��禡�O?
	public double getWidth() {
		double area;
		area = this.height * this.width;
		return area;
	}// ���n�禡

	public double getHeight() {
		double peri;
		peri = (this.height + this.width) * 2;
		return peri;
	}// �P���禡

	public String toString() {
		return "x=" + (int) this.x + ",y=" + (int) this.y + ",width=" + (int) this.width + ",height="
				+ (int) this.height;
	}// ��X�U���ƭ�

}// �@�~���������O

// �D�{��
public class homework1 {

	public static void main(String[] args) {

		RectangleTester r1 = new RectangleTester(18, 57, 15, 25);
		// �Ĥ@�ӯx��
		RectangleTester r2 = new RectangleTester(47, 60, 0, 12);
		// �ĤG�ӯx��

		// ��X
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
