
//Input.java
//Fonte: Introducao ao Java / Peter Jandl Junior

import java.io.*;

public final class Input {

  public static float readFloat() {
    try {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  return Float.parseFloat(br.readLine());
	} catch (Exception e) {
	  return 0;
	}
  }
  
    public static int readInteger() {
    try {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  return Integer.parseInt(br.readLine());
	} catch (Exception e) {
	  return 0;
	}
  }
  
    public static String readString() {
    try {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  return br.readLine();
	} catch (Exception e) {
	  return "";
	}
  }
}
