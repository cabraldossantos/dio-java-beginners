public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.on);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("Novo estado -> TV ligada? " + smartTv.on);

        smartTv.toSwitchOff();
        System.out.println("Novo estado -> TV ligada? " + smartTv.on);

        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();
        System.out.println("Novo estado do volume: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.channel);
        smartTv.changeChannel(13);
        System.out.println("Canal atual: " + smartTv.channel);
        smartTv.increaseChannel();
        System.out.println("Canal atual: " + smartTv.channel);
        
    }
}
