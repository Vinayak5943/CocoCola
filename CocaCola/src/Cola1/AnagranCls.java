package Cola1;

import java.util.Arrays;

public class AnagranCls {

	public static void main(String[] args) {
          String word="Listen";//
          String wordd="Silent";
          
          word=word.toLowerCase();
          wordd = wordd.toLowerCase();
          char[] wor = word.toCharArray();
          char[] worr = wordd.toCharArray();
                 
          
          int len =wor.length; 
          int lenn=worr.length;
          
          if(len==lenn) {
        	  for(int i=0;i<len;i++) {
        		  for(int j=i+1;j<len;j++) {
        			 if(wor[i]>wor[j]) {
        			char temp = wor[j];
        				wor[j]= wor[i];
        				wor[i] =temp;
        			 }
        		  } 
        	  }
        	  for(int k=0;k<lenn;k++) {
        		  for(int t=k+1;t<lenn;t++) {
        			  if(worr[k]>worr[t]) {
        				  char pemt = worr[t];
        				   worr[t] =worr[k];
        				   worr[k]=pemt;
        			  }
        		  }
        	  }
        	  System.out.println(Arrays.toString(wor));
              System.out.println(Arrays.toString(worr));
              if(Arrays.equals(wor,worr)) {
            	  System.out.println("given String is Anagram");
              }
          //  if(String.valueOf(wor).equals(String.valueOf(worr))) {
            	//System.out.println(wor);
            	//System.out.println(worr);
            //	System.out.println("given Strings are Anagram");
           // }
            else {
            	System.out.println("given Strings are not Anagram");
            }
          }
          else {
        	  System.out.println("given Strings are not Anagram");
          } 
          
	}
}
