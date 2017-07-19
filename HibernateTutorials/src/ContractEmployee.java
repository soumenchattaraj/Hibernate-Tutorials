import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 */

/**
 * @author SS
 * Hibernate Inheritance Mapping
 * Table per hierarchy : Single Table
 *
 */
@Entity
@DiscriminatorValue(value="contractEmployee")
public class ContractEmployee extends EmployeeDetails{
	
	@Column(name="pay_per_hour")
	private int payPerHour;
	
	@Column(name="contract_duration")
	private int contractDuration;

	
	
	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}
	
	

}
