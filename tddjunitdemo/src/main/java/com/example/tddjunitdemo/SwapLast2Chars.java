package com.example.tddjunitdemo;

public class SwapLast2Chars {

	public String swap(String string) {
		int len=string.length();
		if(len>=2)
			string=string.substring(0,len-2)+
			string.charAt(len-1)+
			string.charAt(len-2);
		return string;
	}
    
}
