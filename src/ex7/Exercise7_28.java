package ex7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exercise7_28 {

	public static void main(String[] args) {
		//�͸�Ŭ������ �����ϱ�
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		
	}

}

