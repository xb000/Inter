public class Viber implements Mesenger, Application{
    @Override
    public void sentMesage() {
        System.out.println("out Viber");
    }

    @Override
    public void getMesage() {
        System.out.println("in Viber");
    }

    public class Client {
        private Mesenger mess;
        public Client(){
            this.mess = new Telegram();
        }
    }

    public class Smartphone{
        private Application app;
        public Smartphone(){
            this.app = new Telegram();
        }
    }
}
