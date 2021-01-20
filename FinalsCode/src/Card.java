
public class Card {

		private int value;
		private String name;
		
		public Card ( int newValue, String suit) {
		}
			public Card(String name, int value) {
				 this.name = name;
				 this.value = value;
				}	
			
			public int getValue() {
				return value;
			}
			public void setValue(int value) {
				this.value = value;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public boolean describe() {
				System.out.println("name: " + this.name);
				System.out.println("value: " + this.value);
				return true;
			}
		
}
