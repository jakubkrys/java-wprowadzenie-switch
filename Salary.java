class Salary {
	public static void main(String[] args){
		int salary = 2000;
		
		System.out.println("Salary: "+salary);
		System.out.println();
		
		switch(salary){
			case 100: 
			System.out.println("Increased salary: "+(salary+1000));
			System.out.println("Increase value: "+((1000*100/salary)+"%"));
			break;
			case 2000: 
			System.out.println("Increased salary: "+(salary+200));
			System.out.println("Increase value: "+((200*100/salary)+"%"));
			break;
			case 2500: 
			System.out.println("Increased salary: "+(salary+25));
			System.out.println("Increase value: "+((25*100/salary)+"%"));
			break;
		}
	}

}