package test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		Map<String,String> map = new  HashMap();
		List ist  = new ArrayList<>();
		Arrays.sort();
			map.put("1", "1");
			String object = map.get("1");
			String objec1 = map.get("2");
			System.out.println(object);
		//Object object = new Object();
			String str = new String("wiwiiw  "+"\t"+"  sdas " +"\t");
			 str.trim();
			 Properties p = new Properties();
			 InputStream resource2 = Test.class.getResourceAsStream("/syss.properties");
			 System.out.println(Test.class.getResource("/"));;
			 
			 try {
				p.load(resource2);
				System.out.println(p.get("url"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//exce();
	}

	private static int exce() {
		int i = 0 ;
		int j = 2;
		i = j+2;
		
		if (i==0) {
			System.out.println(i);
			return i;
		}  
		if( i > 0 ) {
			System.out.println(i);
			return i;
		}
		return j;
	}
}