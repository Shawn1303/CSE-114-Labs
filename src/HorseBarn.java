
public class HorseBarn {
	private Horse[] spaces;
	private int horses;

	public HorseBarn() {
		this.spaces = new Horse[0];
		this.horses = 0;
	}

	public int findHorseSpace(String name) {
		for (int i = 0; i < this.spaces.length; i++) {
			if (this.spaces[i].getName() == name) {
				return i;
			}
		}
		return -1;
	}

	public void consolidate() {
		int temp = 0;
		boolean swap = false;
		for (int i = 0; i < this.spaces.length; i++) {
			if (this.spaces[i] == null) {
				temp = i;
				swap = true;
			}
			if (swap) {
				if (this.spaces[i] != null) {
					this.spaces[temp] = this.spaces[i];
					swap = false;
					this.spaces[i] = null;
				}
			}
		}
		Horse[] sub = new Horse[horses];
		for (int i = 0; i < horses; i++) {
			sub[i] = this.spaces[i];
		}
		this.spaces = sub;
	}

	public void add(Horse horse) {
		boolean sameName = false;
		for (int i = 0; i < this.spaces.length; i++) {
			if (horse.getName() == this.spaces[i].getName()) {
				sameName = true;
			}
		}
		if (!sameName) {
			horses++;
			Horse[] sub = new Horse[horses];
			for (int i = 0; i < this.spaces.length; i++) {
				sub[i] = this.spaces[i];
			}
			sub[horses - 1] = horse;
			this.spaces = sub;
		}
	}


	public void remove(Horse horse) {
		horses--;
		for (int i = 0; i < this.spaces.length; i++) {
			if (this.spaces[i].getName() == horse.getName() && this.spaces[i].getWeight() == horse.getWeight())
				this.spaces[i] = null;
		}
	}

	public void getSpaces() {
		for (Horse horse : this.spaces) {
			System.out.println(horse.getName() + " " + horse.getWeight());
		}
	}

}
