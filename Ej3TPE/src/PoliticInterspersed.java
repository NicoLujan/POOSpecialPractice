import java.util.List;

public class PoliticInterspersed extends Politic {
	private int intercalado = 0;
	
	public Queue getQueue(List<Object> q) {
		if(q.size()-1 == intercalado) {
			intercalado = 0;
			return (Queue)q.get(q.size()-1);
		}else {
			intercalado++;
			return (Queue)q.get((intercalado)-1);
		}
	}
	
}
