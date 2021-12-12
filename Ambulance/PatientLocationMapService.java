/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Ambulance;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Deepak Khamkar
 */
public class PatientLocationMapService {
    private static final int MIN_ZOOMM = 0;
    private static final int MAX_ZOOMM = 21;
    
     /**
     * In map.html file default zoom value is set to 5.
     */
    private static int zoomVal = 5;

    public static void openMap(String coords,String loc) {
        
        String a = "var marker, i;\n\nfor (i = 0; i < locations.length; i++) {  \n  marker = new google.maps.Marker({\n\tposition: new google.maps.LatLng(locations[i][1], locations[i][2]),\n\tmap: map,\n\tlabel: locations[i][0], \n\toptimized: true\n });\n}";
      String b = "var locations = [";
      String c = "];\n";
       String d = "['ABC', -33.890542, 151.274856, 4],\n['Coogee Beach', -33.923036, 151.259052, 5]\n";
       String setMarkerScript = b + "["+coords+ "],"+ loc+  c + a;
       
        System.out.println(setMarkerScript);
        EngineOptions opt =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDJDKIKHWOX1U3PXOY2P0DPBSV2UGSQ7X45V01TXXE2EIKFS8QWQD29G8JX7OZ180C02").build();
        Engine eng = Engine.newInstance(opt);
        Browser brow = eng.newBrowser();

        SwingUtilities.invokeLater(() -> {
            BrowserView vieww = BrowserView.newInstance(brow);

            JButton zoomInButton = new JButton("Zoom In");
            zoomInButton.addActionListener(e -> {
                if (zoomVal < MAX_ZOOMM) {
                    brow.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript("map.setZoom(" +
                                    ++zoomVal + ")"));
                }
            });

            JButton zoomOutButton = new JButton("Zoom Out");
            zoomOutButton.addActionListener(e -> {
                if (zoomVal > MIN_ZOOMM) {
                    brow.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript("map.setZoom(" +
                                    --zoomVal + ")"));
                }
            });
            /*browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript(setMarkerScript));*/
            JButton setMarkerButton = new JButton("Show Markers");
            setMarkerButton.addActionListener(e ->
                    brow.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript(setMarkerScript)));
            
            /*JButton setMarkerButton = new JButton("Set Marker");
       setMarkerButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               
               browser.executeJavaScript("var myLatlng = new google.maps.LatLng(48.4431727,23.0488126);\n" +
                       "var marker = new google.maps.Marker({\n" +
                       "    position: myLatlng,\n" +
                       "    map: map,\n" +
                       "    title: 'Hello World!'\n" +
                       "});");
           }
       });*/

            JPanel toolBar = new JPanel();
            toolBar.add(zoomInButton);
            toolBar.add(zoomOutButton);
            toolBar.add(setMarkerButton);
          // toolBar.setLayout(new BorderLayout());

            JFrame frame = new JFrame("Google Maps");
             frame.setLayout(new BorderLayout());
            frame.add(toolBar, BorderLayout.NORTH);
            frame.add(vieww, BorderLayout.CENTER);
            frame.setSize(800, 500);
            frame.setVisible(true);
            
            String rootPath = System.getProperty("user.dir");
            brow.navigation().loadUrl("file://"+rootPath+"/map.html");
            
        });
    }
}
