import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import java.net.URI;
import java.util.Arrays;

public class BotJava {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure


    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+15558675310"),
                        new com.twilio.type.PhoneNumber("+15017122661"),
                        "Здравствуйте,вас интересно данное предложение?\n" +
                                "Работа \uD83D\uDD25еженедельная оплата \uD83D\uDCB0 \n" +
                                "Вакансия Оператор в Call Center\uD83D\uDC69\uD83C\uDFFC\u200D\uD83D\uDCBB\uD83E\uDDD1\uD83C\uDFFC\u200D\uD83D\uDCBB\n" +
                                "ОТ Вас: \n" +
                                "✅Желание зарабатывать \n" +
                                "✅Грамотная русская речь\n" +
                                "✅От 18 до 27 лет\n" +
                                "ДЛЯ Вас:\n" +
                                "✅Еженедельная оплата от 5000\uD83D\uDCB0 \n" +
                                "✅Перерыв на обед+кофе брейки \n" +
                                "✅Можно без опыта работы\n" +
                                "✅Центр города ( рядом метро)\n" +
                                "✅Работаем в карантин так же \n" +
                                "✅Помощь с жильём для иногородних \n" +
                                "Пиши в ЛС @Anetkasss ждём тебя в нашей команде\uD83D\uDCAA")
                .setMediaUrl(
                        Arrays.asList(URI.create("img")))
                .create();

        System.out.println(message.getSid());
    }
}