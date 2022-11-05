package day22inheritancepolymorphism;
/*
    1)Java'da Object oluştururken Constructor'lar Parent'dan Child'a doğru çalıştırılır.
    2)Java en üst Parent Constructor'a çıkabilmek için "super()" kodunu kullanır.
    3)"super()" kodu her Constructor'ın "ilk satırında" "gizli" olarak bulunur.
    4)"super()" kodunu isterseniz görünür şekilde de yazabilirsiniz. Java kızmaz.
    5)"super()" kodunu görünür şekilde yazarsanız sakın ha ilk satır dışında bir satıra koymayınız, hata verir.
    6)"super()" kodu Parent Class'dan Constructor çağırmaya yarar.
 */

public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

    }
}
