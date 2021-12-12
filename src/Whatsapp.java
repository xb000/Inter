public class Whatsapp implements Mesenger, Application{
    @Override
    public void sentMesage() {
        System.out.println("out Whatsapp");
    }

    @Override
    public void getMesage() {
        System.out.println("in Whatsapp");
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
