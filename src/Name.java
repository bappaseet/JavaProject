
 enum Name {
		POOJA(1,"India"),
		BAPU(2,"Italy"),
		SUDIP(3,"pakistan"){
			public int getRoll(){
				return 0;
			}
			
			public String getCountry() {
				return "Not Available";
			}			
		},
		SANDEEP(4,"USA");
		
		private int roll;
		private String country;
		
		Name(int i, String str){
			this.roll=i;
			this.country = str;
		}
		public int getRoll(){
			return this.roll;
		}
		
		public String getCountry() {
			return this.country;
		}
}


