package day24tatickeywordencapsulation;

//Encapsulation: "Date Hidding(Gizlemek)" demektir.
//Data'yi neden gizlersiniz ? Data'yi dis etkenlerden korumak icin
//Data'yi nasil gizlersin ? Access Modifier'ini "private" yaparak gizleriz.
//Data'yi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?
//"get method'lar (getter)" olusturarak gizledigimiz datalari okunur hale getirebiliriz.
//Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method'lar (setter)" olusturarak gizledigimiz datalari degistirilir hale getirebiliriz.
//Variable'ın "data type" ı ile get method'un "return type" ı aynı olmalıdır.
//"get method"ları isimlendirirken "get + <variable name>" ancak variable'ın data type' ı "boolean" ise "is + <variable name>"

public class Student {
    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean ritired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRitired() {
        return ritired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRitired(boolean ritired) {
        this.ritired = ritired;
    }
}
