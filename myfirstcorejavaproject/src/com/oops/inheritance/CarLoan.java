package com.oops.inheritance;

public class CarLoan extends LoanImpl {
	void carLoan() {
		System.out.println("All documents are verified");
	}

	public static void main(String[] args) {
		CarLoan cl = new CarLoan();
		cl.carLoan();
		if (cl.getAge() > 25 && cl.getCibilscore() >= 300 && cl.getSalary() >= 30000 && cl.isAddaarvalid()
				&& cl.isPanValid() && cl.isPhnoeValide()) {

			System.out.println("congratulations you are eligible for home loan");
			System.out.println("your rate of intrest is:" + cl.getRoi());

		} else {
			System.out.println("focuson your career");
			System.out.println("soryy for inconvineancve");
		}

		// TODO Auto-generated method stub

	}

}
