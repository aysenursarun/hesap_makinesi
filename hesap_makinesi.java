package hesap_makinesi;

import java.util.Scanner;

public class hesap_makinesi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = scan.nextInt();

		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = scan.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Yapmak istediğiniz işlemi seçin: ");
		int secim = scan.nextInt();

		switch (secim) {

		case 1:
			int toplam = sayi1 + sayi2;
			System.out.print("Toplam: " + toplam);
			break;

		case 2:
			int fark = sayi1 - sayi2;
			System.out.print("Fark: " + fark);
			break;

		case 3:
			int carpim = sayi1 * sayi2;
			System.out.print("Çarpım: " + carpim);
			break;

		case 4:
			if (sayi2 != 0) {
				int bolum = sayi1 / sayi2;
				System.out.print("Bölüm: " + bolum);
			} else {
				System.out.print("Bir sayı 0'a bölünemez.");
			}
			break;

		default:
			System.out.print("Yanlış seçim yaptınız. Tekrar deneyin: ");

		}
	}

}
