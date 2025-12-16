package ders13EvTapsirigi;

public class SmsNotif extends Notification{
@Override
void send() {
	System.out.println("sms gonderildi");
}
static void info() {
    System.out.println("Sms Notification");
}
}
