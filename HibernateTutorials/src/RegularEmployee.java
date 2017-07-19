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
@DiscriminatorValue(value="regularEmployee")
public class RegularEmployee extends EmployeeDetails{
	
	
	@Column(name="salary")
	private int sal;
	
	@Column(name="bonus")
	private int bonus;

	
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
