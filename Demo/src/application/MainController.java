/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code generate's random numbers between 1-50 and prints.
 *   Project:	Random Numbers 
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 * ***********************************************************/


package application;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label myMessage;
	
    @FXML
    public void generateRandom(ActionEvent event) {
        Random rm = new Random();
        int myrm = rm.nextInt(50) + 1;
        myMessage.setText(Integer.toString(myrm));
        System.out.println(Integer.toString(myrm)); // to convert from numbers into string text
    }
}
