import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutomatedTests {

  // Begin return tests
  @Test
  public void getArea5X3() {
    double length = 5.0;
    double width = 3.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getAreaPiXPi() {
    double length = 3.1415;
    double width = 3.1415;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea1850X3650() {
    double length = 1850.0;
    double width = 3650.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea42X13() {
    double length = 42.0;
    double width = 13.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea677X832() {
    double length = 67.7;
    double width = 832.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea677X864() {
    double length = 67.7;
    double width = 86.4;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea11x4135() {
    double length = 11.0;
    double width = 4135.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea1870X5500() {
    double length = 1870.0;
    double width = 5500.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  @Test
  public void getArea1989X2023() {
    double length = 1989.0;
    double width = 2023.0;
    double expectedArea = length * width;

    LandingZone landingZone = new LandingZone();
    double actualArea = landingZone.getArea(length, width);

    assertEquals(expectedArea, actualArea, 0.001); // 0.001 is the delta for double comparison precision
  }
  //@Test
  /*public void checkForLoop() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("StarFieldGenerator.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("while(") || line.contains("while (") || line.contains("for(") || line.contains("for (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You must use a while loop or a for loop to solve this challenge. The test was unable to find either.");
    }
  }*/
  @Test
  public void checkForExit() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("LandingZone.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("System.exit(")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to close the program.");
    }
  } 
  @Test
  public void checkForGetLength() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("LandingZone.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("getLength(")||line.contains("getLength (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to use a method named getLength.");
    }
  }
  @Test
  public void checkForGetWidth() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("LandingZone.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("getWidth(")||line.contains("getWidth (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to use a method named getWidth.");
    }
  }
  @Test
  public void checkForGetArea() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("LandingZone.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("getArea(")||line.contains("getArea (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to use a method named getArea.");
    }
  }
  @Test
  public void checkForDisplayData() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("LandingZone.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("displayData(")||line.contains("displayData (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to use a method named displayData.");
    }
  }
}
