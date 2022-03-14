package ma.education.tp2.reflection.rappel;

public class ConnectionDB {

	String url;
	String user;
	String password;

	private ConnectionDB() {
		System.out.println("Signature");
	}
	
	public ConnectionDB(String url, String user, String password) {
		
		this.url = url;
		this.user = user;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionDB [url=" + url + ", user=" + user + ", password=" + password + "]";
	}

	


	
	

}
