package day05;

public class EX01 {
    public static void main(String[] args) {
        // 블루투스(스피커)마이크
        // interface or abstract class: 다중 상속을 위해 interface 사용
        //  -> 블루투스 스피커: BGM(음악)
        //  -> 마이크: 노래를 부를 수 있음
        // class BluetoothMic
        //  -> 음악도 나오고,
        //  -> 노래도 부를 수 있고

        BluetoothMic bluetoothMic = new BluetoothMic();

        bluetoothMic.bgm("bgm");
        bluetoothMic.sing();
    }
}

interface Speaker {
    void bgm(String music);
}

interface Mic {
    void sing();
}

class BluetoothMic implements Speaker, Mic {

    @Override
    public void bgm(String music) {
        System.out.printf("블루투스 마이크로 '%s'을/를 재생합니다.\n", music);
    }

    @Override
    public void sing() {
        System.out.println("블루투스 마이크로 노래를 부릅니다.");
    }
}