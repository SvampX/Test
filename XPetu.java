class XPetu {
	String name;
	String rank;
	int lP;
	
	XPetu(String name) {
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setRank(String rank) {
		this.rank = rank;
	}

	String getRank() {
		return this.rank;
	}

	void setLP(int lP) {
		this.lP = lP;
	}

	int getLP() {
		return this.lP;
	}

	void represent() {
		System.out.println("I am " + getName() + " and I am " + getRank() + " my LP is " + getLP());
	}

}
