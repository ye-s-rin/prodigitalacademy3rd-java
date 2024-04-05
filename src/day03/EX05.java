package day03;

public class EX05 {
    public static void main(String[] args) {
        // OTT: Netflix, Tving
        // printOpeningLogo(): sout "넷플" "티빙"
        // netflix.play() -> printOpeningLogo() "영상 시작"
        // netflix.finish(): sout "다 봤다~"

        Netflix netflix = new Netflix();
        Tving tving = new Tving();

        netflix.play();
        netflix.finish();

        tving.play();
        tving.finish();
    }
}

abstract class OTT {
    abstract void printOpeningLogo();

    void play(){
        printOpeningLogo();
        System.out.println("영상 시작");
    }

    void finish(){
        System.out.print("다 봤다~\n\n");
    }
}

class Netflix extends OTT{
    @Override
    void printOpeningLogo(){
        System.out.println("넷플");
    }
}

class Tving extends OTT{
    @Override
    void printOpeningLogo(){
        System.out.println("티빙");
    }
}