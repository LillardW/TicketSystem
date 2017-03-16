
public class Account {
	private String Account;
	private String Password;
	private String Email;

	Account(String Account, String Password, String Email) {
		this.Account = Account;
		this.Password = Password;
		this.Email = Email;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
