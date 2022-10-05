package sall.lamine.calculatrice.Calculatrice.model;

public class Calcul {
	
	/*
	 *  {
		    "n1": 3,
		    "n2": 5,
		    "operation": "plus",
		    "result": 8
		  }
	 */
	
	private Integer n1;
	private Integer n2;
	private String operation;
	private Double result;
	
	public Calcul() {
		
	}
	
	public Calcul(Integer n1, Integer n2, String operation, Double result) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.operation = operation;
		this.result = result;
	}

	public Integer getN1() {
		return n1;
	}

	public void setN1(Integer n1) {
		this.n1 = n1;
	}

	public Integer getN2() {
		return n2;
	}

	public void setN2(Integer n2) {
		this.n2 = n2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
}
