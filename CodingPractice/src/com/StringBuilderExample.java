package com;

public class StringBuilderExample {
	
	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder();

	        for (int i = 1; i <=5; i++) {
	            sb.append("Line ").append(i+"\n");
	        }

	        System.out.println("Result:\n" + sb);
	    }
	}


