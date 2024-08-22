
package pos;
import JPanal.LoginPortal;
import JPanal.Loading;
import java.util.logging.Level;
import java.util.logging.Logger;
public class POS {
    public static void main(String[] args) {
       Loading load =new Loading();
       load.setVisible(true);
        for(int i=0;i<=100;i++){
           try {
               load.loadingnum.setText(String.valueOf(i));
               load.ProgressBar.setValue(i);
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               System.out.println(ex.getMessage());
           }
      }
        load.setVisible(false);
        load.dispose();
        new LoginPortal().setVisible(true);
    }
    
}
