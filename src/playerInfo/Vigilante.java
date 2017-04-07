package playerInfo;
/**
 * The vigilante is a town member that may kill
 * Any player at night.
 * @author Elvin Limpin 30018832
 */


public class Vigilante extends Town{

	/**
	 * Constructor passes values to player while
	 * creating a vigilante role
	 * @param name
	 * @param position
	 * @param role
	 */
	public Vigilante(String name, int position) {
		super(name, position);
	}
	
	/**
	 * Used for continuing saved games
	 * @param name
	 * @param position
	 * @param status
	 * @param isLynched
	 */
	public Vigilante(String name, int position, int status, boolean isLynched){
		super(name, position, status, isLynched);
	}
	
	/**
	 * Copy constructor
	 * @param v
	 */
	public Vigilante(Vigilante v){
		super(v);
	}
	
	/**
	 * Unique action of vigilante
	 * @param p
	 */
	@Override
	public int doAction(Player p){
		if(getStatus()!=0 && getInBar()!=1){
			return 2;
		}
		return p.getStatus();
	}
	
	@Override
	public String toString() {
		return getRole()+ " " + getName();
	}
	
	/**
	 * returns the role name
	 */
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return "Vigilante";
	}

	/**
	 * returns the role information
	 * for directions
	 */
	@Override
	public String getRoleInfo() {
		// TODO Auto-generated method stub
		return "May kill new person each night";
	}

	/**
	 * returns the goal of the role
	 */
	@Override
	public String getRoleGoal() {
		// TODO Auto-generated method stub
		return "Lynch all Mafia to win the game";
	}
	
	
}
