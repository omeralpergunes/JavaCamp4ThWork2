package kampjava4;

public class ValidationManager implements ValidationServices{

	public String approve(Player player) {
		
		if(player.getTcNo().length()<2) {
			
			return "Bu Alan� Bo� B�rakmay�n�z";
			
		} else {
			
			return"";
		}
	}
}
