

public class User{
	
	    private Integer id;
	    private String name;
	    private String email;
	    private String username;
	    private String password;
	    private UserType userType;
		
		public User(Integer id, String name, String email, String username, String password, UserType userType) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.username = username;
			this.password = password;
			this.userType = userType;
		}
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	    
		public UserType getUserType() {
			return userType;
		}

		public void setUserType(UserType userType) {
			this.userType = userType;
		}
}
