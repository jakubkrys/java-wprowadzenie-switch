class Options {
	public static void main(String[] args){
		double a = 5.5;
		double b = 2.6;
		char option = '%';
		
		switch(option){
			case '+': System.out.println(a+b);
			break;
			case '-': System.out.println(a-b);
			break;
			case '*': System.out.println(a*b);
			break;
			case '/': System.out.println(a/b);
			break;
			case '%': System.out.println(a%b);
			break;
		}
	}

}