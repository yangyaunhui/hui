package spring02ouhe;

public class Menthod02OuheTest {
    //工厂类，工厂模式，spring 创建 bean 的底层 工厂模式
        public static Usb getInstance(String beanName) {
            Usb usb = null;
            try {
                usb = (Usb) Class.forName(beanName).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return usb;
        }

    }


