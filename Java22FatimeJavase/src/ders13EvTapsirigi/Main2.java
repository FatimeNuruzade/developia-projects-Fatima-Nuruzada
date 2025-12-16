package ders13EvTapsirigi;

public class Main2 {
	public static void main(String[] args) {
		
	
	 Notification[] notifications = new Notification[2];
     notifications[0] = new EmailNotif();
     notifications[1] = new SmsNotif();

     for (Notification notif : notifications) {
         notif.send();
     }

     notifications[0].info();
     notifications[1].info();
 }
}
