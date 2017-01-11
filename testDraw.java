
import javax.swing.JButton;


public class testDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SurfaceDessin panel = new SurfaceDessin();
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		app.add( panel );
		app.setSize(1100, 1200);
		app.setVisible(true);

	}

}
