package day27exceptions;

public class IllegalGradeException extends Exception{
    //Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exception" olur
    public IllegalGradeException(String message){
        super(message);
    }
}
