package yepyeni;

public class Bagli {
	Tek bas = null;
	Tek son = null;
	void basaEleman(int a) {
		Tek eleman = new Tek();
		eleman.veri = a;
		if (bas == null) {
			bas = eleman;
			son = eleman;
		}
		else {
			System.out.println("Basa Eleman Eklendi");
			eleman.next = bas;
			bas = eleman;
		}
	}
	void yazdir() {
		Tek ref = bas;
		while (ref != null) {
			System.out.println("------>" + ref.veri);
			ref = ref.next;
		}
	}
	void sonEkle(int b) {
		Tek eleman2 = new Tek();
		eleman2.veri = b;
		if (bas == null) {
			bas = eleman2;
			son = eleman2;
		}
		else {
			son.next = eleman2;
			eleman2 = son;
		}
	}
	void araEkle (int c , int d) {
		Tek eleman3 = new Tek();
		eleman3.veri = d;
		Tek ref2 = bas;
		int e = 0;
		while (e != c-1) {
			ref2 = ref2.next;
			e++;
		}
		eleman3.next = ref2.next;
		ref2.next = eleman3;
	}
}
