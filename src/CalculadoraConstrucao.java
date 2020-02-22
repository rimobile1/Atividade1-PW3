
public class CalculadoraConstrucao {
	
	
	public static void main(String[] args) {
		
		   
	double raio = raio (6);
	
	System.out.println(raio);
	
    double pi = area (raio);
	
	System.out.println(pi);
	
    double total = resultado (6);
	
	System.out.println("Custo da piscina" + String.format("R$%.2f",total));
	
	int area = area (20,20);
	System.out.println(area);
	
	double construcao = areaconstruida (area, 50);
	System.out.println(construcao);
	
	double custocasa = custocasa (construcao);
	System.out.println("custo casa:" + String.format("R$%.2f",custocasa));
	
	//total
	
	double totalcusto = totalcusto(custocasa, total);
	System.out.println("Custo total da obra" + String.format("R$%.2f", totalcusto));
		
	}
	 public static double raio (double diametro) {
		 
		 return diametro / 2;
		 
	 }

public static double area(double raio) {
		 
		 return Math.PI * Math.pow(raio, 2);
		 
	 }
	 
public static double resultado (int diametro) {
	
	double raio = raio(diametro);
	double area = area(raio);
	return area * 75;
	 
}

public static int area(int larg, int compr) {
	return larg * compr;
	
}

public static double areaconstruida (int areatotal, int percentual) {
	return (areatotal * percentual)/100;
	
}

public static double custocasa (double construcao) {
	return construcao * 60;
	
}

public static double totalcusto (double custocasa,double total) {
	return custocasa + total;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
