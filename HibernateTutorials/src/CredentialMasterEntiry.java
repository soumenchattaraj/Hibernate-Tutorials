import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credintial_master",schema="login")

public class CredentialMasterEntiry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_id")
	private int numID;
	
	@Column(name="num_user_id_fk")
	private int numUserIdFK;
	
	@Column(name="txt_password")
	private String txtPassword;
	
	@Column(name="txt_user_name")
	private String txtUserName;
	
	@Column(name="bool_admin")
	private boolean boolAdmin;
	
	@Column(name="bool_secured")
	private boolean boolSecured;
	
	

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public int getNumUserIdFK() {
		return numUserIdFK;
	}

	public void setNumUserIdFK(int numUserIdFK) {
		this.numUserIdFK = numUserIdFK;
	}

	public String getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(String txtPassword) {
		this.txtPassword = txtPassword;
	}

	public String getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(String txtUserName) {
		this.txtUserName = txtUserName;
	}

	public boolean isBoolAdmin() {
		return boolAdmin;
	}

	public void setBoolAdmin(boolean boolAdmin) {
		this.boolAdmin = boolAdmin;
	}

	public boolean isBoolSecured() {
		return boolSecured;
	}

	public void setBoolSecured(boolean boolSecured) {
		this.boolSecured = boolSecured;
	}
	
	 

}
