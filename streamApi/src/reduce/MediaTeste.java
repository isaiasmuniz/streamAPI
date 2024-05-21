package reduce;

public class MediaTeste {
	public static void main(String[] args) {
		Media m = new Media().add(8.3).add(6.7);
		Media m2 = new Media().add(7.9).add(6.6);
		
		System.out.println(m.getNota());
		System.out.println(m2.getNota());
		
		System.out.println(Media.combinar(m, m2).getNota());
	}

}
