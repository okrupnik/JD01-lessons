package by.htp.jd01.unit6.main;

import by.htp.jd01.unit6.controller.Controller;
import by.htp.jd01.unit6.entity.Note;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();

		String requestLogin = controller.doAction("LOGIN_USER ; login=Fisher ; password=345qwer4");
		System.out.println(requestLogin);

		String requestLogin2 = controller.doAction("LOGIN_USER ; login=ponchik ; password=12345");
		System.out.println(requestLogin2);

		String requestAddNote = controller.doAction("CREATE_NOTE ; idUser=2 ; newContent=You want to sleep!!! ; day=6 ;  month=12 ; year=2017");
		System.out.println(requestAddNote);

		String requestAddNote2 = controller.doAction("CREATE_NOTE ; idUser=3 ; newContent=You want to sleep!!! ; day=13 ;  month=8 ; year=2016");
		System.out.println(requestAddNote);

		String requestFindText = controller.doAction("FIND_NOTE ; idUser=1 ; login=Fisher ; password=345qwer4 ; text=array");
		System.out.println(requestFindText);

		String requestFindText2 = controller.doAction("FIND_NOTE ; idUser=1 ; login=Fisher ; password=345qwer4 ; text=tretrgf");
		System.out.println(requestFindText2);

	}

}
